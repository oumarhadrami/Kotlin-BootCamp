import java.util.*
fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when(day){
        5->println("Thursday")
        else->println("Not Thursday")
    }

    println("Another way of doing this:")
    println(when(day){
        5->"Thursday"
        else->"Not Thursday"
    })

}