package com.example.constucters



fun main(){

    val circle = Circle(radius = 3.0)

    //val circle4 = Circle(diameter = 3)
    //val circle5 = Circle(diameter = 6)
   // val circle2 = Circle(name = "rr")
    println(circle.radius)
      circle.radius =8.0

val person: Person = Person("john","smith")
    println(person.fullName)

    person.fullName = "john1 smith1"
    println(person.firstName)
    println(person.lastName)



}
open class A
class B :A(){

}

class Person(var firstName:String ,var  lastName :String):Circle(10){

    var fullName:String = ""
    set(value) {
        val component = value.split(" ")
    firstName = component[0]
    lastName= component[1]

        field = value
}


}

   open class  Circle(var radius:Double){

        constructor(name: String):this( 1.0)
        constructor(diameter:Int):this(diameter/2.0)
       {

            println("diameter constructur")
        }
        init {
            println("Area:"+Math.PI*radius*radius)
        }
fun draw(){
    val rad = radius
}


    }



