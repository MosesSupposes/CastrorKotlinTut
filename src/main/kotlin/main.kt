fun main() {
    val accountTypeFromApi = "gold"
    val accountType = AccountType.valueOf(accountTypeFromApi.toUpperCase())

    val user = User("Moses", "Samuel", AccountType.PLATINUM)

    user.accountType
}



enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM
}
