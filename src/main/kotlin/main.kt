fun main() {
    val values = listOf(1,2,3,4,5,6,7)
    for (number in values) {
       println(number)
    }
    println("-------------------------------")

    for (i in 0 until 10) {
        println(i)
    }
    println("-------------------------------")

    for (i in 0 until 100 step 10) {
        println(i)
    }
    println("-------------------------------")

    for (i in 100 downTo 0 step 10) {
        println(i)
    }
    println("-------------------------------")

    val people = listOf(Human("Donn"), Human("Jane"), Human("Karthik"))
    for (person in people) {
        println(person.name)
    }

}

data class Human(val name: String)

