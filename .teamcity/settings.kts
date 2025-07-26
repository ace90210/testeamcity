// .teamcity/settings.kts

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

project {
    // Make sure this version exactly matches your TeamCity server version
    version = "2025.07"

    // Define the build type directly inside the project
    buildType({
        name = "Hello World Build"

        steps {
            script {
                name = "Say Hello"
                scriptContent = "echo 'Hello, World!'"
            }
        }
    })
}