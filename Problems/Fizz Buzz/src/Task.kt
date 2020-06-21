import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val min = scanner.nextInt()
    val max = scanner.nextInt()

    for (i in min..max) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}