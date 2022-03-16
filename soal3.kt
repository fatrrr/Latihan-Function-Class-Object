class Barang(
    private val nama: String = "Indomie Mie Goreng",
    private var harga: Int = 3500,
    private var jumlah: Int = 1,
    private var diskon: Int = 5 ){
    fun tampil(){
        println("Nama Barang = $nama, ")
        println("Harga = $harga, ")
        println("Jumlah = $jumlah, ")
        println("Diskon = $diskon%,")
    }
    fun hitungTotal(){
        val total = harga * jumlah * diskon
        // val total = harga * jumlah * ((100-diskon)/100)
        //Apa benar ini? langsung dikali diskon, bukannya dikurangi harga diskon
        println("Total Harga = $total")
    }
}

fun main (){
    val b : Barang = Barang()
    b.tampil()
    b.hitungTotal()
}