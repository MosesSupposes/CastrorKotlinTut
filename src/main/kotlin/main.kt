fun main() {
    println(FavoriteFood.name)
    FavoriteFood.name = "Watermelon"
    println(FavoriteFood.name)
    FavoriteFood.ingredients.add("Salt")
    println(FavoriteFood.ingredients.first())

    doStuff()

    println(FavoriteFood.name)
    println(FavoriteFood.ingredients.firstOrNull())

    println(FavoriteFood.numberOfIngredients())

    println(FavoriteFood == FavoriteFood) // true
    println(FavoriteFood === FavoriteFood) // true
}

fun doStuff() {
    FavoriteFood.name = "Chicken"
    FavoriteFood.ingredients.clear()
}

// Singleton -> 1 instance
object FavoriteFood {
    var name = "unknown"
    var ingredients = mutableListOf<String>()

    fun numberOfIngredients(): Int {
        return ingredients.size
    }
}

