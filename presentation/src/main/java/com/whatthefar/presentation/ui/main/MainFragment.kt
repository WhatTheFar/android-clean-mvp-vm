package com.whatthefar.presentation.ui.main

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.whatthefar.presentation.databinding.MainFragmentBinding
import com.whatthefar.presentation.extension.getViewModel
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    @Inject
    lateinit var mViewModelFactory: ViewModelProvider.Factory
    @Inject
    lateinit var mPresenter: MainContract.Presenter

    private lateinit var mViewBinding: MainFragmentBinding
    private lateinit var mViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        AndroidSupportInjection.inject(this)
        mViewBinding = MainFragmentBinding.inflate(inflater, container, false)
        mViewBinding.setLifecycleOwner(this)
        return mViewBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mViewModel = getViewModel(mViewModelFactory)
        mViewBinding.viewModel = mViewModel

        mPresenter.onInit(savedInstanceState, mViewModel)
    }

    override fun onPause() {
        super.onPause()
        mPresenter.cleanUp()
    }
}
