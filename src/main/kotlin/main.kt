fun main() {
    val people = listOf(
        Human("Donn"),
        Human("Jake"),
        Human("Janet"),
        Human("Kavita")
    )

    people.forEachIndexed { index, person ->
        println("Index: $index, Person: $person")
    }
}

data class Human(val name: String)




