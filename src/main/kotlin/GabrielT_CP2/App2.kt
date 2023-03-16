package GabrielT_CP2

fun main() {
    println("Coba Masukkan anggka:")
    val number = readLine()?.toInt() ?: 0

    if (number % 11 == 0) {
        println("$number adalah kelipatan 11")
    } else {
        println("$number bukan kelipatan  11")
    }
}