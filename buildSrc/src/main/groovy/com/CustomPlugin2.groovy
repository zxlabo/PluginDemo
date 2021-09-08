package com

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin2 implements Plugin<Project>{

    @Override
    void apply(Project project) {
        project.task("customTask2"){
            println("customTask2 is configure")
            doFirst {
                println("customTask2 is doFirst")
            }
            doLast {
                println("customTask2 is doLast")
            }
        }

    }
}