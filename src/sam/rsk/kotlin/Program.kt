package sam.rsk.kotlin

import sam.rsk.java.Created
import sam.rsk.java.User

fun main() {
    var user = User("Kevin")

    var count = 0

    var eventListener = Created{ println("User $it has been created: ${++count} times") }

    user.create(eventListener)

    user.create { "User $it has been created: ${++count} times" }
}