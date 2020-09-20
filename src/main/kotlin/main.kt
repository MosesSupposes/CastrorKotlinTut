fun main() {
    val states: Map<String, String> = mapOf( // maps are similar to python dictionaries; also, they can't have duplicate keys
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California"
    )

    val result = states.get("NY")
    println(result) // New York

    val result2 = states["NJ"] // you can use the indexing operator to access an element of a Map
    println(result2) // "New Jersey"

    println(states.get("FL")) // null

    val result3 = states.getOrElse("FL") { "FOO" }
    println(result3) // returns "FOO" if it can't find the key "FL"

    val result4 = states.containsKey("CA")
    println(result4) // true

    val result5 = states.containsValue("California")
    println(result5) // true

    val result6 = states.entries
    println(result6)

    val result7 = states.keys
    println(result7)

    val result8 = states.values
    println(result8)
}


data class Human(val name: String)




