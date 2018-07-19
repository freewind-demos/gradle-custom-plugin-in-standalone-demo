package freewind.demos.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPluginExtension {
    String message = 'Hello from HelloPlugin'
}

class HelloPlugin implements Plugin<Project> {
    void apply(Project project) {
        HelloPluginExtension extension = project.extensions.create('hello', HelloPluginExtension)
        project.task('hello') {
            doLast {
                println(extension.message)
            }
        }
    }
}
