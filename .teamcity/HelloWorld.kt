// .teamcity/HelloWorld.kt

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object HelloWorld : BuildType({
    name = "Hello World Build"

    steps {
        script {
            name = "Say Hello"
            scriptContent = "echo Hello, World!"
        }
    }
})