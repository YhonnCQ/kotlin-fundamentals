package generics.rsk

fun main() {
    var names: List<String> = listOf("Kevin", "Alex")

    val name = names.itemAt(0)

    println(name)

    val n: Node<Int> = Node(2)

    println(n.value())
}

fun <T> List<T>.itemAt(ndx: Int): T {
    return this[ndx]
}

class Node<T: Number>(private val item: T) {
   fun value(): T {
       return item
   }
}