plugins {
    id("org.openapi.generator") version "6.3.0"
}

val openApiSource = "$projectDir/src/main/openapi/example.yaml".toString()

openApiValidate {
    inputSpec.set(openApiSource)
}

openApiGenerate {
    generatorName.set("python")
    inputSpec.set(openApiSource)
    outputDir.set("$buildDir/generated")

}
