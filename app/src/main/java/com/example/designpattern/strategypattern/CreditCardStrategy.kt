package com.example.designpattern.strategypattern

class CreditCardStrategy : PaymentStrategy {


    private var name: String? = null
    private var cardNumber: String? = null
    private var cvv: String? = null
    private var dateOfExpiry: String? = null


    constructor(nm: String?, ccNum: String?, cvv: String?, expiryDate: String?) {
        name = nm
        cardNumber = ccNum
        this.cvv = cvv
        dateOfExpiry = expiryDate
    }

    override fun pay(amount: Int) {
        println("$amount paid with credit/debit card")
    }
}