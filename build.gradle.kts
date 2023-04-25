buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.0")
        classpath(kotlin("gradle-plugin", version = "1.8.10"))
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
