package com.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin3 implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task("task_3") {
            println("task_3 is configure")
            doFirst {
                println("task_3 is do first")
            }
        }
    }
}