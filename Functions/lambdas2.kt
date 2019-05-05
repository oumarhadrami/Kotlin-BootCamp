fun main(args: Array<String>) {
println(revenue(400,230))
}

var revenue: (Int,Int) -> Int = {money,expenses -> money - expenses}