fun main() {
    val items = mutableListOf(1,2,3,4,5)
    items.forEach { println(it) }

    println("---------------")

    items.add(6)
    items.forEach { println(it) }

    println("---------------")

    items.remove(3)
    items.forEach { println(it) }

    println("---------------")

    items.removeAt(0)
    items.forEach { println(it) }

    println("---------------")

    val john = User("John", "Doe")
    val users = mutableListOf<User>(
        john,
        User("Jane", "Doe"),
    )

    users.remove(john)
    users.forEach{ println(it) }

    println("---------------")

    users[0] = User("Janet", "Doe")
    users.forEach{ println(it) }


}
