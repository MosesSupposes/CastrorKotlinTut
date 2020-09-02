fun main() {
    val myCar = Vehicle()
    myCar.brand = "Fiat"
    myCar.info()

    // As you can see, we must access the inner class 'Steering Wheel' as an instance of the vehicle class
    // as opposed to calling it as a static member of the class as we do with 'Transmission' (line 12).
//    val sw = Vehicle.SteeringWheel()
    val sw = myCar.SteeringWheel()
    sw.info()

    val transmission = Vehicle.Transmission()
    transmission.shift()
}


class Vehicle {
    var brand: String = "unknown"

    fun info() = println(brand)

    // we must declare this subclass as being an 'inner' class in order to access the variables defined outside this class
    inner class SteeringWheel {
        val name = "Leather"
        fun info() = println("$brand is the brand of the vehicle with a $name steering wheel")
    }

    class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted")
    }
}