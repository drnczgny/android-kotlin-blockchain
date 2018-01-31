package com.adrian.project.ui.main.view

import com.adrian.project.ui.blockchaindemoapp.view.BlockchainPageActivity
import com.adrian.project.ui.main.JsonPlaceholderActivity
import com.adrian.project.ui.main.model.MainModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : android.support.v7.app.AppCompatActivity(), MainRouter {

    @javax.inject.Inject
    lateinit var mainModel: MainModel



    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        dagger.android.AndroidInjection.inject(this)
        setContentView(com.adrian.project.R.layout.activity_main)

        mainModel.callApiService()

        btnPostsPage.setOnClickListener { openPostsPage() }
        btnBlockchain.setOnClickListener { openBlockchainPage() }
    }

    fun openPostsPage() {
        val intent = android.content.Intent(this, JsonPlaceholderActivity::class.java)
        startActivity(intent)
    }

    fun openBlockchainPage() {
        val intent = android.content.Intent(this, BlockchainPageActivity::class.java)
        startActivity(intent)
    }
}
