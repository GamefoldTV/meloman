fun calculateDiscount(amount: Int, isRegularCustomer: Boolean): Int {
    return when (amount) {
        in 0..1000 -> 0
        in 1001..10000 -> 100
        else -> (amount * 0.05).toInt()
    }.let { discount ->
        if (isRegularCustomer) (discount + (discount * 0.01)).toInt()
        else discount
    }
}

fun main() {
    val regularCustomer = true
    val purchaseAmount = 1001
    val discount = calculateDiscount(purchaseAmount, regularCustomer)
    println("Сумма покупки: $purchaseAmount руб.")
    println("Постоянный покупатель: ${if (regularCustomer) "да" else "нет"}")
    println("Скидка: $discount руб.")
    println("Итоговая сумма: ${purchaseAmount - discount} руб.")
}
