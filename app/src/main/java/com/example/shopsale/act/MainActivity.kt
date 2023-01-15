package com.example.shopsale.act

import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.shopsale.R
import com.example.shopsale.base.BaseActivity
import com.example.shopsale.databinding.ActivityMainBinding
import com.example.shopsale.navigation.AppNavigation
import com.example.shopsale.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    private val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var appNavigation: AppNavigation

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initViews() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        appNavigation.bind(navHostFragment.navController)
    }

    override fun getVM(): MainViewModel = viewModel

}