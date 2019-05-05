fun main(args: Array<String>) {
    var a = intArrayOf(1,5,4,7)
    for ((index,element) in a.withIndex()) println("$element is at index $index")
}