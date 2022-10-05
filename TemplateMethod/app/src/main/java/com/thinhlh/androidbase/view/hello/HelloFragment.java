package com.thinhlh.androidbase.view.hello;

import com.thinhlh.androidbase.R;
import com.thinhlh.androidbase.base.fragment.BaseFragment;
import com.thinhlh.androidbase.databinding.FragmentHelloBinding;

public class HelloFragment extends BaseFragment<FragmentHelloBinding,HelloVM> implements  HelloUV {
    @Override
    protected Integer layoutRes() {
        return R.layout.fragment_hello;
    }

    @Override
    protected Class<HelloVM> viewModelClass() {
        return HelloVM.class;
    }

    @Override
    protected void initViewModel(HelloVM viewModel) {
        viewModel.init(this);
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
}
