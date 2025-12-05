package com.example.myapplication.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
//tambahii 2 import ini
import androidx.room.Delete
import androidx.room.Update

@Dao
interface SiswaDao {
    @Query(value = "SELECT * from tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

    //Edit : tambah 3 fungsi berikut
    @Query("SELECT * from tblSiswa WHERE id = :id")
    fun getSiswa(id: Int): Flow<Siswa?>

    @Delete
    suspend fun delete(siswa: Siswa)

    @Update
    suspend fun update(siswa: Siswa)
}