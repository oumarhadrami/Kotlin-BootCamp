fun main(args: Array<String>) {
    var fishName = "Sharky"
    when(fishName.length){
        0-> println("Error Message")
        in 3..12-> println("Good Fish Name")
        else-> println("Ok, Fishname")
    }
}