/**
 * Usage of User input, when() and range
 */
fun main(){
    println("Enter your age: ")
    // take an input as Integer
       val age = readLine()?.toInt()

    when(age){
        in 0..5 -> println("You're a young kid")
        in 6..17 -> println("You're a teenager")
        18 -> println("Finally, you're 18")
        19,20 -> println("You're a young adult")
        in 21..65 -> println("You're an adult")
        else -> println("You're really old")
    }
}