plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.google.gms.google.services)
    id("kotlin-kapt")
//    id("com.chaquo.python")
//    id("com.google.devtools.ksp") version "1.9.0-1.0.13"
}

android {
    namespace = "com.Hardik.Arogyam2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.Example.Arogyam2"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    viewBinding {
        enable = true
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.firebase.auth)
    implementation(libs.firebase.database)
    implementation(libs.firebase.storage)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.tools.core)
    implementation(libs.kotlin.stdlib)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("com.google.ai.client.generativeai:generativeai:0.9.0")
    implementation(libs.kotlinx.coroutines.android)
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("com.google.android.gms:play-services-auth:20.7.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.github.bumptech.glide:glide:4.15.1")
    annotationProcessor("com.github.bumptech.glide:compiler:4.15.1")
    implementation(libs.firebase.bom)
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("androidx.fragment:fragment-ktx:1.8.6") // or the latest version
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation("de.hdodenhof:circleimageview:3.1.0")
    implementation(libs.lottie)
    implementation("org.mindrot:jbcrypt:0.4")
    implementation("com.github.KwabenBerko:News-API-Java:1.0.2")
    implementation("com.github.bumptech.glide:glide:4.12.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
//    ksp("com.github.bumptech.glide:compiler:4.12.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.0")
//    implementation("com.chaquo.python:gradle:15.0.1")
}