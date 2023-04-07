fun main(){
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[3])
    cars[0] = "Opel"
    for (x in cars) {
        println(x)
    }
}