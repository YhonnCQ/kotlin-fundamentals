package types.rsk

fun main() {
    val kevin = Student("Kevin", "Jones", 0, "some tutor")
    print(kevin.id)
}

class Program {
    companion object {
        @JvmStatic
        fun main() {
            val kevin = Student("Kevin", "Jones", 0, "some tutor")
            print(kevin.id)
        }
    }
}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

open class Student(firstName: String, lastName: String, _id: Int, var tutor: String = ""): Person(firstName, lastName) {
    val id: Int

    init {
        id = _id
    }

    fun enrole(courseName: String){
        val course = Courses.allCourses
            .firstOrNull { it.Title == courseName }
    }

    override fun getName(): String{return ""}

    override fun getAddress(): String {
        return ""
    }

    companion object: XmlSerializer<Student> {
        fun createUndergrad(name: String): Undergraduate {
            return Undergraduate(name)
        }

        fun createPostgrad(name: String): Postgraduate {
            return Postgraduate(name)
        }

        override fun toXml(item: Student) {

        }
    }
}

class Undergraduate(firstName: String): Student(firstName, "", 1) {

}

class Postgraduate(firstName: String): Student(firstName, "", 1) {

}

interface XmlSerializer<T> {
    fun toXml(item: T)
}