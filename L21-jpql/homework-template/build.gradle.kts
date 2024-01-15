dependencies {
    implementation ("org.projectlombok:lombok")
    testImplementation(project(mapOf("path" to ":L22-cache")))
    annotationProcessor ("org.projectlombok:lombok")
    implementation("org.checkerframework:checker-qual:3.12.0")
    implementation("org.jetbrains:annotations:17.0.0")

    implementation("ch.qos.logback:logback-classic")
    implementation("org.hibernate.orm:hibernate-core")
    implementation("org.flywaydb:flyway-core")

    implementation("org.postgresql:postgresql")

    testImplementation("com.h2database:h2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testImplementation("org.assertj:assertj-core")
    testImplementation("org.mockito:mockito-junit-jupiter")

    testImplementation("org.testcontainers:junit-jupiter")
    testImplementation("org.testcontainers:postgresql")
}