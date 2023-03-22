plugins {
	id("com.palantir.git-version") version "2.0.0"
}
val gitVersion: groovy.lang.Closure<String> by extra

allprojects {
	group = "dev.lisuk"
	version = gitVersion()
	repositories {
		mavenCentral()
	}
}

