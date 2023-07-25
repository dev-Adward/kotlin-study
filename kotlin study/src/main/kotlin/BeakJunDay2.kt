import java.util.Scanner

fun main() {
    val sc : Scanner = Scanner(System.`in`);

    var input = sc.nextInt()
    if(input >= 90 && input <= 100){
        println("A")
    } else if(input >= 90 && input <= 100) {
        println("A")
    } else if (input >= 80 && input <= 89){
        println("B")
    } else if (input >= 70 && input <= 79){
        println("C")
    } else if (input >= 60 && input <= 69){
        println("D")
    } else{
        println("F")
    }

}