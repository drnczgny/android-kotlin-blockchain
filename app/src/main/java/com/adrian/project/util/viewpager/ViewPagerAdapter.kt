package com.adrian.project.util.viewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.adrian.project.ui.jsonplaceholder.viewpager.JsonPlaceholderViewPagerDataModel

class ViewPagerAdapter constructor(val fm: FragmentManager, val jsonPlaceholderViewPagerDataModel: JsonPlaceholderViewPagerDataModel) : FragmentStatePagerAdapter(fm) {



    override fun getItem(position: Int): Fragment {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}