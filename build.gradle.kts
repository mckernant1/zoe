plugins {
    kotlin("jvm") version "1.4.32"
    kotlin("plugin.serialization") version "1.4.32"
    kotlin("jupyter.api") version "0.8.3.322"
    id("ru.ileasile.kotlin.publisher") version "0.0.27-dev"
}

kotlinJupyter {
    addApiDependency()
    addScannerDependency()
}

group = "com.github.mckernant1"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation(kotlin("serialization"))
    implementation("com.github.mckernant1:lol-esports-api-wrapper:+")
    implementation("com.github.holgerbrandl:krangl:0.15.8")
}

kotlinPublications {
    publication {
        publicationName = "zoe"
        artifactId = "zoe"
        description = "Lol esports data playground package"
        packageName = artifactId
        publishToSonatype = false
    }
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }
}

