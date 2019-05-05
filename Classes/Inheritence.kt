open class Human(var name: String = "Hadramy", var age: Int = 24 ){

    open val height: Int = 184
    open var weight: Int = 84

    val BMI: Int 
    get() = height/weight

    open fun swim(){
        println("swimming fast as a Human coz my height is $height")
    }
}

class Student : Human(){
    override val height: Int = 150
    override fun swim(){
        println("swimming fast as a Student coz my height is $height")
    }
} 

fun main(args: Array<String>) {
    val student1 = Student()
    student1.swim()
    val human1 = Human()
    human1.swim()
}
