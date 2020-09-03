fun main() {
    val accountType = AccountType.GOLD

    // When dealing with a "when" statement, you don't need to exhaustively handle all the cases.
    when (accountType) {
        AccountType.PLATINUM -> println("Access allowed")
    }

    // When dealing with a "when" expression, you must exhaustively handle all the cases.
    val message = when (accountType) {
        AccountType.PLATINUM-> "Access allowed"
        else -> "Not eligible for special access"
    }

    println(message)
}



enum class AccountType() {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM;
}
