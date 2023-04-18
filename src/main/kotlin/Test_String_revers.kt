fun main(){
    print("Write a sentanc : ")
    var input : String = readln()
    print("The result - " + ReversString(input))

    val litTest = listOf(
        (100),
        (3.14),
        (""),
        ("Hi world")

    )
    for (v in litTest) {
        println(reverseString2(v.toString()))
    }


}
fun ReversString(str_veriable:String): String {
    var revers = ""
    var counter_varieble = str_veriable.length - 1
    while (counter_varieble >= 0) {
        revers += str_veriable[counter_varieble]
        counter_varieble--
    }
    //return revers
    return str_veriable
    }
fun reverseString2(str_variable2: String): String {
    val str_value_char = str_variable2.toCharArray()
    var p1 = str_value_char.size - 1
    var p0 = 0
    while (p0 <= p1) {
        val t = str_value_char[p0]
        str_value_char[p0++] = str_value_char[p1]
        str_value_char[p1--] = t
    }
    return String(str_value_char)
}