package dataclasses.rsk

fun main() {
    var kevin = Student(1, "Kevin")
    var jones = Student(1, "Kevin")

    println(kevin)
    // class Student
    /*
    dataclasses.rsk.Student@49476842
    */
    // data class Student
    /*
    Student(id=1, name=Kevin)
     */
    if (kevin == jones) {
        println("Equal")
    } else {
        println("Not equal")
    }

    var newKevin = kevin.copy(name = "Robert")

    println(newKevin)
}

data class Student(val id: Int, val name: String) {

}