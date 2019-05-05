fun main(args: Array<String>) {
    if(shouldINotwalk(temperature = 40, day = "Thursday")) println("Let's go for a walk")
    if(shouldINotwalk(temperature = 20, day = "Saturday")) println("Let's not go for a walk")
}

fun shouldINotwalk(temperature: Int, day: String, distance: Int = getDistance()) : Boolean{
    when{
    isNotTooHot(temperature) -> return true
    isNotWeekend(day) -> return true
    distance > 5 -> return true
    else-> return false
}
}

fun isNotTooHot(temperature: Int) = temperature > 30
fun isNotWeekend(day: String) = day !in listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday") 
fun getDistance() = 6