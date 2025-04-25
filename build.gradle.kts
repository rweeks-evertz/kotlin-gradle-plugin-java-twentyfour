plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.2.0-Beta1"
}

group = "io.github.rweeks-evertz"
version = "0.1.0"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(24))
    }
    compilerOptions {
        allWarningsAsErrors = true
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
    }
}

sourceSets.getByName("main") {
    java.srcDir("src/main/java")
    kotlin.srcDir("src/main/kotlin")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.2.0-Beta1")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
