/**
 * Function() with return value example-1
 *
 * (Sum of the values from 1 to 5 is 15
 * Take number '5' and print result (1 + 2 + 3 + 4 + 5 = 15
 */
fun main(){
    // call the function
    val result = sumUpToN(10)
    println("The Sum of the values from 1 to 10 is: $result")

}
// function with parameters
fun sumUpToN(n : Int) : Int{
    var result = 0
    for (i in 1..n){
        result += i
    }
    return result

}