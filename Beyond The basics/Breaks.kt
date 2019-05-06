fun main(args: Array<String>) {
    for(i in 1..10){
        loop@ for(j in 1..3){
            if(j>2) break@loop
            else println("$i")
        }
    }
}