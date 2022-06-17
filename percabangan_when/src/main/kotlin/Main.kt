fun main(){
    var bulan = 9
    var result = when (bulan){
        1 -> "januari"
        2 -> "febuari"
        3 -> "maret"
        4 -> "april"
        5 -> "mei"
        6 -> "juni"
        7 -> "juli"
        8 -> "agustus"
        9 -> "september"
        10 -> "oktober"
        11 -> "november"
        12 -> "desember"
        else -> "input yang dimasukkan salah"
    }
    println(result)
}