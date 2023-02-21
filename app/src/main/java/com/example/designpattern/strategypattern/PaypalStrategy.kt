package com.example.designpattern.strategypattern

class PaypalStrategy : PaymentStrategy {

    private var emailId: String? = null
    private var password: String? = null

     constructor(email: String?, pwd: String?) {
        emailId = email
        password = pwd
    }

    override fun pay(amount: Int) {
        println("$amount paid using Paypal")
    }
}