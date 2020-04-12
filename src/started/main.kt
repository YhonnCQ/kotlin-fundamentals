package started

import java.io.FileReader
import java.io.IOException
import java.lang.NumberFormatException
import java.util.*

fun main(){

    useQuestion()
    ranges()
    //exception()

}

fun exception() {

    var reader = FileReader("filename")
    try {
        reader.read()
    } catch (e:IOException) {

    } finally {

    }
}

fun ranges() {

    var numbers = listOf(1,2,3,4,5)

    //for (i in 1..10) {
    /*1 2 3 4 5 6 7 8 9 10*/
    //for (i in 1..10 step 2) {
    /*1 3 5 7 9*/
    //for (i in 10 downTo 1 step 2) {
    /*10 8 6 4 2*/
    //for (i in 1 until 10) {
    /*1 2 3 4 5 6 7 8 9*/

    for (i in numbers) {
        println(i)
        /*1 2 3 4 5*/
    }

    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Sam"] = 24
    ages["Alex"] = 24
    ages["Harry"] = 26

    for ((name,age) in ages) {
        println("$name is $age")
        /*
        Alex is 24
        Harry is 26
        Kevin is 55
        Sam is 24
         */
    }

    for((index,element) in numbers.withIndex()) {
        println("$element at $index")
        /*
        1 at 0
        2 at 1
        3 at 2
        4 at 3
        5 at 4
         */
    }

    var range = 'a'..'z'
    for (i in range) {
        println(i)
        /*a b c d e f g h i j k l m n o p q r s t u v w x y z*/
    }
}

fun useQuestion() {
    println("Hello, World!")

    val q = Question()
    //q = Question()    /*Val cannot be reassigned*/

    q.answer = "Four"
    //q.Question = ""   /*Val cannot be reassigned*/

    q.display()

    println("The answer to the question ${q.question} is ${q.answer}")

    val message = if (q.answer == q.correctAnswer) {
        "You were correct"
    } else {
        "Try again?"
    }

    println(message)

    q.printResult()

    val number:Int? = try {
        Integer.parseInt(q.answer)
    } catch (e:NumberFormatException) {
        null
    }

    println("Number is $number")
}

class Question {
    var answer: String? = null
    val correctAnswer = "42"
    val question: String = "What is the answer to life, the universe and everything?"

    fun display() {
        println("You said : $answer")
    }

    fun printResult() {
        when (answer) {
            correctAnswer -> println("You were correct")
            else -> println("Try Again?")
        }
    }
}