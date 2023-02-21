package com.example.designpattern.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.designpattern.R
import com.example.designpattern.databinding.FragmentFirstBinding
import com.example.designpattern.factorypattern.Shape
import com.example.designpattern.factorypattern.ShapeFactory
import com.example.designpattern.singleton.Singleton
import com.example.designpattern.strategypattern.CreditCardStrategy
import com.example.designpattern.strategypattern.Item

import com.example.designpattern.strategypattern.PaypalStrategy

import com.example.designpattern.strategypattern.ShoppingCart


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindView(view)
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    private fun bindView(view: View) {


        manageSingletonPattern()

        manageFactoryPattern()

        manageStrategyPattern()
    }

    private fun manageStrategyPattern() {
        val cart = ShoppingCart()

        val item1 = Item("1234", 10)
        val item2 = Item("5678", 40)

        cart.addItem(item1)
        cart.addItem(item2)

        //pay by paypal

        //pay by paypal
        cart.pay(PaypalStrategy("myemail@example.com", "mypwd"))

        //pay by credit card

        //pay by credit card
        cart.pay(CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"))
    }


    private fun manageFactoryPattern() {
        val shapeFactory = ShapeFactory()

        //get an object of Circle and call its draw method.

        //get an object of Circle and call its draw method.
        val shape1: Shape? = shapeFactory.getShape("CIRCLE")

        //call draw method of Circle

        //call draw method of Circle
        shape1?.draw()

        //get an object of Rectangle and call its draw method.

        //get an object of Rectangle and call its draw method.
        val shape2: Shape? = shapeFactory.getShape("RECTANGLE")

        //call draw method of Rectangle

        //call draw method of Rectangle
        shape2?.draw()

        //get an object of Square and call its draw method.

        //get an object of Square and call its draw method.
        val shape3: Shape? = shapeFactory.getShape("SQUARE")

        //call draw method of square

        //call draw method of square
        shape3?.draw()
    }

    private fun manageSingletonPattern() {
        Singleton.show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}