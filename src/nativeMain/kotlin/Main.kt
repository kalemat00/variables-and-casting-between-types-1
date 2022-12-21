fun main() {
    var int1 : Int = 34
    var double1 : Double = 34.12
    var float1 : Float = 22.10f
    var long1 : Long = 4566

    var sum : Double = double1 + float1 + long1 + int1

    println("Sum of the four numbers: ${sum}")

    //all the numbers after the first 2 decimals came from-
    //the float variable (because the float variable cannot represent-
    //accurately some decimal numbers)
}