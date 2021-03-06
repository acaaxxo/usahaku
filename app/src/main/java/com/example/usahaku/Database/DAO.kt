package com.example.usahaku.Database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TokoDao {

    @Insert
    fun insert(toko: toko)

    @Update
    fun update(toko: toko)

   @Query("SELECT * FROM table_toko")
    fun getAlltoko(): LiveData<List<toko>>

}
@Dao
interface Produkdao {

    @Insert
    fun insert(produk: produk)

    @Update
    fun update(produk: produk)

    @Delete
    fun delete(produk: produk)

    @Query("DELETE FROM tabel_produk")
    fun deleteAllproduk()

    @Query("SELECT * FROM tabel_produk")
    fun getAllproduk(): LiveData<List<produk>>

}
@Dao
interface Pelanggandao {

    @Insert
    fun insert(pelanggan: pelanggan)

    @Update
    fun update(pelanggan: pelanggan)

    @Delete
    fun delete(pelanggan: pelanggan)

    @Query("DELETE FROM tabel_pelanggan")
    fun deleteAllpelanggan()

    @Query("SELECT * FROM tabel_pelanggan")
    fun getAllpelanggan(): LiveData<List<pelanggan>>

}
@Dao
interface Penjualandao {

    @Insert
    fun insert(penjualan: penjualan)

    @Update
    fun update(penjualan: penjualan)

    @Delete
    fun delete(penjualan: penjualan)

    @Query("DELETE FROM tabel_penjualan")
    fun deleteAllpenjualan()

    @Query("SELECT * FROM tabel_penjualan")
    fun getAllpenjualan(): LiveData<List<penjualan>>

}


@Dao
interface tempprodukDao {
    @Query("SELECT * from tabel_tempproduk")
    fun alldatatempproduk(): LiveData<List<tempproduk>>

    @Query("SELECT * from tabel_tempproduk")
    fun alldatatemp(): List<tempproduk>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(tempproduk: tempproduk)

    @Delete
    suspend fun delete(tempproduk: tempproduk)

    @Query("DELETE FROM  tabel_tempproduk")
    suspend fun deleteALLtempproduk()
}

@Dao
interface supplierdao {

    @Insert
    fun insert(supplier: supplier)

    @Update
    fun update(supplier: supplier)

    @Delete
    fun delete(supplier: supplier)

    @Query("SELECT * FROM tabel_supplier")
    fun getAllsupplier(): LiveData<List<supplier>>

}

@Dao
interface pembeliandao {

    @Insert
    fun insert(pembelian: pembelian)

    @Update
    fun update(pembelian : pembelian)

    @Delete
    fun delete(pembelian: pembelian)

    @Query("SELECT * FROM tabel_pembelian")
    fun getAllpembelian(): LiveData<List<pembelian>>

}

@Dao
interface temppesprodukDao {
    @Query("SELECT * from tabel_temppesproduk")
    fun alldatatemppesproduk(): LiveData<List<temppesproduk>>

    @Query("SELECT * from tabel_temppesproduk")
    fun alldatatemppes(): List<temppesproduk>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(temppesproduk: temppesproduk)

    @Delete
    suspend fun delete(temppesproduk: temppesproduk)

    @Query("DELETE FROM  tabel_temppesproduk")
    suspend fun deleteALLtemppesproduk()
}

