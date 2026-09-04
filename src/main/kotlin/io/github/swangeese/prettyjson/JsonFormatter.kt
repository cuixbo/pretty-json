package io.github.swangeese.prettyjson

import org.codehaus.jettison.json.JSONObject

object JsonFormatter {
    fun pretty(value: String): String = JSONObject(value).toString(4)

    fun compact(value: String): String = JSONObject(value).toString()
}
