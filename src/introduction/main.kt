package introduction

import introduction.com.rsk.Person

fun main() {
    println("Hello, World!")

    val kevin = Person("Kevin")

    //kevin.Name = "Kevin"

    println("Name is ${kevin.Name}")

    kevin.Name = "Steve"

    println("Name is ${kevin.Name}")

    kevin.display()

    kevin.displayWithLambda(::printName)

    //kevin = Person()  /*Val cannot be reassigned*/
}

fun printName(name: String){
    println(name)
}