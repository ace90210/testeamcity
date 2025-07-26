// .teamcity/settings.kts

import jetbrains.buildServer.configs.kotlin.project

/*
 This is the main entry point for your VCS settings.
 It defines the root project.
*/
project {
    // The version property tells TeamCity which API version your scripts are written for.
    // It should match your server version.
    version = "2025.07"

    // Register your build type defined in another file.
    buildType(HelloWorld)
}