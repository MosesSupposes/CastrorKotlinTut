fun main() {
    val p1 = Person("Moses", "Samuel", 22)
    val firstName = p1.component1()
    val lastName = p1.component2()
    val age = p1.component3()

    println(firstName)
    println(lastName)
    println(age)
}

// Equals / Hashcode / toString are provided for us
data class Person(val firstName: String = "John", val lastName: String = "Doe", val age: Int)

