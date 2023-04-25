plugins {
    id("com.android.library")
    kotlin("android")
    `maven-publish`
}

android {
    namespace = "ca.barrenechea.widget.recyclerview.decoration"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
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

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }

    }
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.domyn"
            artifactId = "header-decor"
            version = "0.2.9"

            afterEvaluate {
                from(components["release"])
            }

        }
    }
}

dependencies {
    implementation("androidx.recyclerview:recyclerview:1.3.0")
    implementation("androidx.annotation:annotation:1.6.0")
}
