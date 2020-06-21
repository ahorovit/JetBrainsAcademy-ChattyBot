import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var max = Int.MIN_VALUE
    var input: Int

    repeat(n) {
        input = scanner.nextInt()
        if (input > max && input % 4 == 0) {
            max = input
        }
    }

    println(max)
}