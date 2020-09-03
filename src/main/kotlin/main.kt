fun main() {
   println(AccountType.GOLD)
    println(AccountType.GOLD.discountPercent)
    println(AccountType.GOLD.numberOfSubscriptions)

    val value = AccountType.valueOf("Platinum".toUpperCase())
    println(value)
    println(value.discountPercent)
    println(value.numberOfSubscriptions)
}



enum class AccountType(val discountPercent: Int, val numberOfSubscriptions: Int) {
    BRONZE(10, 1),
    SILVER(15, 5),
    GOLD(20, 10),
    PLATINUM(25, 15)
}
