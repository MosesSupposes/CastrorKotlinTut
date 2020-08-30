fun main() {
    // structural equality
    var name1 = "Moses"
    var name2 = "Moses"

    println(name1 == name2) // true
    println(listOf("Moses") == listOf("Moses")) // true

    // referential equality
    var a = Person("Moses")
    var b = Person("Moses")
    var c = a

    println(a !== b) // true
    println(a === c) // true
}

// classes are hoisted...
class Person(var name: String)
