@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        google()
        mavenCentral()
    }
}


dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

include(":app")

getSdkFile("library/devicesdk/")?.let {
    include(":devicesdk")
    project(":devicesdk").projectDir = it
}

fun getSdkFile(path: String): File? {
    val file = File(rootDir, path)
    return if (file.exists()) file else null
}