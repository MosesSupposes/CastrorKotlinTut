fun main() {
    printUserInfo(lastName = "Samuel" , firstName = "Moses", age = 22, likesMovies= false, lovesPopcorn = false, isSunburned = false)
}

fun printUserInfo(firstName: String, lastName: String, age: Int, isSunburned: Boolean, likesMovies: Boolean, lovesPopcorn: Boolean) {
    println("$firstName $lastName is of age $age. Sunburned: $isSunburned, Likes Movies: $likesMovies, lovesPopcorn: $lovesPopcorn")
}




