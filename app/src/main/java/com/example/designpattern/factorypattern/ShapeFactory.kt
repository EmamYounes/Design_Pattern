package com.example.designpattern.factorypattern

class ShapeFactory {


    fun getShape(shapeType: String): Shape? {

        return when (shapeType) {
            "CIRCLE" -> {
                Circle()
            }
            "RECTANGLE" -> {
                Rectangle()
            }
            "SQUARE" -> {
                Square()
            }
            else -> null
        }

    }
}