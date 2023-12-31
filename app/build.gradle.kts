plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.curiousapps.myfoodapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.curiousapps.myfoodapp"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.10")

    val compat = "1.6.1"
    implementation("androidx.appcompat:appcompat:$compat")
    implementation("com.google.android.material:material:$compat")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.7.2")

    implementation("androidx.constraintlayout:constraintlayout:2.0.4")

    implementation("androidx.ui:ui-tooling:1.0.0-alpha07")

    //Compose
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")

    val composeStuff = "1.4.3"
    implementation("androidx.compose.foundation:foundation:$composeStuff")
    implementation("androidx.compose.runtime:runtime-livedata:$composeStuff")
    implementation("androidx.compose.material:material:$composeStuff")
    implementation("androidx.compose.material:material-icons-core:$composeStuff")
    implementation("androidx.compose.material:material-icons-extended:$composeStuff")

    //FragNav
    val fragNav = "2.6.0"
    implementation("androidx.navigation:navigation-fragment-ktx:$fragNav")
    implementation("androidx.navigation:navigation-ui-ktx:$fragNav")

    //Retrofit
    val retro = "2.9.0"
    implementation("com.squareup.retrofit2:retrofit:$retro")
    implementation("com.squareup.retrofit2:converter-gson:$retro")

    //Dagger
    val dagger = "2.28.3"
    implementation("com.google.dagger:dagger:$dagger")
    kapt("com.google.dagger:dagger-compiler:$dagger")

    val hilt = "2.48.1"
    implementation("com.google.dagger:hilt-android:$hilt")
    kapt("com.google.dagger:hilt-compiler:$hilt")

    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")

    implementation("androidx.hilt:hilt-navigation:1.0.0")

    val glide = "4.11.0"
    implementation("com.github.bumptech.glide:glide:$glide")
    kapt("com.github.bumptech.glide:compiler:$glide")

    //Test
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}