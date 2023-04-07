fun main(){
    val time = 20
    if (time < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    val day = 4
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

}