import java.util.*
fun main(args: Array<String>) {
    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = Food(day)
    println("Today is ${day} so the fish will eat $food")
}

fun randomDay() : Int{
    val week = listOf("Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    return (Random().nextInt(7))
}

fun Food(day : Int) :String{
    return when(day){
        1->"Pellets"
        2->"Snacks"
        3->"Daifuku"
        4->"croquembouche"
        5->"biscuits"
        6->"oreo"
        7->"pie"
        else->"Nothing"
    }
}