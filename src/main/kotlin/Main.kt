/**
 * pass 'List' as a parameter of function
 * The list look like as  : [2,3,5,6,7,8,9,4,3]
 * Search a number from the list by typing the number
 */
fun main(){
    val list = listOf(3,2,5,1,5,6,7)
    println("The list looks like the following: $list")
    println("Search for this number: ")

    // Take an input
    val input = readLine()?.toInt()

    // Check the given number is not null
    if (input != null){
        println("The index of $input is ${indexOf(list, input)}")
    }


}
// Create the function that take a list as parameters and return an Int value
fun indexOf(list : List<Int>, value : Int) : Int{
    for (i in 0..list.size - 1){
        if (list[i] == value){
            return i
        }
    }
    return -1
}
