package com.tuwaiq.fragmentlesson.ui.main

import androidx.lifecycle.ViewModel
import com.tuwaiq.fragmentlesson.data.Repo

class MainViewModel : ViewModel() {
    private val repo = Repo()
    fun getAllUsers() = repo.getAllusers()
}