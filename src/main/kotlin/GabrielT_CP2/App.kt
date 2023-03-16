package GabrielT_CP2

fun main(){
    println("Masukkan angka:")
    val a = readLine()?.toInt() ?: 0
    val b = readLine()?.toInt() ?: 0
    val ganjil = mutableListOf<Int>()

    for(i in a..b) {
        if (i % 2 == 1) {
            ganjil.add(i)
        }
    }

    println("Nilai ganjil dari3 $a..$b adalah $ganjil")
    val hasil = ganjil.sum()

    println("Hasil Penjumlahannya adalah = $hasil ")

}

