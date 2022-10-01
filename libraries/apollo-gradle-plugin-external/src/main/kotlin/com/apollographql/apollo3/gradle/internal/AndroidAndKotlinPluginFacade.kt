package com.apollographql.apollo3.gradle.internal

import com.android.build.gradle.api.AndroidSourceDirectorySet
import com.android.build.gradle.api.AndroidSourceSet

// Copied from kotlin plugin
internal fun AndroidSourceSet.kotlinSourceSet(): AndroidSourceDirectorySet? {
  val getKotlin = this::class.java.methods.find { it.name == "getKotlin" } ?: return null
  return getKotlin(this) as? AndroidSourceDirectorySet
}

