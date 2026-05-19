package com.example.shishusneh.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.shishusneh.database.AppDatabase
import com.example.shishusneh.database.BabyEntity
import kotlinx.coroutines.launch

class BabyViewModel(application: Application)
    : AndroidViewModel(application) {

    private val babyDao =
        AppDatabase
            .getDatabase(application)
            .babyDao()

    fun insertBaby(
        name: String,
        age: String,
        gender: String,
        weight: String,
        height: String
    ) {

        viewModelScope.launch {

            val baby = BabyEntity(
                name = name,
                age = age,
                gender = gender,
                weight = weight,
                height = height
            )

            babyDao.insertBaby(baby)
        }
    }
}
