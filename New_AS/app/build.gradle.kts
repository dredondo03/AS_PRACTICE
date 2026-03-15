plugins {
    alias(libs.plugins.android.application)
<<<<<<< HEAD
    alias(libs.plugins.kotlin.android)
=======
>>>>>>> 0dfa9243487714fa4e63038c52beaaa388f1068b
    alias(libs.plugins.kotlin.compose)
}

android {
<<<<<<< HEAD
    namespace = "com.example.new_as"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.new_as"
        minSdk = 24
        targetSdk = 34
=======
<<<<<<< HEAD
    namespace = "com.danielredondo.adelanto"
=======
    namespace = "com.danielredondo.scaffold"
>>>>>>> dee74de67e220b54985649c0c4199e4e159bdcb9
    compileSdk {
        version = release(36)
    }

    defaultConfig {
<<<<<<< HEAD
        applicationId = "com.danielredondo.adelanto"
=======
        applicationId = "com.danielredondo.scaffold"
>>>>>>> dee74de67e220b54985649c0c4199e4e159bdcb9
        minSdk = 26
        targetSdk = 36
>>>>>>> 0dfa9243487714fa4e63038c52beaaa388f1068b
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
<<<<<<< HEAD
    kotlinOptions {
        jvmTarget = "11"
    }
=======
>>>>>>> 0dfa9243487714fa4e63038c52beaaa388f1068b
    buildFeatures {
        compose = true
    }
}

dependencies {
<<<<<<< HEAD

=======
>>>>>>> 0dfa9243487714fa4e63038c52beaaa388f1068b
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
<<<<<<< HEAD
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
=======
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
>>>>>>> 0dfa9243487714fa4e63038c52beaaa388f1068b
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
<<<<<<< HEAD
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
=======
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
>>>>>>> 0dfa9243487714fa4e63038c52beaaa388f1068b
}