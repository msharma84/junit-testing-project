# Junit5 Testing Project 

## JUnit5 Tutorials

This version of the JUnit framework is being re-constructed to make it adaptive for Java 8. As JUnit is one of the most preferred among java developers to build and execute test cases,
so after the advancement of the Java 8 the old version of JUnit lacking features to test Java 8 code and most notably Lamda expressions. JUnit 5 has adapted Java 8 style of coding
and several other features.

JUnit 5 is composed of several different modules from three different sub-projects

	JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

		JUnit Platform
				To be able to launch junit tests, IDEs, build tools or plugins need to include and extend platform APIs. It defines the TestEngine API for developing new testing 
				frameworks that runs on the platform.
				It also provides a Console Launcher to launch the platform from the command line and build plugins for Gradle and Maven.
	
		JUnit Jupiter
				It includes new programming and extension models for writing tests. It has all new junit annotations and TestEngine implementation to run tests written with these
				annotations.
	
		JUnit Vintage
				It primary purpose is to support running JUnit 3 and JUnit 4 written tests on the JUnit 5 platform. It’s there are backward compatibility.
