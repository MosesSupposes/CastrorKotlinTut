fun main() {
    val people = listOf(
        Human("Donn"),
        Human("Jake"),
        Human("Janet"),
        Human("Kavita")
    )

    for (person in people) {
        println(person)
    }

    people.forEach { println(it) }

    
}

data class Human(val name: String)




