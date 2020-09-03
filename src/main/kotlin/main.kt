fun main() {
    val fromApi = "GoLd"
    val accountType = AccountType.valueOf(fromApi.toUpperCase())
    println(accountType.calculateDiscountPercent())
}



enum class AccountType(val discountPercent: Int) {
    BRONZE (5){
        override fun calculateDiscountPercent(): Int = discountPercent + 10
    },
    SILVER(10) {
        override fun calculateDiscountPercent(): Int  = discountPercent + 10
    },
    GOLD(15) {
        override fun calculateDiscountPercent(): Int = discountPercent + 10
    },
    PLATINUM(20) {
        override fun calculateDiscountPercent(): Int = discountPercent + 10
    };

    abstract fun calculateDiscountPercent(): Int
}
