plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-csstype"))
    api(project(":kotlin-react"))

    implementation(project(":kotlin-emotion"))
}
