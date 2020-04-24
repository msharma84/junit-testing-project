package com.msharma.junit.extension;

import static org.junit.jupiter.api.extension.ConditionEvaluationResult.disabled;
import static org.junit.jupiter.api.extension.ConditionEvaluationResult.enabled;
import static org.junit.platform.commons.support.AnnotationSupport.isAnnotated;
import static org.junit.platform.commons.support.ModifierSupport.isNotStatic;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.api.extension.TestWatcher;

/**
 * Extension that tracks whether a test failed in a test class, stores that
 * information in the root {@link ExtensionContext}, and skips
 * {@link Nested @Nested} test classes if they are annotated with
 * {@link SkipOnFailuresInEnclosingClass @SkipOnFailuresInEnclosingClass} and
 * the enclosing test class had test failures.
 *
 * @author Sam Brannen
 * @see SkipOnFailuresInEnclosingClass
 */

public class SkipOnFailuresInEnclosingClassExtension implements TestWatcher, ExecutionCondition{
	
	@Override
	public void testFailed(ExtensionContext context, Throwable cause) {
		// Track failures by test class name instead of test Class in order to
		// avoid holding onto Class references in the root ExecutionContext.Store
		// for the duration of the test suite.
		getStore(context).put(context.getRequiredTestClass().getName(), true);
	}

	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		Class<?> testClass = context.getRequiredTestClass();

		if (isInnerClass(testClass) && isAnnotated(testClass, SkipOnFailuresInEnclosingClass.class)) {
			String enclosingClassName = testClass.getEnclosingClass().getName();
			boolean failureInEnclosingClass = getStore(context).getOrDefault(enclosingClassName, boolean.class, false);
			if (failureInEnclosingClass) {
				return disabled("Failures detected in enclosing test class: " + enclosingClassName);
			}
			return enabled("No failures detected in enclosing test class: " + enclosingClassName);
		}

		return enabled(testClass.getName() + " is not a @SkipOnFailuresInEnclosingClass candidate");
	}

	private Store getStore(ExtensionContext context) {
		return context.getRoot().getStore(Namespace.create(getClass()));
	}

	private static boolean isInnerClass(Class<?> clazz) {
		return isNotStatic(clazz) && clazz.isMemberClass();
	}
}
