fun main() {
    val lambo = Lambo()
    val acura = Acura()
    val hatchBack = HatchbackCar("purple", 4, 2)
    val townCar = TownCar("brown", 4, 4)

    driveVehicle(lambo)
    driveVehicle(acura)
    driveVehicle(hatchBack)
    driveVehicle(townCar)
}

fun driveVehicle(vehicle: Vehicle) {
    vehicle.drive()
}
