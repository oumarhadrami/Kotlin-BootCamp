fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    val filtered_elements1 = spices.filter{it.contains("curry")}
    println(filtered_elements1)

    val filtered_elements2 = spices.filter{it[0]=='c' && it[it.length-1]=='e'}
    println(filtered_elements2)

    val first3elements = listOf(spices[0],spices[1],spices[2])
    val filtered_elements3 = first3elements.filter{it[0] == 'c'}
    println(filtered_elements3)
}