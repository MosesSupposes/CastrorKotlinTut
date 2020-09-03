fun main() {
    val p1 = Person("Moses", "Samuel", 22)

    // The destructured values below are implemented by calling the .componentN methods on the p1 instance
    val (firstName, lastName, age) = p1
    println(firstName)
    println(lastName)
    println(age)
}

// Equals / Hashcode / toString are provided for us
data class Person(val firstName: String = "John", val lastName: String = "Doe", val age: Int)

