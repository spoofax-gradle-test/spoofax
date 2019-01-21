plugins {
  id("org.metaborg.gradle.config.java-library")
}

dependencies {
  api(project(":spoofax.api"))
  api("org.metaborg:pie.runtime:develop-SNAPSHOT")
}
