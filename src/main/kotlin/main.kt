fun main() {
    val items = arrayOf(1,2,3,4,5)
    items.forEach { println(it) }

    val users = arrayOf(
        User("Moses", "Samuel"),
        User("Jane", "Doe")
    )

    users.forEach { println(it) }

    val updatedUsers = users.plus(User("John", "Doe"))
    updatedUsers.forEach { println(it) }

    users.set(0, User("Foo", "Bar")) // Arrays are homogenous when dealing with non-primitives (objects)
    val item = users[0]
    println(item)
}
