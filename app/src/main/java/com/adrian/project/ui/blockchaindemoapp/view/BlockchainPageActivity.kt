package com.adrian.project.ui.blockchaindemoapp.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.adrian.project.BR
import com.adrian.project.R
import com.adrian.project.databinding.ActivityBlockchainPageBinding
import com.adrian.project.ui.blockchaindemoapp.viewmodel.BlockchainPageViewModel
import dagger.android.AndroidInjection
import javax.inject.Inject

class BlockchainPageActivity : AppCompatActivity(), BlockchainRouter {

    @Inject
    lateinit var blockchainPageViewModel: BlockchainPageViewModel

    lateinit var binding: ActivityBlockchainPageBinding

    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)

        bind()
        setSupportActionBar(binding.toolbar)
        setupViewPager()
    }

    fun bind() {
        binding = DataBindingUtil.setContentView(this, getLayoutId())
        binding?.viewModel = this.blockchainPageViewModel
        binding?.executePendingBindings()
    }

    fun setupViewPager() {
        this.tabLayout = binding.tabLayout
        this.viewPager = binding.viewPager
//        viewPager.adapter = jsonPlaceholderViewPagerAdapter
        tabLayout.setupWithViewPager(this.viewPager)
    }

    fun getLayoutId() = R.layout.activity_blockchain_page

    fun getVariableId(): Int {
        return BR.viewModel
    }
}
