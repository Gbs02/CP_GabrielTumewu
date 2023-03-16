package GabrielT_CP2

fun main() {
    println("Masukan angka: ")
    val n = readLine()?.toInt() ?: 0
    val m = readLine()?.toInt() ?: 0
    var num = n
    var seq = mutableListOf<Int>()

    while (num > 1) {
        seq.add(num)
        if (num % m == 0) {
            num = num / m
        } else {
            println("Payah!")
            break
        }
    }
    if (num == 1) {
        seq.add(num)
        println(seq.joinToString(", "))
    }
}