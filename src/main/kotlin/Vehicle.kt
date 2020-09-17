// The "internal" modifier makes the class accessible only inside of the current module
internal class Axle(val numberofWheels: Int) {
    // ...
}

abstract class Vehicle(val color: String, val numberofWheels: Int, val numberOfDoors: Int) {

    // Inheitors of this class must implement the drive and stop methods.
    abstract fun drive()
    abstract fun stop()

    // This method is available to inheritors of this class.
    fun openDoor() {
        // ...
    }

    // This method is available to inheritors of this class.
    fun turnOffIgnition() {
        // ...
    }
}

abstract class TwoDoorCar(color: String, numberofWheels: Int): Vehicle(color, numberofWheels, 2) {
    abstract fun driveFast()

    override fun drive() {
        driveFast()
    }

    override fun stop() {
        // pull e-brake
    }
}


/*  This class doesn't have to implement the abstract "stop" or "drive" methods because
    they were implemented by its superclass: "TwoDoorCar".
*/
class Lambo(): TwoDoorCar("red", 4) {
    override fun driveFast() {
        println("Zoom zoom!")
    }
}

class Acura(): TwoDoorCar("blue", 4) {
    override fun driveFast() {
        println("Driving fast")
    }
}


class TownCar(color: String, numberofWheels: Int, numberOfDoors: Int): Vehicle(color, numberofWheels, numberOfDoors) {
    override fun drive() {
        println("So smooth...")
    }

    override fun stop() {
       // pull e-braake
    }
}

class HatchbackCar(color: String, numberofWheels: Int, numberOfDoors: Int): Vehicle(color, numberofWheels, numberOfDoors) {
    override fun drive() {
        println("Driving a hatchback")
    }

    override fun stop() {
       // pull e-brake
    }
}

