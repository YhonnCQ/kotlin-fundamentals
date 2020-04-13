package types.rsk

fun main() {
    val kevin = Student("Kevin", "Jones", 1,"some tutor")
    print(kevin.id)
}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

class Student(firstName: String, lastName: String, _id: Int, var tutor: String = ""): Person(firstName, lastName) {
    val id: Int

    init {
        id = _id
    }

    override fun getName(): String{return ""}

    override fun getAddress(): String {
        return ""
    }
}