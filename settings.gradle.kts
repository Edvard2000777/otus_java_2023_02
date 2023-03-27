rootProject.name = "otusJava"
include ("L01-gradle")

include ("L02-gradle2")
include ("L02-gradle2-libApi")
include ("L02-gradle2-libApiUse")
include ("L03-qa")
include ("L04-generics")
include ("L05-collections")
include ("L06-annotations")

include("L08-gc:demo")
include("L08-gc:homework")


pluginManagement {
    val jgitver: String by settings
    val dependencyManagement: String by settings
    val springframeworkBoot: String by settings
    val johnrengelmanShadow: String by settings
    val jib: String by settings

    plugins {
        id("fr.brouillard.oss.gradle.jgitver") version jgitver
        id("io.spring.dependency-management") version dependencyManagement
        id("org.springframework.boot") version springframeworkBoot
        id("com.github.johnrengelman.shadow") version johnrengelmanShadow
        id("com.google.cloud.tools.jib") version jib
    }
}