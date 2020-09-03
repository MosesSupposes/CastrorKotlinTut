fun main() {
   val accounType = (AccountType.getAccountTypeByName("gold"))
    println(accounType)
}



enum class AccountType() {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM;

    companion object {
        fun getAccountTypeByName(name: String) = valueOf(name.toUpperCase())
    }
}
