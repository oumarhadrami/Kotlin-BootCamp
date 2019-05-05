class SimpleSpice{

    val name: String = "curry"
    val level: String = "mild"
    val heat: Int
    get() {
        return when{
            level == "mild" -> 5
            else -> 0
        }
    }
}

fun main(args: Array<String>) {
    val simplespice1 = SimpleSpice()
    println("Name: ${simplespice1.name}, \n Heat: ${simplespice1.heat}")
}