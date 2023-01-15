package com.example.shopsale.fragment

import android.view.View
import androidx.fragment.app.viewModels
import com.example.shopsale.R
import com.example.shopsale.base.BaseFragment
import com.example.shopsale.databinding.SplashFragmentBinding
import com.example.shopsale.navigation.AppNavigation
import com.example.shopsale.viewmodel.SplashViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class SplashFragment : BaseFragment<SplashFragmentBinding>() {

    @Inject
    lateinit var appNavigation: AppNavigation

    override fun initViews() {
        viewModel.handleSplash()
        viewModel.stateSplash.observe(viewLifecycleOwner){
            if(it){
                appNavigation.openSplashToLoginScreen()
            }
        }
    }

    override fun initBinding(mRootView: View): SplashFragmentBinding {
        return SplashFragmentBinding.bind(mRootView)
    }

    override fun getLayoutId(): Int {
        return R.layout.splash_fragment
    }

    override fun getVM(): SplashViewModel = viewModel
    val viewModel: SplashViewModel by viewModels()

}