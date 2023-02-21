package com.example.designpattern.strategypattern

class ShoppingCart {

    //List of items
    var items: MutableList<Item>? = null

    init {
        items = ArrayList()
    }

    fun addItem(item: Item) {
        items!!.add(item)
    }

    fun removeItem(item: Item) {
        items!!.remove(item)
    }

    private fun calculateTotal(): Int {
        var sum = 0
        for (item in items!!) {
            sum += item.getPrice()
        }
        return sum
    }

    fun pay(paymentMethod: PaymentStrategy) {
        val amount = calculateTotal()
        paymentMethod.pay(amount)
    }
}