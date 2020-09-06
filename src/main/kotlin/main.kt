fun main() {
    val names = listOf("Donn", "Bob", "Jane", "Jenny", "Tushar", "Kavita")
    val filtered = names.filter { it.toLowerCase().contains("a")  }
    println(filtered)

    val ages = listOf(23, 33, 12, 9 ,17, 19, 99)
//    val adults = ages.filter { isAdult(it) }
    val adults = ages.filter(::isAdult) // this line is equivalent to the line above
    println(adults)
}
fun isAdult(age: Int): Boolean {
    return age >= 18
}
