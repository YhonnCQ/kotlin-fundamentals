package withapply.rsk

import java.util.*

class Meeting {
    var Title: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create() {}
}

fun main() {
    val m = Meeting()
    m.Title = "Board Meeting"
    m.When = Date(2017,1,1)
    m.Who.add("Kevin")

    with(m) {
        Title = "Board Meeting"
        When = Date(2017,1,1)
        Who.add("Kevin")
    }

    m.apply {
        Title = "Board Meeting"
        When = Date(2017,1,1)
        Who.add("Kevin")
    }.create()
}