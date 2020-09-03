fun main() {
    val p1 = Person("Moses", "Samuel")
    val p2 = Person("Moses", "Samuel")
    println(p1 == p2) // true

    val nonDataP1 = NonDataPerson("Moses", "Samuel")
    val nonDataP2 = NonDataPerson("Moses", "Samuel")
    println(nonDataP1 == nonDataP2) // false
}

// Equals / Hashcode / toString are provided for us
data class Person(val firstName: String, val lastName: String) {
    fun fullName(): String {
        return "$firstName $lastName"
    }

    fun nameLengh(): Int {
        return fullName().length
    }
}

class NonDataPerson(val firstName: String, val lastName: String)