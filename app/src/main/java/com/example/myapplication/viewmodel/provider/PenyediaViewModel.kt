package com.example.myapplication.viewmodel.provider

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myapplication.repository.AplikasiSiswa
import com.example.myapplication.viewmodel.EntryViewModel
import com.example.myapplication.viewmodel.HomeViewModel
import androidx.lifecycle.createSavedStateHandle
import com.example.myapplication.viewmodel.DetailViewModel // 2. Pastikan import ini ada
import com.example.myapplication.viewmodel.EditViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
        }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
        initializer {
            DetailViewModel(
                createSavedStateHandle(), // Mengambil argumen navigasi (idSiswa)
                aplikasiSiswa().container.repositoriSiswa
            )
        }
        initializer {
            EditViewModel(
                createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa
            )
        }
    }
}

/**
 * Fungsi ekstensi query untuk objek [Application] dan mengembalikan sebuah
 * instance dari [AplikasiSiswa].
 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)