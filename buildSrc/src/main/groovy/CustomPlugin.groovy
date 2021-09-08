import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        project.task("customTask"){
            println("customTask is configure")
            doFirst {
                println("customTask is doFirst")
            }
            doLast {
                println("customTask is doLast")
            }
        }

    }
}