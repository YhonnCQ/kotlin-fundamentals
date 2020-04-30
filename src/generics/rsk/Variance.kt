package generics.rsk

fun main() {
    var financialMeeting = mutableListOf(FinanceMeeting())
    var meeting: AllMeetings<FinanceMeeting> = AllMeetings(financialMeeting)

    attendAllMeetings(meeting)
}

class AllMeetings<out T: Meeting>(val meetings: List<Meeting>) {
    val count: Int get() = meetings.count()

    operator fun get(i: Int) = meetings[i]
}

fun attendAllMeetings(meetings: AllMeetings<Meeting>) {
    for (i in 0 until meetings.count) {
        meetings[i].attend()
    }
}