fun main(args: Array<String>) {
    println(whatShouldIdoToday(mood = "Sad",weather = "Rainy"))
    println(whatShouldIdoToday(mood = "Happy", temperature = 10))
    println(whatShouldIdoToday(mood="Tired", temperature = 40))

}

fun whatShouldIdoToday(mood: String,
                       weather: String = "Sunny",
                       temperature: Int = 24) : String{
return when{
    mood == "Sad" && weather == "Rainy" -> "Stay Home"
    mood == "Happy" -> "Go Out !"
    else-> "Well, Temperature is ${temperature} celsius, so I'll relax" 
}
}