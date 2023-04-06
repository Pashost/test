import java.util.*

fun main(){
    var Var = "can be changed"
    val Val = "Can not be changed"
    //Varibles type
    var name = "John"      // or (var name: String) String (text)
    val birthyear = 1975   // or(val birthyear: Int) Int (number)

    println(name)          // Print the value of name
    println(birthyear)     // Print the value of birthyear


    // Display variebles

    val name1 = "John"
    println("Hello " + name1)


    val firstName = "John "
    val lastName = "Doe"
    val fullName = firstName + lastName
    println(fullName)

    //exampless
    //Strings
    val testStr : String = "dfjijbjkfjbjfjkdnjfnjefjn"
    println(testStr.uppercase(Locale.getDefault()) + testStr.length)
}