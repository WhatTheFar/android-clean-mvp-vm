object Modules {
    val domain = ":domain"
    val data = ":data"
}

object Releases {
    val application_id = "com.whatthefar.clean_mvp_vm"
    val version_code = 44
    val version_name = "4.0.9"
}

object Versions {

    val kotlin = "1.2.61"

    // Android Config
    val compile_sdk = 28
    val min_sdk = 16
    val target_sdk = 28

    // Android Support
    val support = "28.0.0-rc01"
    val constraint_layout = "1.1.2"

    // Google Play Services
    val maps = "15.0.1"
    val location = "15.0.1"
    val oss_licenses = "16.0.0"

    // Android Arch
    val lifecycle = "1.1.1"

    // Core
    val inject = "1"
    val dagger = "2.16"
    val rx_java = "2.1.12"
    val rx_android = "2.1.0"
    val rx_kotlin = "2.3.0"
    val timber = "4.7.1"

    val retrofit = "2.4.0"
    val logging_interceptor = "3.11.0"

    val easy_permissions = "1.2.0"
    val rx_paper = "1.2.0"
    val moshi = "1.4.0"

    // Testing
    val junit = "4.12"
    val android_test_runner = "1.0.2"
    val android_test_espresso = "3.0.2"

    val assertj_core = "3.9.1"
    val mockito_kotlin = "1.5.0"
}

object Libraries {
    val inject = "javax.inject:javax.inject:${Versions.inject}"

    // Kotlin
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    // Android
    val lifecycle = "android.arch.lifecycle:extensions:${Versions.lifecycle}"
    val lifecycle_compiler = "android.arch.lifecycle:compiler:${Versions.lifecycle}"

    // Dagger
    val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    val dagger_android = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    val dagger_android_compiler = "com.google.dagger:dagger-android-processor:${Versions.dagger}"

    // RxJava & RxAndroid
    val rx_java = "io.reactivex.rxjava2:rxjava:${Versions.rx_java}"
    val rx_android = "io.reactivex.rxjava2:rxandroid:${Versions.rx_android}"
    val rx_kotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rx_kotlin}"

    // Retrofit
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val gson_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val moshi_converter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    val rx_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor}"

    // Others
    val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    val easy_permissions = "pub.devrel:easypermissions:${Versions.easy_permissions}"
    val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    val rx_paper = "com.github.pakoito:RxPaper2:${Versions.rx_paper}"
}

object SupportLibraries {
    val appcompat_v7 = "com.android.support:appcompat-v7:${Versions.support}"
    val constraint_layout = "com.android.support.constraint:constraint-layout:${Versions.constraint_layout}"
    val support_v4 = "com.android.support:support-v4:${Versions.support}"
    val design = "com.android.support:design:${Versions.support}"
    val cardview_v7 = "com.android.support:cardview-v7:${Versions.support}"
    val recyclerview_v7 = "com.android.support:recyclerview-v7:${Versions.support}"
    val support_annotations = "com.android.support:support-annotations:${Versions.support}"
    val support_compat = "com.android.support:support-compat:${Versions.support}"
    val support_core_ui = "com.android.support:support-core-ui:${Versions.support}"
}

object GooglePlayServiceLibraries {
    val maps = "com.google.android.gms:play-services-maps:${Versions.maps}"
    val location = "com.google.android.gms:play-services-location:${Versions.location}"
    val oss_licenses = "com.google.android.gms:play-services-oss-licenses:${Versions.oss_licenses}"
}

object TestLibraries {
    val junit = "junit:junit:${Versions.junit}"
    val android_test_runner = "com.android.support.test:runner:${Versions.android_test_runner}"
    val android_test_espresso = "com.android.support.test.espresso:espresso-core:${Versions.android_test_espresso}"

    val assertj_core = "org.assertj:assertj-core:${Versions.assertj_core}"
    val mockito_kotlin = "com.nhaarman:mockito-kotlin:${Versions.mockito_kotlin}"
    val lifecycle_testing = "android.arch.core:core-testing:${Versions.lifecycle}"
}

object JetpackVersions {
    // https://developer.android.com/topic/libraries/support-library/refactor
    val appcompat = "1.0.0-rc01"
    val lifecycle = "2.0.0-rc01"
    val constraint_layout = "1.1.2"

    val junit = "4.12"
    val android_test_runner = "1.1.0-alpha4"
    val android_test_espresso = "3.1.0-alpha4"

    val ktx_core = "1.0.0-rc01"
    val ktx_fragment = "1.0.0-rc01"
    val ktx_lifecycle_viewmodel = "2.0.0-rc01"
}

object JetpackLibraries {
    val appcompat = "androidx.appcompat:appcompat:${JetpackVersions.appcompat}"
    val constraint_layout = "androidx.constraintlayout:constraintlayout:${JetpackVersions.constraint_layout}"
    val lifecycle = "androidx.lifecycle:lifecycle-extensions:${JetpackVersions.lifecycle}"

    val ktx_core = "androidx.core:core-ktx:${JetpackVersions.ktx_core}"
    val ktx_fragment = "androidx.fragment:fragment-ktx:${JetpackVersions.ktx_fragment}"
    val ktx_lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${JetpackVersions.ktx_lifecycle_viewmodel}"

}

object JetpackTestLibraries {
    val junit = "junit:junit:${JetpackVersions.junit}"
    val android_test_runner = "androidx.test:runner:${JetpackVersions.android_test_runner}"
    val android_test_espresso = "androidx.test.espresso:espresso-core:${JetpackVersions.android_test_espresso}"
}



