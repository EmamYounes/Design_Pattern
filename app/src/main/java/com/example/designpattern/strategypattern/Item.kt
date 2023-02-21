package com.example.designpattern.strategypattern

class Item {

    private var upcCode: String? = null
    private var price = 0

    constructor(upc: String?, cost: Int) {
        upcCode = upc
        price = cost
    }

    fun getUpcCode(): String? {
        return upcCode
    }

    fun getPrice(): Int {
        return price
    }
}