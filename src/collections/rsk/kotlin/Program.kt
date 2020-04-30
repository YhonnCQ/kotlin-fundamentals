package collections.rsk.kotlin

import collections.rsk.java.Meeting
import collections.rsk.java.Organizer

fun main(){
    var people: MutableList<Person?>? = null

    people = mutableListOf(Person(23), Person(23))

    people.add(null)

    for (person: Person in people.filterNotNull()) {
        println(person.age)
    }
}

class Person(val age: Int): Organizer {
    override fun processMeetings(meetings: List<Meeting>) {
        throw UnsupportedOperationException("not implemented")
    }

}