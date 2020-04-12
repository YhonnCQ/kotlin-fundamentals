@file:JvmName("DisplayFunctions")

package functions.rsk

fun main() {
    log(message = "Hello, World!",loglevel = 2)
    //log(loglevel = 2, message = "Hello, World!")
    println(max(1,2))
}

fun display(message: String): Boolean{
    println(message)
    return true
}

@JvmOverloads
fun log(message: String, loglevel: Int = 1) {
    println(message + loglevel)
}


fun max(a: Int, b:  Int ): Int = if (a > b) a else b
