plugins {
  id("org.metaborg.gradle.config.java-application")
}

dependencies {
  compile(project(":spoofax.pie"))
  compile(project(":spoofax.runtime"))
  compile("org.metaborg:log.slf4j:0.1.0")
  compile("org.slf4j:slf4j-simple:1.7.25")
}

application {
  applicationName = "spoofax"
  mainClassName = "mb.spoofax.cli.Main"
}
