fun main() {
    AccountType.values().forEach { println(it) }
}



enum class AccountType() {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM;
}
