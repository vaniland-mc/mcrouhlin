plugins {
    id("land.vani.setup.kotlin")
    id("land.vani.maven.publish")
    id("io.papermc.paperweight.userdev") version "1.3.6"
}

repositories {
    maven("https://oss.sonatype.org/content/repositories/central")
    maven("https://papermc.io/repo/repository/maven-public/") {
        content {
            includeGroup("io.papermc.paper")
        }
    }
}

dependencies {
    api(project(":mcorouhlin-api"))
    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT")
    paperDevBundle("1.18.1-R0.1-SNAPSHOT")

    testCompileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT")
    testImplementation("land.vani.mockpaper:MockPaper-1.18.1:2.0.0")
    testImplementation(kotlin("reflect"))
    testImplementation("com.google.jimfs:jimfs:1.2")
}
