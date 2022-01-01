/**
 * Function() example-2
 * (Sum of the values from 1 to 5 is 15
 * Take number '5' and print result (1 + 2 + 3 + 4 + 5 = 15
 */
fun main(){
    // call the function
    sumUpToN(10)

}
// function with parameters
fun sumUpToN(n : Int){
    var result = 0
    for (i in 1..n){
        result += i
    }
    println("The Sum of the values from 1 to $n is: $result")
}