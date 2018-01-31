package com.adrian.project.util.viewpager

import android.support.v4.app.Fragment
import com.adrian.project.ui.jsonplaceholder.submodules.albumspage.view.AlbumsPageFragment
import com.adrian.project.ui.jsonplaceholder.submodules.commentspage.view.CommentsPageFragment
import com.adrian.project.ui.jsonplaceholder.submodules.photospage.PhotosPageFragment
import com.adrian.project.ui.jsonplaceholder.submodules.postspage.view.PostsPageFragment
import com.adrian.project.ui.jsonplaceholder.submodules.todospage.TodosPageFragment
import com.adrian.project.ui.jsonplaceholder.submodules.userspage.UsersPageFragment

class ViewPagerDataModel {

    fun titleList() = listOf<String>("Posts", "Albums", "Comments", "Photos", "Todos", "Users")

    fun fragmentList() = listOf<Fragment>(PostsPageFragment.newInstance(),
            AlbumsPageFragment.newInstance(),
            CommentsPageFragment.newInstance(),
            PhotosPageFragment.newInstance(),
            TodosPageFragment.newInstance(),
            UsersPageFragment.newInstance())
}