// The 2 lines below are equivalent
//class User constructor(var firstName: String, var lastName: String) {
class User(var firstName: String, var lastName: String) {

    fun fullName(): String = "$firstName $lastName"

    override fun toString(): String = fullName()
}