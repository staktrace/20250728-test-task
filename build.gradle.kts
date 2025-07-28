plugins {
    id("org.jetbrains.kotlin.jvm") version "2.1.20"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.13.4")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.13.4")
    testImplementation("org.junit.platform:junit-platform-launcher:1.13.4")
}

tasks.register("socketTest", Test::class.java) {
    useJUnitPlatform {
        includeTags("socket")
    }

    outputs.doNotCacheIf("always run") { true }
    outputs.upToDateWhen { false }
}

tasks.test {
    useJUnitPlatform {
        excludeTags("socket")
    }
}
