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

    const val kotlin = "1.3.31"

    // Android Config
    const val compile_sdk = 28
    const val min_sdk = 16
    const val target_sdk = 28

    // Android Support
    const val support = "1.0.0"
    const val constraint_layout = "1.1.2"

    // Google Play Services
    const val maps = "15.0.1"
    const val location = "15.0.1"
    const val oss_licenses = "16.0.0"

    // Android Arch
    const val lifecycle = "2.0.0"

    // Core
    const val inject = "1"
    const val dagger = "2.16"
    const val rx_java = "2.1.12"
    const val rx_android = "2.1.0"
    const val rx_kotlin = "2.3.0"
    const val timber = "4.7.1"

    const val retrofit = "2.4.0"
    const val logging_interceptor = "3.11.0"

    const val easy_permissions = "1.2.0"
    const val rx_paper = "1.2.0"
    const val moshi = "1.4.0"

    // Testing
    const val junit = "4.12"
    const val android_test_runner = "1.0.2"
    const val android_test_espresso = "3.2.0"

    const val assertj_core = "3.9.1"
    const val mockito_kotlin = "1.5.0"
}

object Libraries {
    const val inject = "javax.inject:javax.inject:${Versions.inject}"

    // Kotlin
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    // Android
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"

    // Dagger
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val dagger_android = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val dagger_android_compiler = "com.google.dagger:dagger-android-processor:${Versions.dagger}"

    // RxJava & RxAndroid
    const val rx_java = "io.reactivex.rxjava2:rxjava:${Versions.rx_java}"
    const val rx_android = "io.reactivex.rxjava2:rxandroid:${Versions.rx_android}"
    const val rx_kotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rx_kotlin}"

    // Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val moshi_converter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val rx_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor}"

    // Others
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val easy_permissions = "pub.devrel:easypermissions:${Versions.easy_permissions}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val rx_paper = "com.github.pakoito:RxPaper2:${Versions.rx_paper}"
}

object SupportLibraries {
    const val appcompat_v7 = "androidx.appcompat:appcompat:${Versions.support}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    const val support_v4 = "androidx.legacy:legacy-support-v4:${Versions.support}"
    const val design = "com.google.android.material:material:${Versions.support}"
    const val cardview_v7 = "androidx.cardview:cardview:${Versions.support}"
    const val recyclerview_v7 = "androidx.recyclerview.widget.RecyclerView:${Versions.support}"
    const val support_annotations = "androidx.annotation:annotation:${Versions.support}"
    const val support_compat = "androidx.core:core:${Versions.support}"
}

object GooglePlayServiceLibraries {
    const val maps = "com.google.android.gms:play-services-maps:${Versions.maps}"
    const val location = "com.google.android.gms:play-services-location:${Versions.location}"
    const val oss_licenses = "com.google.android.gms:play-services-oss-licenses:${Versions.oss_licenses}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
    const val android_test_runner = "com.android.support.test:runner:${Versions.android_test_runner}"
    const val android_test_espresso = "androidx.test.espresso:espresso-core:${Versions.android_test_espresso}"

    const val assertj_core = "org.assertj:assertj-core:${Versions.assertj_core}"
    const val mockito_kotlin = "com.nhaarman:mockito-kotlin:${Versions.mockito_kotlin}"
    const val lifecycle_testing = "android.arch.core:core-testing:${Versions.lifecycle}"
}

object JetpackVersions {
    // https://developer.android.com/topic/libraries/support-library/refactor
    const val appcompat = "1.0.0-rc01"
    const val lifecycle = "2.0.0-rc01"
    const val constraint_layout = "1.1.2"

    const val junit = "4.12"
    const val android_test_runner = "1.1.0-alpha4"
    const val android_test_espresso = "3.1.0"

    const val ktx_core = "1.0.0-rc01"
    const val ktx_fragment = "1.0.0-rc01"
    const val ktx_lifecycle_viewmodel = "2.0.0-rc01"
}

object JetpackLibraries {
    const val appcompat = "androidx.appcompat:appcompat:${JetpackVersions.appcompat}"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:${JetpackVersions.constraint_layout}"
    const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${JetpackVersions.lifecycle}"

    const val ktx_core = "androidx.core:core-ktx:${JetpackVersions.ktx_core}"
    const val ktx_fragment = "androidx.fragment:fragment-ktx:${JetpackVersions.ktx_fragment}"
    const val ktx_lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${JetpackVersions.ktx_lifecycle_viewmodel}"

}

object JetpackTestLibraries {
    const val junit = "junit:junit:${JetpackVersions.junit}"
    const val android_test_runner = "androidx.test:runner:${JetpackVersions.android_test_runner}"
    const val android_test_espresso = "androidx.test.espresso:espresso-core:${JetpackVersions.android_test_espresso}"
}



