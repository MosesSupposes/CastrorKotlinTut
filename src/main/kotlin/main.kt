fun main() {
    printUserInfo(age = 22, likesMovies= false, lovesPopcorn = false, isSunburned = false)
}

fun printUserInfo(firstName: String = "John", lastName: String = "Doe", age: Int, isSunburned: Boolean, likesMovies: Boolean, lovesPopcorn: Boolean) {
    println("$firstName $lastName is of age $age. Sunburned: $isSunburned, Likes Movies: $likesMovies, lovesPopcorn: $lovesPopcorn")
}




