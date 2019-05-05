fun main(args: Array<String>) {
    walk()
}

fun walk(distance: Int = 4, 
         food: List<String> = listOf("apple","orange"),
         earned: Array<String> = arrayOf("500","1000")){
             println("He walked $distance kilometers by eating just ${food[0]} and ${food[1]}. He bought those with the ${earned[0]} and ${earned[1]} bills he earned today")
         }