fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    val filtered_elements1 = spices.filter{it.contains("curry")}.sortedBy{it.length}
    println(filtered_elements1)

    val filtered_elements2 = spices.filter{it.startsWith('c') && it.endsWith('e')}
    println(filtered_elements2)

     val filtered_elements3 = spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}
    println(filtered_elements3)

    val filtered_elements4 = spices.take(3).filter{it.startsWith('c')}
    println(filtered_elements4)
}