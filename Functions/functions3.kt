import java.util.*
fun main(args: Array<String>) {
    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = randomFood()
    println("Today is $day so the fish will eat $food")
}

fun randomDay() : String{
    val week = listOf("Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    return week[Random().nextInt(7)]
}

fun randomFood() :String{
    val food = listOf("biscuits", "Pellets", "Snacks", "Daifuku", "croquembouche", "oreo", "pie")
    return food[Random().nextInt(7)]
}