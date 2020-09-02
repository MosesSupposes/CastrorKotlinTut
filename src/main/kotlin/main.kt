fun main() {
    val user = User.createUser("foo", "bar")
    println(user)

    val users = User.createUsers(15)
//    users.forEach { println(it) }

    val users2 = User.users
    users2.forEach { println(it) }
}

