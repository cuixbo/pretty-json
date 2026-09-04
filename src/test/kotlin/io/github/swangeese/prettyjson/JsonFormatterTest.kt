package io.github.swangeese.prettyjson

import org.codehaus.jettison.json.JSONException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class JsonFormatterTest {
    @Test
    fun `pretty formats an object with four-space indentation`() {
        assertEquals(
            expected = "{\n    \"name\": \"Ada\"\n}",
            actual = JsonFormatter.pretty("{\"name\":\"Ada\"}"),
        )
    }

    @Test
    fun `compact removes whitespace from an object`() {
        assertEquals(
            expected = "{\"name\":\"Ada\"}",
            actual = JsonFormatter.compact("{ \"name\" : \"Ada\" }"),
        )
    }

    @Test
    fun `pretty rejects invalid JSON`() {
        assertFailsWith<JSONException> {
            JsonFormatter.pretty("not json")
        }
    }
}
