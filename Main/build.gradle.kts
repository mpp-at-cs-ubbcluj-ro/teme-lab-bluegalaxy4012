plugins {
    id("java")
    id("application")
}

group = "mpp"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    runtimeOnly("org.xerial:sqlite-jdbc:3.41.2.2")
}

application {
    mainClass.set("mpp.MainBD")
}

tasks.test {
    useJUnitPlatform()
}