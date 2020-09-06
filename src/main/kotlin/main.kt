fun main() {
    val items = listOf(1,2,3,4,5) // lists are immutable
    items.forEach { println(it) }

    val users = listOf(User("John", "Doe"), User("Jane", "Doe"))
    users.forEach { println(it) }

    val first = users.first()
    println(first)

    val last = users.last()
    println(last)

    val name: String? = null
    val stuff = if (name == null) emptyList() else listOf(name)
}
