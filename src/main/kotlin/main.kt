fun main() {
    var items = mutableMapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California"
    )

//    items["TX"] = "Texas"
    items.put("TX", "Texas") // this is the same as the line above

    items.remove("NY")
    println(items)

    items.put("NJ", "Joisey") // this will replace the existing "NJ" key in the map
    val result = items.putIfAbsent("NJ", "New Jersey") // this won't overwrite the existing field if it's already present
    println(result) // prints Joisey
    println(items)

    items["NJ"] = "Joisey"
    items.remove("NJ", "Joisey") // only remove this key if its value is Joisey
    println(items)

    items.getOrPut("UT", { "Utah" }) // if "UT" doesn't exist, add it to the map with the specified value
    println(items)

    items.clear()
    println(items) // {}
}






