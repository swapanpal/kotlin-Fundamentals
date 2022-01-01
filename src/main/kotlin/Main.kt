/**
 * Function() example-1 (with & without parameters)
 */
fun main(){
    // call the function
    functionWithoutParameters()

    // call the powFunction with parameters
    printPow(2, 3)

}

// function without parameters
fun functionWithoutParameters(){
    println("First")
    println("Second")
    println("Third")
}

// function with parameters
fun printPow(base : Int, exponent : Int){
    var result = 1
    for (i in 1..exponent){
        result *= base
    }
    println("$base to the power of $exponent is: $result")
}