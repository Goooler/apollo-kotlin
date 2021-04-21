package com.apollographql.apollo3.compiler.unified.codegen.helpers

import com.apollographql.apollo3.api.Input
import com.apollographql.apollo3.compiler.applyIf
import com.apollographql.apollo3.compiler.unified.codegen.CgContext
import com.apollographql.apollo3.compiler.unified.ir.IrInputField
import com.apollographql.apollo3.compiler.unified.ir.IrType
import com.apollographql.apollo3.compiler.unified.ir.IrVariable
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asClassName

class NamedType(
    val graphQlName: String,
    val description: String?,
    val deprecationReason: String?,
    val type: IrType,
    val optional: Boolean = false,
)

fun NamedType.typeName(context: CgContext): TypeName {
  return if (optional) {
    Input::class.asClassName().parameterizedBy(context.resolver.resolveType(type))
  } else {
    context.resolver.resolveType(type)
  }
}


internal fun NamedType.toParameterSpec(context: CgContext): ParameterSpec {
  return ParameterSpec
      .builder(
          // we use property for parameters as these are ultimately data classes
          name = context.layout.propertyName(graphQlName),
          type = typeName(context)
      )
      .applyIf(description?.isNotBlank() == true) { addKdoc("%L\n", description!!) }
      .applyIf(optional) { defaultValue("%T", Input.Absent::class.asClassName()) }
      .build()
}


fun IrInputField.toNamedType() = NamedType(
    graphQlName = name,
    type = type,
    optional = optional,
    description = description,
    deprecationReason = deprecationReason,
)

fun IrVariable.toNamedType() = NamedType(
    graphQlName = name,
    type = type,
    optional = optional,
    description = null,
    deprecationReason = null,
)
