plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "ca.barrenechea.stickyheaders"
    compileSdk = 33

    defaultConfig {
        applicationId = "ca.barrenechea.stickyheaders"
        minSdk = 21
        //noinspection OldTargetApi
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(project(":lib"))
    implementation("androidx.fragment:fragment:1.5.7")
    implementation("androidx.recyclerview:recyclerview:1.3.0")
}
