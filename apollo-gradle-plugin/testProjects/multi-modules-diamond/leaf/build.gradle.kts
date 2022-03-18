plugins {
  kotlin("jvm")
  id("com.apollographql.apollo3")
  id("application")
}

dependencies {
  implementation(kotlin("stdlib"))
  testImplementation(kotlin("test-junit"))
  implementation(groovy.util.Eval.x(project, "x.dep.apollo.api"))

  implementation(projects.node1)
  implementation(projects.node2)

  apolloMetadata(projects.node1)
  apolloMetadata(projects.node2)
}

application {
  mainClass.set("LeafKt")
}

apollo {
  packageNamesFromFilePaths()
}
