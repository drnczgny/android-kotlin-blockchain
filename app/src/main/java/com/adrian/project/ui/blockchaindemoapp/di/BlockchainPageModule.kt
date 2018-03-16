package com.adrian.project.ui.blockchaindemoapp.di

import android.arch.lifecycle.ViewModelProviders
import com.adrian.kotlinrecyclerviewdagger.main.di.ActivityScope
import com.adrian.project.MyApplication
import com.adrian.project.ui.blockchaindemoapp.model.BlockchainPageModel
import com.adrian.project.ui.blockchaindemoapp.view.BlockchainPageActivity
import com.adrian.project.ui.blockchaindemoapp.viewmodel.BlockchainPageViewModel
import com.adrian.project.ui.blockchaindemoapp.viewmodel.BlockchainPageViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class BlockchainPageModule {

//    @ActivityScope
//    @Provides
//    fun providesBlockchainPageRouter(activity: BlockchainPageActivity) = activity

    @ActivityScope
    @Provides
    fun providesBlockchainPageModel() = BlockchainPageModel()

    @ActivityScope
    @Provides
    fun providesBlockchainPageViewModelFactory(myApplication: MyApplication, model: BlockchainPageModel) = BlockchainPageViewModelFactory(myApplication, model)

    @ActivityScope
    @Provides
    fun providesBlockchainPageViewModel(activity: BlockchainPageActivity, blockchainPageViewModelFactory: BlockchainPageViewModelFactory)
            = ViewModelProviders.of(activity, blockchainPageViewModelFactory).get(BlockchainPageViewModel::class.java!!)
}