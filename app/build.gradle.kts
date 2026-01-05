plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.histoiredunigeriv"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.histoiredunigeriv"
        minSdk = 24
        targetSdk = 36
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
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.cardview)
    implementation(libs.recyclerview)
    implementation(libs.legacy.support.v4)
    implementation(libs.viewpager2)
    implementation(libs.fragment)
   // implementation(libs.play.services.ads)
    implementation(libs.play.services.maps)
    implementation(libs.gridlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}