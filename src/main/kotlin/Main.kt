/**
 * Example-2 of kotlin 'when'
 */
fun main(){
    println("Where are you from?")
    // take userInput
    val country = readLine()

    when(country){
        "India" -> println("Namaste")
        "USA" -> println("Hello")
        "Germany" -> println("Hallo")
        "Russia" -> println("Privet")
        else -> println("I don't know that")
    }
}