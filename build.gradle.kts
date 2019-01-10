plugins {
  id("org.metaborg.gradle.config") version "0.4.1"
  id("org.metaborg.gitonium") version "0.3.0"
}

subprojects {
  metaborgConfig {
    configureSubProject()
  }
}
configure(subprojects.filter { !it.name.endsWith("spoofax.cli") }) {
  metaborgConfig {
    configureJavaLibrary()
  }
}
project(":spoofax.cli") {
  metaborgConfig {
    configureJavaApplication()
  }
}
