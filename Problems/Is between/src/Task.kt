import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()

    val min = Math.min(second, third)
    val max = Math.max(second, third)

    println(first >= min && first <= max)
}
