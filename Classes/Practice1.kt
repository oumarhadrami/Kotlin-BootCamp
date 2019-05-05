fun main(args: Array<String>) {
    val sc1 = SpiceContainer("Curry")
    println("${sc1.label}")
}

data class SpiceContainer(val name: String){
    val label: String = name
}