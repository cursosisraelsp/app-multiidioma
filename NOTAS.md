# Pasando de Unity - Android Studio

## As carpetas ``libs``

Dentro da carpeta de exportación inicial de ``unityLibrary``, existe unha carpeta chamada libs, onde deberemos separar os arquivos con extensión `.aar`.

Deberemos crear unha carpeta dentro de ``app`` que chamaremos `libs`, deixando na carpeta de `unityLibrary` o arquivo `unity-classes.jar`

## Configuración iniciais

### O ``settings.gradle.kts``

O arquivo onde deberemos crear cómo arrancar a nosa ``app`` é o `settings.gradle.kts`, deberemos configuralo da seguinte maneira:

````kotlin
pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        // Para AAR locales
        flatDir {
            dirs("unityLibrary/libs")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Para AAR locales
        flatDir {
            dirs("unityLibrary/libs")
        }
    }
}

rootProject.name = "multiidioma"
include(":app")

include(":unityLibrary")
include(":unityLibrary:xrmanifest.androidlib")

// Apuntar correctamente a las carpetas si no están en la raíz
project(":unityLibrary").projectDir = File(rootDir, "unityLibrary")
project(":unityLibrary:xrmanifest.androidlib").projectDir = File(rootDir, "unityLibrary/xrmanifest.androidlib")
````

### O ``build.gradle.kts``
> Dentro desta configuración inicial, os arquivos más importantes son os seguintes:

-   ``build.gradle.kts`` , este arquivo está en dous lugares, como pode ser:
  - Na propia carpeta de ``app``
  - Na carpeta do propio proxecto

O de ``app``:

````kotlin
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("org.jetbrains.dokka") version "1.9.20"
}

android {
    namespace = "com.example.multiidioma"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.multiidioma"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        vectorDrawables.useSupportLibrary = true
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    // AndroidX Core y Lifecycle
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.compose)

    // Jetpack Compose
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.compose.runtime)
    implementation("androidx.compose.material:material-icons-core")
    implementation("androidx.compose.material:material-icons-extended")
    implementation(libs.androidx.material3)
    implementation("androidx.compose.material3:material3-adaptive-navigation-suite:1.5.0-alpha01")
    implementation("androidx.compose.ui:ui-text-google-fonts:1.8.1")
    implementation("androidx.navigation:navigation-compose:2.7.3")
    implementation(libs.androidx.navigation.runtime.android)

    // YouTube Player
    implementation("com.pierfrancescosoffritti.androidyoutubeplayer:core:12.1.0") {
        exclude(group = "com.android.support")
    }

    // Google Maps Compose y Play Services
    implementation("com.google.maps.android:maps-compose:4.3.0")
    implementation("com.google.android.gms:play-services-maps:19.0.0")

    // SVG con Coil
    implementation("io.coil-kt:coil-compose:2.4.0")
    implementation("io.coil-kt:coil-svg:2.4.0")

    // Unity
    implementation(project(":unityLibrary"))
    //implementation fileTree(dir: 'libs', include: ['*.jar','*.aar'])
    implementation(fileTree("libs") {
        include("*.jar", "*.aar")
    })
    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)

    // Debug
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}


````


O de ``multidioma``:

````kotlin
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}
````

### A carpeta `unityLybrary`

Podemos ver na carpeta de ``unityLybrary`` o arquivo de `build.gradle`, neste caso non está en `Kotlin`, senon en `Groovy`.

Teremos que ter en conta tamén , o que está ligado a ```xrmanifest.androidlib```:

````groovy
apply plugin: 'com.android.library'

dependencies {
    implementation fileTree(dir: 'bin', include: ['*.jar'])
    implementation fileTree(dir: 'libs', include: ['*.jar'])
}

android {
    namespace "com.UnityTechnologies.XR.Manifest"
    compileSdk 34
    buildToolsVersion = "34.0.0"

    defaultConfig {
        minSdk 29
        targetSdk 34
    }

    lint {
        abortOnError false
    }

    sourceSets {
        main {
            manifest.srcFile 'AndroidManifest.xml'
            //java.srcDirs = ['src']
            res.srcDirs = ['res']
            assets.srcDirs = ['assets']
            jniLibs.srcDirs = ['libs']
        }
    }
}
````

Así como tamén o da propia carpeta:

````groovy
apply plugin: 'com.android.library'
apply from: '../shared/keepUnitySymbols.gradle'

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])

    //implementation(name: 'arcore_client', ext:'aar')
    //implementation(name: 'UnityARCore', ext:'aar')
    //implementation(name: 'VuforiaEngine', ext:'aar')
    //implementation(name: 'ARPresto', ext:'aar')
    //implementation(name: 'unityandroidpermissions', ext:'aar')
    implementation project(':unityLibrary:xrmanifest.androidlib')
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'androidx.core:core:1.9.0'
    implementation 'androidx.games:games-activity:3.0.5'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
}

android {
    namespace "com.unity3d.player"
    ndkPath "C:/Program Files/Unity/Hub/Editor/6000.0.49f1/Editor/Data/PlaybackEngines/AndroidPlayer/NDK"
    ndkVersion "27.2.12479018"
    compileSdk 34
    buildToolsVersion = "34.0.0"

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_17
        targetCompatibility JavaVersion.VERSION_17
    }

    defaultConfig {
        consumerProguardFiles "proguard-unity.txt"
        versionName "0.1.1"
        minSdk 29
        targetSdk 34
        versionCode 1

        ndk {
            abiFilters "arm64-v8a"
            debugSymbolLevel "none"
        }

        externalNativeBuild {
            cmake {
                arguments "-DANDROID_STL=c++_shared", "-DANDROID_SUPPORT_FLEXIBLE_PAGE_SIZES=ON"
            }
        }
    }

    lint {
        abortOnError false
    }

    androidResources {
        ignoreAssetsPattern = "!.svn:!.git:!.ds_store:!*.scc:!CVS:!thumbs.db:!picasa.ini:!*~"
        //noCompress = ['.unity3d', '.ress', '.resource', '.obb', '.bundle', '.unityexp'] + unityStreamingAssets.tokenize(', ')
        noCompress = ['.unity3d', '.ress', '.resource', '.obb', '.bundle', '.unityexp']
    }

    packaging {
        jniLibs {
            useLegacyPackaging true
        }
    }
}



def getSdkDir() {
    Properties local = new Properties()
    local.load(new FileInputStream("${rootDir}/local.properties"))
    return local.getProperty('sdk.dir')
}

def GetIl2CppOutputPath(String workingDir, String abi) {
    return "${workingDir}/src/main/jniLibs/${abi}/libil2cpp.so";
}

def GetIl2CppSymbolPath(String workingDir, String abi) {
    return "${workingDir}/symbols/${abi}/libil2cpp.so";
}

def BuildIl2CppImpl(String workingDir, String configuration, String architecture, String abi, String[] staticLibraries) {
    def commandLineArgs = []
    commandLineArgs.add("--compile-cpp")
    commandLineArgs.add("--platform=Android")
    commandLineArgs.add("--architecture=${architecture}")
    commandLineArgs.add("--outputpath=${workingDir}/src/main/jniLibs/${abi}/libil2cpp.so")
    commandLineArgs.add("--baselib-directory=${workingDir}/src/main/jniStaticLibs/${abi}")
    commandLineArgs.add("--incremental-g-c-time-slice=3")
    commandLineArgs.add("--configuration=${configuration}")
    commandLineArgs.add("--dotnetprofile=unityaot-linux")
    commandLineArgs.add("--usymtool-path=${workingDir}/src/main/Il2CppOutputProject/usymtool.exe")
    commandLineArgs.add("--profiler-report")
    commandLineArgs.add("--profiler-output-file=${workingDir}/build/il2cpp_${abi}_${configuration}/il2cpp_conv.traceevents")
    commandLineArgs.add("--print-command-line")
    commandLineArgs.add("--static-lib-il2-cpp")
    commandLineArgs.add("--data-folder=${workingDir}/src/main/Il2CppOutputProject/Source/il2cppOutput/data")
    commandLineArgs.add("--generatedcppdir=${workingDir}/src/main/Il2CppOutputProject/Source/il2cppOutput")
    commandLineArgs.add("--cachedirectory=${workingDir}/build/il2cpp_${abi}_${configuration}/il2cpp_cache")
    commandLineArgs.add("--tool-chain-path=${android.ndkDirectory}")

    staticLibraries.eachWithIndex {fileName, i->
        commandLineArgs.add("--additional-libraries=${workingDir}/src/main/jniStaticLibs/${abi}/${fileName}")
    }

    def executableExtension = ""
    if (org.gradle.internal.os.OperatingSystem.current().isWindows()) {
        executableExtension = ".exe"
        commandLineArgs = commandLineArgs*.replace('\"', '\\\"')
    }
    exec {
        executable "${workingDir}/src/main/Il2CppOutputProject/IL2CPP/build/deploy/il2cpp${executableExtension}"
        args commandLineArgs
        environment "ANDROID_SDK_ROOT", getSdkDir()
    }

    def dbgLevel =  project.android.defaultConfig.ndk.debugSymbolLevel;
    def usePublicSymbols = dbgLevel == null || !dbgLevel.toString().toLowerCase().equals("full")
    def extensionToRemove = usePublicSymbols ? ".dbg.so" : ".sym.so"
    def extensionToKeep = usePublicSymbols ? ".sym.so" : ".dbg.so"

    delete "${workingDir}/src/main/jniLibs/${abi}/libil2cpp${extensionToRemove}"
    ant.move(file: "${workingDir}/src/main/jniLibs/${abi}/libil2cpp${extensionToKeep}", tofile: "${workingDir}/symbols/${abi}/libil2cpp.so")

}

android {
    tasks.register('buildIl2Cpp') {
        def workingDir = projectDir.toString().replaceAll('\\\\', '/');
        def archs = [
            'arm64' : 'arm64-v8a'
        ]
        def staticLibs = [
            'arm64' : [  ]
        ]
        inputs.files fileTree(dir: 'src/main/Il2CppOutputProject', include: ['**/*'])
        inputs.files fileTree(dir: 'src/main/jniStaticLibs', include: ['**/*'])
        archs.each { arch, abi ->
            outputs.file GetIl2CppOutputPath(workingDir, abi)
            outputs.file GetIl2CppSymbolPath(workingDir, abi)
        }
        doLast {
            archs.each { arch, abi ->
                BuildIl2CppImpl(workingDir, 'Release', arch, abi, staticLibs[arch] as String[]);
            }
        }
    }

    afterEvaluate {
        if (project(':unityLibrary').tasks.findByName('mergeDebugJniLibFolders'))
            project(':unityLibrary').mergeDebugJniLibFolders.dependsOn buildIl2Cpp
        if (project(':unityLibrary').tasks.findByName('mergeReleaseJniLibFolders'))
            project(':unityLibrary').mergeReleaseJniLibFolders.dependsOn buildIl2Cpp
    }
    sourceSets {
        main {
            jni.srcDirs = ["src/main/Il2CppOutputProject"]
        }
    }
}

android.externalNativeBuild {
    cmake {
        version "3.22.1"
        path "src/main/cpp/CMakeLists.txt"
    }
}
android.buildFeatures {
    prefab true
}

````