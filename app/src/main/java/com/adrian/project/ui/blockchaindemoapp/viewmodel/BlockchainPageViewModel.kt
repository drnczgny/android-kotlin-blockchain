package com.adrian.project.ui.blockchaindemoapp.viewmodel

import android.arch.lifecycle.AndroidViewModel
import com.adrian.project.MyApplication
import com.adrian.project.ui.blockchaindemoapp.model.BlockchainPageModel

class BlockchainPageViewModel constructor(myApplication: MyApplication) : AndroidViewModel(myApplication) {

    lateinit var model: BlockchainPageModel

    constructor(myApplication: MyApplication, model: BlockchainPageModel): this(myApplication) {
        this.model = model
    }

}