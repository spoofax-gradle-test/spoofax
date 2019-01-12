rootProject.name = "spoofax"

pluginManagement {
  repositories {
    maven(url = "http://home.gohla.nl:8091/artifactory/all/")
    gradlePluginPortal()
  }
}

include("spoofax.api")
include("spoofax.runtime")
include("spoofax.pie")
include("spoofax.cli")

project(":spoofax.api").projectDir = file("api")
project(":spoofax.runtime").projectDir = file("runtime")
project(":spoofax.pie").projectDir = file("pie")
project(":spoofax.cli").projectDir = file("cli")
