plugins {
  kotlin("jvm")
  id("com.apollographql.apollo3")
}

dependencies {
  implementation(groovy.util.Eval.x(project, "x.dep.apollo.api"))

  api(projects.root)
  apolloMetadata(projects.root)
}

apollo {
  packageNamesFromFilePaths()
  generateApolloMetadata.set(true)
}