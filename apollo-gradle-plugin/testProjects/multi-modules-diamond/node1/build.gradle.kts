plugins {
  kotlin("jvm")
  id("com.apollographql.apollo3")
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation(groovy.util.Eval.x(project, "x.dep.apollo.api"))
  testImplementation(kotlin("test-junit"))

  api(projects.root)
  apolloMetadata(projects.root)
}

apollo {
  packageNamesFromFilePaths()
  generateApolloMetadata.set(true)
}