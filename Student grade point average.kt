fun main(args: Array<String>) {

    println("How many points do you want to enter?")
    try {
        val Number = readLine()?.toInt()!!
        person(Number)

    }catch (e:NumberFormatException){
        println("Enter the correct amount")
        println(e.message)

    }catch (e:Exception){
        println("Invalid entered value")
        println(e.message)
    }


}

fun person(Number:Int ,){

    var Total = 0f
    for (num in 1..Number){
        println("Enter the score : $num")
        var num  = readLine()?.toFloat()!!
        Total += num
    }

    val adjusted = Total / Number
    println("Your total grade point average : $adjusted")






}