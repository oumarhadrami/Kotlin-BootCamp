fun main(args: Array<String>) {
    getFortuneCookie()
}

fun getFortuneCookie() : String{
    val fortunes = listOf("You will have a great day!",
"Things will go well for you today.",
"Enjoy a wonderful day of success.",
"Be humble and all will turn out well.",
"Today is a good day for exercising restraint.",
"Take it easy and enjoy life!",
"Treasure your friends because they are your greatest fortune.")

println("Enter your birthday:")
val birthday = readLine()!!
val fortune = 3
return fortunes[fortune]  
}