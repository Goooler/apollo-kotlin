package com.apollographql.apollo3.api.internal

import com.apollographql.apollo3.api.ResponseField

fun ResponseField.shouldSkip(variableValues: Map<String, Any?>): Boolean {
  val variables = variableValues.filter {
    (it.value as? Boolean) == true
  }.map { it.key }
      .toSet()

   val shouldSkip = !condition.evaluate(variables, emptySet())

  return shouldSkip
}