package com.thinhlh.androidbase.view.home;


import android.view.View;

import com.thinhlh.androidbase.R;
import com.thinhlh.androidbase.base.fragment.BaseFragment;
import com.thinhlh.androidbase.databinding.FragmentHomeBinding;
import com.thinhlh.androidbase.view.hello.HelloFragment;
import com.thinhlh.androidbase.view.landing.LandingFragment;

/**
 * Created by thinhlh on 06/03/2022.
 * Copyright (c). All rights reserved
 */
public class HomeFragment extends BaseFragment<FragmentHomeBinding, HomeVM> implements HomeUV {

    @Override
    protected Integer layoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    protected Class<HomeVM> viewModelClass() {
        return HomeVM.class;
    }

    @Override
    protected void initViewModel(HomeVM viewModel) {
        viewModel.init(this);
        binding.setVm(viewModel);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initAction() {

    }

    @Override
    public void updateData(String newData) {
        getNavigator().goTo(new HelloFragment());
//        getNavigator().goTo(new LandingFragment());
    }
}
