package com.example.constucters


fun main(){

    val circle = Circle(radius = 3.0)
    val circle2 = CircleL(name = "rr")
    val circle4 = CircleL(diameter = 3)
   // val circle5 = CircleL(diameter = 6)



}

class  CircleL(val radius:Double){

    constructor(name: String):this( 1.0)
    constructor(diameter:Int):this(diameter/2.0)
    {

        println("diameter constructur")
    }
    init {
        println("Area:"+Math.PI*radius*radius)
    }



}

