rootProject.name = "ianus-server"

include(
    "ianus-domain",
    "ianus-application",
    "ianus-adapters:inbound",
    "ianus-adapters:outbound",
    "ianus-api",
)

pluginManagement {

    val kotlinVersion: String by settings
    val springBootVersion: String by settings
    val springDependencyManagementPluginVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springDependencyManagementPluginVersion
    }
}