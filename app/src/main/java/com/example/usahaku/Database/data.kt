package com.example.usahaku.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
    (tableName = "table_toko")
data class toko(
    var namatoko: String,
    var alamat: String,
    var email: String,
    var notlp: String ) {
    @PrimaryKey(autoGenerate = true)
    var id_toko: Int = 0
}
@Entity
    (tableName = "tabel_produk")
data class produk(
    var namaproduk: String,
    var deskproduk: String,
    var hargapokok: Int,
    var hargajual: Int,
    var jumlah: Int,
    var satuanproduk: String) {
    @PrimaryKey(autoGenerate = true)
    var id_produk: Int = 0
}
@Entity
    (tableName = "tabel_pelanggan")
data class pelanggan(
    var namapelanggan: String,
    var emailpelanggan: String,
    var alamatpelanggan: String,
    var notelppelanggan: String)
   {
    @PrimaryKey(autoGenerate = true)
    var id_pelanggan: Int = 0
}

@Entity
    (tableName = "tabel_penjualan")
data class penjualan(
    var namapelanggan: String,
    var produk: String,
    var tanggaljual: String,
    var totalpembayaran:Int)
{
    @PrimaryKey(autoGenerate = true) var id_penjualan: Int = 0

}
@Entity
    (tableName = "tabel_tempproduk")
 class tempproduk(
    var namaprodukbeli: String,
    var hargasatuanbeli: Int,
    var hargatot: Int,
    var jumlahbeli: Int,
    var satuanprodukbeli: String)
{
    @PrimaryKey(autoGenerate = true) var id_temp: Int = 0

}
@Entity
    (tableName = "tabel_supplier")
data class supplier(
    var namasupplier: String,
    var desksupplier: String,
    var emailsupplier : String,
   var notelpsup : String,
    var alamatsup : String)
{
    @PrimaryKey(autoGenerate = true) var id_supplier: Int = 0

}
@Entity
    (tableName = "tabel_pembelian")
data class pembelian(
    var namasupplierp: String,
    var produkdes: String,
    var tanggalpesan: String,
    var totalpembelian:Int )
{
    @PrimaryKey(autoGenerate = true) var id_pembelian: Int = 0

}

@Entity
    (tableName = "tabel_temppesproduk")
class temppesproduk(
    var namaprodukpesbeli: String,
    var hargasatuanpesbeli: Int,
    var hargapestot: Int,
    var jumlahpesbeli: Int,
    var satuanpesprodukbeli: String)
{
    @PrimaryKey(autoGenerate = true) var id_temppes: Int = 0

}