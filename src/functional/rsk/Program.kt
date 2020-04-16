package functional.rsk

fun main() {
    var program = Program()
    var total = 0
//    program.fibonacci(8)
//    program.fibonacci(8, object: Process{
//        override fun execute(value: Int) {
//            println(value)
//        }
//
//    })
//    program.fibonacci(8) { n -> println(n)}
//    program.fibonacci(8) {println(it)}
//    program.fibonacci(8, ::println)
    program.fibonacci(8) { total += it}
    println(total)
}

interface Process {
    fun execute(value: Int)
}
class Program {

    //  0 1 1 2 3 5 8 13

    fun fibonacci(limit: Int, action: (Int) -> Unit) {
        var prev = 1
        var current = 0
        for(i: Int in 1..limit) {
            action(current)

            var temp = prev + current
            current = prev
            prev = temp
        }
    }

    fun fibonacci(limit: Int, action: Process) {
        var prev = 1
        var current = 0
        for(i: Int in 1..limit) {
            action.execute(current)

            var temp = prev + current
            current = prev
            prev = temp
        }
    }

    fun fibonacci(limit: Int) {
        var prev = 1
        var current = 0
        for(i: Int in 1..limit) {
            println(current)

            var temp = prev + current
            current = prev
            prev = temp
        }
    }
}
