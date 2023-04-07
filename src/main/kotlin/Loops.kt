fun main(){
    myFunction("John")
    myFunction("Jane")
    myFunction("George")
    var i = 0
    do {
        println(i)
        i++
    }
    while (i < 5)

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }

    for (nums in 5..15) {
        if (nums == 10) {
            continue
        }
        println(nums)
    }

}
fun myFunction(fname: String) {
    println(fname + " Doe")
}