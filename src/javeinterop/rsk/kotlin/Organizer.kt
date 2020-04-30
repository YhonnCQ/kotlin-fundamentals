package javeinterop.rsk.kotlin

import javeinterop.rsk.java.Address
import javeinterop.rsk.java.Meeting

fun main() {
    val m = Meeting()

//    m.addTitle("Title")
//    m.addTitle(null)
//
//    val title: String? = m.meetingTitle()
//
//    println(title)
    var title: String = m.titleCanBeNull() ?: "nobody"
    println(title)
}

class HomeAddress: Address {
    override fun getFirstAddress(): String {
        return ""
    }
}

class WorkAddress: Address {
    override fun getFirstAddress(): String? {
        return ""
    }
}