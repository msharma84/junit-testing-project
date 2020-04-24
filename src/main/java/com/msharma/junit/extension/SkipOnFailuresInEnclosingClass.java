package com.msharma.junit.extension;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Nested;

/**
 * Class-level annotation which signals that the annotated {@link Nested @Nested}
 * test class should be skipped if the enclosing test class had test failures.
 *
 * <p>The enclosing test class must register the
 * {@link SkipOnFailuresInEnclosingClassExtension} in order for this annotation
 * to have any effect.
 *
 * @author Sam Brannen
 * @see SkipOnFailuresInEnclosingClassExtension
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SkipOnFailuresInEnclosingClass {
}
