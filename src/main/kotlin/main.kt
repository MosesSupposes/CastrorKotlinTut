fun main() {
    val person = Person("Moses", "Samuel", 22)
    val sibling = person.copy(firstName = "Joy", age = 7)
    println(person)
    println(sibling)

    val order = Order(amount = 100, customer = sibling)
    println(order)

    val newOrder = order.copy(amount = 200)
    println(newOrder)

    val newOrder2 = newOrder.copy(customer = person)
    println(newOrder2)
}


data class Order(val amount: Int, val customer: Person)

// Equals / Hashcode / toString are provided for us
data class Person(val firstName: String = "John", val lastName: String = "Doe", val age: Int)

