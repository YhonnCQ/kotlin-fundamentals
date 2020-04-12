package functions.rsk

import java.math.BigInteger

fun main() {
    println(fib(100000, BigInteger("1"), BigInteger("0")))
}

tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b else fib(n - 1, a + b, a)
}

//  1, 1, 2, 3, 5, 8, 13