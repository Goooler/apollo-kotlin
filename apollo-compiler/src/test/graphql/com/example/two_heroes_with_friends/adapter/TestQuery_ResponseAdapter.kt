// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.two_heroes_with_friends.adapter

import com.apollographql.apollo3.api.ResponseAdapterCache
import com.apollographql.apollo3.api.ResponseField
import com.apollographql.apollo3.api.internal.IntResponseAdapter
import com.apollographql.apollo3.api.internal.ListResponseAdapter
import com.apollographql.apollo3.api.internal.NullableResponseAdapter
import com.apollographql.apollo3.api.internal.ResponseAdapter
import com.apollographql.apollo3.api.internal.StringResponseAdapter
import com.apollographql.apollo3.api.internal.json.JsonReader
import com.apollographql.apollo3.api.internal.json.JsonWriter
import com.example.two_heroes_with_friends.TestQuery
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
class TestQuery_ResponseAdapter(
  responseAdapterCache: ResponseAdapterCache
) : ResponseAdapter<TestQuery.Data> {
  private val nullableR2Adapter: ResponseAdapter<TestQuery.Data.R2?> =
      NullableResponseAdapter(R2(responseAdapterCache))

  private val nullableLukeAdapter: ResponseAdapter<TestQuery.Data.Luke?> =
      NullableResponseAdapter(Luke(responseAdapterCache))

  override fun fromResponse(reader: JsonReader): TestQuery.Data {
    var r2: TestQuery.Data.R2? = null
    var luke: TestQuery.Data.Luke? = null
    reader.beginObject()
    while(true) {
      when (reader.selectName(RESPONSE_NAMES)) {
        0 -> r2 = nullableR2Adapter.fromResponse(reader)
        1 -> luke = nullableLukeAdapter.fromResponse(reader)
        else -> break
      }
    }
    reader.endObject()
    return TestQuery.Data(
      r2 = r2,
      luke = luke
    )
  }

  override fun toResponse(writer: JsonWriter, value: TestQuery.Data) {
    writer.beginObject()
    writer.name("r2")
    nullableR2Adapter.toResponse(writer, value.r2)
    writer.name("luke")
    nullableLukeAdapter.toResponse(writer, value.luke)
    writer.endObject()
  }

  companion object {
    val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField(
        type = ResponseField.Type.Named.Object("Character"),
        fieldName = "hero",
        responseName = "r2",
        fieldSets = listOf(
          ResponseField.FieldSet(null, R2.RESPONSE_FIELDS)
        ),
      ),
      ResponseField(
        type = ResponseField.Type.Named.Object("Character"),
        fieldName = "hero",
        responseName = "luke",
        arguments = mapOf<String, Any?>(
          "episode" to "EMPIRE"),
        fieldSets = listOf(
          ResponseField.FieldSet(null, Luke.RESPONSE_FIELDS)
        ),
      )
    )

    val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
  }

  class R2(
    responseAdapterCache: ResponseAdapterCache
  ) : ResponseAdapter<TestQuery.Data.R2> {
    private val stringAdapter: ResponseAdapter<String> = StringResponseAdapter

    private val friendsConnectionAdapter: ResponseAdapter<TestQuery.Data.R2.FriendsConnection> =
        FriendsConnection(responseAdapterCache)

    override fun fromResponse(reader: JsonReader): TestQuery.Data.R2 {
      var name: String? = null
      var friendsConnection: TestQuery.Data.R2.FriendsConnection? = null
      reader.beginObject()
      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> name = stringAdapter.fromResponse(reader)
          1 -> friendsConnection = friendsConnectionAdapter.fromResponse(reader)
          else -> break
        }
      }
      reader.endObject()
      return TestQuery.Data.R2(
        name = name!!,
        friendsConnection = friendsConnection!!
      )
    }

    override fun toResponse(writer: JsonWriter, value: TestQuery.Data.R2) {
      writer.beginObject()
      writer.name("name")
      stringAdapter.toResponse(writer, value.name)
      writer.name("friendsConnection")
      friendsConnectionAdapter.toResponse(writer, value.friendsConnection)
      writer.endObject()
    }

    companion object {
      val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
          fieldName = "name",
        ),
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named.Object("FriendsConnection")),
          fieldName = "friendsConnection",
          fieldSets = listOf(
            ResponseField.FieldSet(null, FriendsConnection.RESPONSE_FIELDS)
          ),
        )
      )

      val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
    }

    class FriendsConnection(
      responseAdapterCache: ResponseAdapterCache
    ) : ResponseAdapter<TestQuery.Data.R2.FriendsConnection> {
      private val nullableIntAdapter: ResponseAdapter<Int?> =
          NullableResponseAdapter(IntResponseAdapter)

      private val nullableListOfNullableEdgesAdapter:
          ResponseAdapter<List<TestQuery.Data.R2.FriendsConnection.Edges?>?> =
          NullableResponseAdapter(ListResponseAdapter(NullableResponseAdapter(Edges(responseAdapterCache))))

      override fun fromResponse(reader: JsonReader): TestQuery.Data.R2.FriendsConnection {
        var totalCount: Int? = null
        var edges: List<TestQuery.Data.R2.FriendsConnection.Edges?>? = null
        reader.beginObject()
        while(true) {
          when (reader.selectName(RESPONSE_NAMES)) {
            0 -> totalCount = nullableIntAdapter.fromResponse(reader)
            1 -> edges = nullableListOfNullableEdgesAdapter.fromResponse(reader)
            else -> break
          }
        }
        reader.endObject()
        return TestQuery.Data.R2.FriendsConnection(
          totalCount = totalCount,
          edges = edges
        )
      }

      override fun toResponse(writer: JsonWriter, value: TestQuery.Data.R2.FriendsConnection) {
        writer.beginObject()
        writer.name("totalCount")
        nullableIntAdapter.toResponse(writer, value.totalCount)
        writer.name("edges")
        nullableListOfNullableEdgesAdapter.toResponse(writer, value.edges)
        writer.endObject()
      }

      companion object {
        val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField(
            type = ResponseField.Type.Named.Other("Int"),
            fieldName = "totalCount",
          ),
          ResponseField(
            type = ResponseField.Type.List(ResponseField.Type.Named.Object("FriendsEdge")),
            fieldName = "edges",
            fieldSets = listOf(
              ResponseField.FieldSet(null, Edges.RESPONSE_FIELDS)
            ),
          )
        )

        val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
      }

      class Edges(
        responseAdapterCache: ResponseAdapterCache
      ) : ResponseAdapter<TestQuery.Data.R2.FriendsConnection.Edges> {
        private val nullableNodeAdapter:
            ResponseAdapter<TestQuery.Data.R2.FriendsConnection.Edges.Node?> =
            NullableResponseAdapter(Node(responseAdapterCache))

        override fun fromResponse(reader: JsonReader): TestQuery.Data.R2.FriendsConnection.Edges {
          var node: TestQuery.Data.R2.FriendsConnection.Edges.Node? = null
          reader.beginObject()
          while(true) {
            when (reader.selectName(RESPONSE_NAMES)) {
              0 -> node = nullableNodeAdapter.fromResponse(reader)
              else -> break
            }
          }
          reader.endObject()
          return TestQuery.Data.R2.FriendsConnection.Edges(
            node = node
          )
        }

        override fun toResponse(writer: JsonWriter,
            value: TestQuery.Data.R2.FriendsConnection.Edges) {
          writer.beginObject()
          writer.name("node")
          nullableNodeAdapter.toResponse(writer, value.node)
          writer.endObject()
        }

        companion object {
          val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
            ResponseField(
              type = ResponseField.Type.Named.Object("Character"),
              fieldName = "node",
              fieldSets = listOf(
                ResponseField.FieldSet(null, Node.RESPONSE_FIELDS)
              ),
            )
          )

          val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
        }

        class Node(
          responseAdapterCache: ResponseAdapterCache
        ) : ResponseAdapter<TestQuery.Data.R2.FriendsConnection.Edges.Node> {
          private val stringAdapter: ResponseAdapter<String> = StringResponseAdapter

          override fun fromResponse(reader: JsonReader):
              TestQuery.Data.R2.FriendsConnection.Edges.Node {
            var name: String? = null
            reader.beginObject()
            while(true) {
              when (reader.selectName(RESPONSE_NAMES)) {
                0 -> name = stringAdapter.fromResponse(reader)
                else -> break
              }
            }
            reader.endObject()
            return TestQuery.Data.R2.FriendsConnection.Edges.Node(
              name = name!!
            )
          }

          override fun toResponse(writer: JsonWriter,
              value: TestQuery.Data.R2.FriendsConnection.Edges.Node) {
            writer.beginObject()
            writer.name("name")
            stringAdapter.toResponse(writer, value.name)
            writer.endObject()
          }

          companion object {
            val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
              ResponseField(
                type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
                fieldName = "name",
              )
            )

            val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
          }
        }
      }
    }
  }

  class Luke(
    responseAdapterCache: ResponseAdapterCache
  ) : ResponseAdapter<TestQuery.Data.Luke> {
    private val stringAdapter: ResponseAdapter<String> = StringResponseAdapter

    private val friendsConnectionAdapter: ResponseAdapter<TestQuery.Data.Luke.FriendsConnection> =
        FriendsConnection(responseAdapterCache)

    override fun fromResponse(reader: JsonReader): TestQuery.Data.Luke {
      var id: String? = null
      var name: String? = null
      var friendsConnection: TestQuery.Data.Luke.FriendsConnection? = null
      reader.beginObject()
      while(true) {
        when (reader.selectName(RESPONSE_NAMES)) {
          0 -> id = stringAdapter.fromResponse(reader)
          1 -> name = stringAdapter.fromResponse(reader)
          2 -> friendsConnection = friendsConnectionAdapter.fromResponse(reader)
          else -> break
        }
      }
      reader.endObject()
      return TestQuery.Data.Luke(
        id = id!!,
        name = name!!,
        friendsConnection = friendsConnection!!
      )
    }

    override fun toResponse(writer: JsonWriter, value: TestQuery.Data.Luke) {
      writer.beginObject()
      writer.name("id")
      stringAdapter.toResponse(writer, value.id)
      writer.name("name")
      stringAdapter.toResponse(writer, value.name)
      writer.name("friendsConnection")
      friendsConnectionAdapter.toResponse(writer, value.friendsConnection)
      writer.endObject()
    }

    companion object {
      val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
          fieldName = "id",
        ),
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
          fieldName = "name",
        ),
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named.Object("FriendsConnection")),
          fieldName = "friendsConnection",
          fieldSets = listOf(
            ResponseField.FieldSet(null, FriendsConnection.RESPONSE_FIELDS)
          ),
        )
      )

      val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
    }

    class FriendsConnection(
      responseAdapterCache: ResponseAdapterCache
    ) : ResponseAdapter<TestQuery.Data.Luke.FriendsConnection> {
      private val nullableIntAdapter: ResponseAdapter<Int?> =
          NullableResponseAdapter(IntResponseAdapter)

      private val nullableListOfNullableEdgesAdapter:
          ResponseAdapter<List<TestQuery.Data.Luke.FriendsConnection.Edges?>?> =
          NullableResponseAdapter(ListResponseAdapter(NullableResponseAdapter(Edges(responseAdapterCache))))

      override fun fromResponse(reader: JsonReader): TestQuery.Data.Luke.FriendsConnection {
        var totalCount: Int? = null
        var edges: List<TestQuery.Data.Luke.FriendsConnection.Edges?>? = null
        reader.beginObject()
        while(true) {
          when (reader.selectName(RESPONSE_NAMES)) {
            0 -> totalCount = nullableIntAdapter.fromResponse(reader)
            1 -> edges = nullableListOfNullableEdgesAdapter.fromResponse(reader)
            else -> break
          }
        }
        reader.endObject()
        return TestQuery.Data.Luke.FriendsConnection(
          totalCount = totalCount,
          edges = edges
        )
      }

      override fun toResponse(writer: JsonWriter, value: TestQuery.Data.Luke.FriendsConnection) {
        writer.beginObject()
        writer.name("totalCount")
        nullableIntAdapter.toResponse(writer, value.totalCount)
        writer.name("edges")
        nullableListOfNullableEdgesAdapter.toResponse(writer, value.edges)
        writer.endObject()
      }

      companion object {
        val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
          ResponseField(
            type = ResponseField.Type.Named.Other("Int"),
            fieldName = "totalCount",
          ),
          ResponseField(
            type = ResponseField.Type.List(ResponseField.Type.Named.Object("FriendsEdge")),
            fieldName = "edges",
            fieldSets = listOf(
              ResponseField.FieldSet(null, Edges.RESPONSE_FIELDS)
            ),
          )
        )

        val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
      }

      class Edges(
        responseAdapterCache: ResponseAdapterCache
      ) : ResponseAdapter<TestQuery.Data.Luke.FriendsConnection.Edges> {
        private val nullableNodeAdapter:
            ResponseAdapter<TestQuery.Data.Luke.FriendsConnection.Edges.Node?> =
            NullableResponseAdapter(Node(responseAdapterCache))

        override fun fromResponse(reader: JsonReader): TestQuery.Data.Luke.FriendsConnection.Edges {
          var node: TestQuery.Data.Luke.FriendsConnection.Edges.Node? = null
          reader.beginObject()
          while(true) {
            when (reader.selectName(RESPONSE_NAMES)) {
              0 -> node = nullableNodeAdapter.fromResponse(reader)
              else -> break
            }
          }
          reader.endObject()
          return TestQuery.Data.Luke.FriendsConnection.Edges(
            node = node
          )
        }

        override fun toResponse(writer: JsonWriter,
            value: TestQuery.Data.Luke.FriendsConnection.Edges) {
          writer.beginObject()
          writer.name("node")
          nullableNodeAdapter.toResponse(writer, value.node)
          writer.endObject()
        }

        companion object {
          val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
            ResponseField(
              type = ResponseField.Type.Named.Object("Character"),
              fieldName = "node",
              fieldSets = listOf(
                ResponseField.FieldSet(null, Node.RESPONSE_FIELDS)
              ),
            )
          )

          val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
        }

        class Node(
          responseAdapterCache: ResponseAdapterCache
        ) : ResponseAdapter<TestQuery.Data.Luke.FriendsConnection.Edges.Node> {
          private val stringAdapter: ResponseAdapter<String> = StringResponseAdapter

          override fun fromResponse(reader: JsonReader):
              TestQuery.Data.Luke.FriendsConnection.Edges.Node {
            var name: String? = null
            reader.beginObject()
            while(true) {
              when (reader.selectName(RESPONSE_NAMES)) {
                0 -> name = stringAdapter.fromResponse(reader)
                else -> break
              }
            }
            reader.endObject()
            return TestQuery.Data.Luke.FriendsConnection.Edges.Node(
              name = name!!
            )
          }

          override fun toResponse(writer: JsonWriter,
              value: TestQuery.Data.Luke.FriendsConnection.Edges.Node) {
            writer.beginObject()
            writer.name("name")
            stringAdapter.toResponse(writer, value.name)
            writer.endObject()
          }

          companion object {
            val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
              ResponseField(
                type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
                fieldName = "name",
              )
            )

            val RESPONSE_NAMES: List<String> = RESPONSE_FIELDS.map { it.responseName }
          }
        }
      }
    }
  }
}