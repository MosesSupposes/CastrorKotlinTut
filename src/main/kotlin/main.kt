fun main() {
    var user = User(firstName = "Moses", lastName = "Samuel")
    user.firstName = "Moses Aaron"
    user.lastName = "Samuel"
    user.printFullName()
    user.updateFirstName("Momo")
    user.printFullName()
    user.printWithPrefix("Mr.")

    var friend = User(firstName = "Renee", lastName = "Martinez")
    friend.printFullName()
    friend.firstNameLength()
}

