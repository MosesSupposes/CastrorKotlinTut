fun main() {
    val mine = listOf("Apples", "Grapes")
    val theirs = listOf("Oranges", "Pears", "Strawberries")
    val others = listOf("Kiwi", "Watermelon")

    val result = mine.plus(theirs).plus(others)
    println(result)

    println(result.minus(theirs))
}
