fun main(args: Array<String>) {
    swim()
    swim("slow")
    swim("slow", "20", 80)
    swim("slow", distance=30)
    walk()
    walk(distance = 8)
    var response = walk(8)
    println("$response")
}

fun swim(speed: String = "fast",
         time: String = "50",
         distance: Int = 40){
    println("swimming $speed in a distance of $distance meters in just $time minutes")
    }

fun walk(distance: Int = 3) : String{
    println("I walked around $distance kilometers today!!")
    return "Great"
}