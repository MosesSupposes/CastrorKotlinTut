fun main() {
    val people = listOf(
        Human("Donn"),
        Human("Jake"),
        Human("Janet"),
        Human("Kavita")
    )

    val morePeople = listOf(
        Human("Donn"),
        Human("Janet"),
        Human("Kavita"),
        Human("Kevin"),
        Human("Cathy")
    )

    val uniqueValues: Set<Human> = people.union(morePeople)

    println(uniqueValues)
}

data class Human(val name: String)




