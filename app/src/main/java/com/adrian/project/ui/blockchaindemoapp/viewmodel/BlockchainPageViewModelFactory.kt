package com.adrian.project.ui.blockchaindemoapp.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.adrian.project.MyApplication
import com.adrian.project.ui.blockchaindemoapp.model.BlockchainPageModel

class BlockchainPageViewModelFactory
constructor(val myApplication: MyApplication, val model: BlockchainPageModel) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return BlockchainPageViewModel(myApplication, model) as T
    }
}
