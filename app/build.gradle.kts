plugins {
    id ("com.android.application")
}

android {
    compileSdk = 34
    namespace ="com.zhiyun.demo"
    defaultConfig {

        applicationId = "com.zhiyun.demo"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        // abi filter
        // ndk {
        //     abiFilters += listOf("armeabi-v7a", "arm64-v8a", "x86", "x86_64", "mips", "mips64")
        // }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    buildFeatures {
        viewBinding= true
    }
}

dependencies {
     implementation(project(":devicesdk"))
    // implementation fileTree(include= ["*.jar", "*.aar"], dir: "libs")
    //  implementation(fileTree("dir" to "libs", "include" to listOf("*.jar", "*.aar")))
    //  implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar", "*.aar"))))
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.1")
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("com.google.code.gson:gson:2.8.7")
    implementation("com.polidea.rxandroidble2:rxandroidble:1.11.1")
    implementation("com.jakewharton.rx2:replaying-share:2.2.0")
}
