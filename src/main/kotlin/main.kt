fun main() {
//    val pair = Pair("foo", "bar") // this data class comes with Kotlin's standard lib
    val pair = "foo" to "bar" // this line is equivalent to the line above
    println(pair.first)
    println(pair.second)

    val triple = Triple("foo", "bar", "baz")
    println(triple.first)
    println(triple.second)
    println(triple.third)
}
