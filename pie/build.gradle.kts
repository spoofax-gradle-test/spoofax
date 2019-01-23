plugins {
  id("org.metaborg.gradle.config.java-library")
}

dependencies {
  api(project(":spoofax.api"))
  api("org.metaborg:pie.runtime:0.1.0")
}
