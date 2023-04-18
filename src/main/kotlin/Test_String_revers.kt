fun main(){
    print("Write a sentanc : ")
    var input : String = readln()
    print("The result - " + ReversString(input))
}
fun ReversString(str_veriable:String): String {
//    var revers = ""
//    var counter_varieble = str_veriable.length - 1
//    while (counter_varieble >= 0) {
//        revers += str_veriable[counter_varieble]
//        counter_varieble--
//    }
//    return revers
    return str_veriable.reversed()
    }