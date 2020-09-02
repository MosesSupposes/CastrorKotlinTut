fun main() {
    val sw = Vehicle.SteeringWheel()
    sw.info()

    val transmission = Vehicle.Transmission()
    transmission.shift()
}


class Vehicle {
    var brand: String = "unknown"

    fun info() = println(brand)

    class SteeringWheel {
        val name = "The Steering Wheel"
        fun info() = println(name)
    }

    class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted")
    }
}