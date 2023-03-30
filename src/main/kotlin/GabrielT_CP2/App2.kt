package GabrielT_CP2

fun main() {
do {
    println("Coba Masukkan anggka:")
    val number = readLine()?.toInt() ?: 0

    if (number % 11 == 0) {
        println("$number adalah kelipatan 11")
    }else if (number == 0){
        break
    }
    else {
        println("$number bukan kelipatan  11")
    }
}while (number !=0)
}