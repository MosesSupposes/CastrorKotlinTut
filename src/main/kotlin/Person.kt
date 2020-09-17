// the "open" keyword makes this class extendable by other classes
open class Person(var name: String, var age: Int) {
    fun info() {
        println("This person's name is $name and they are $age year(s) old.")
    }
}

open class Chef(name: String, age: Int, var favoriteFood: String) : Person (name, age) {
    protected fun printMyFavoriteFood() {
        println(favoriteFood)
    }

    fun setMyFavoriteFood(food: String) {
        favoriteFood = food
        printMyFavoriteFood()
    }
}

class SousChef(name: String, age: Int, var favFood: String): Chef(name, age, favFood) {
    init {
        printMyFavoriteFood()
    }
}