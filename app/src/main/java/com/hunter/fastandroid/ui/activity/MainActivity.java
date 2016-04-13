package com.hunter.fastandroid.ui.activity;

import com.hunter.fastandroid.R;
import com.hunter.fastandroid.base.BaseActivity;
import com.hunter.fastandroid.presenter.impl.UserPresenterImpl;
import com.hunter.fastandroid.presenter.interfaces.IUserPresenter;
import com.hunter.fastandroid.ui.custom.TitleBar;
import com.hunter.fastandroid.ui.view.interfaces.ILoginView;
import com.hunter.fastandroid.ui.view.interfaces.IRegisterView;
import com.hunter.fastandroid.vo.request.LoginRequest;
import com.hunter.fastandroid.vo.request.RegisterRequest;
import com.hunter.fastandroid.vo.response.UserInfo;

import butterknife.Bind;

public class MainActivity extends BaseActivity implements ILoginView, IRegisterView {
    @Bind(R.id.title_bar)
    TitleBar titleBar;

    IUserPresenter userPresenter;

    @Override
    public void initContentView() {
        // 设置布局文件
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initView() {
        titleBar.setTitle("DEMO");

        // 开始注册
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.userName = "huntermr";
        registerRequest.password = "123456";
        registerRequest.email = "hunter_android@163.com";
        registerRequest.phone = "13552991918";
        userPresenter.register(this, registerRequest);

        // 开始登录
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.userName = "huntermr";
        loginRequest.password = "123456";
        userPresenter.login(this, loginRequest);
    }

    @Override
    public void initPresenter() {
        userPresenter = new UserPresenterImpl();
    }

    @Override
    public void loginCallback(UserInfo userInfo) {
        // TODO 登录成功,将用户信息显示在界面上
    }

    @Override
    public void registerCallback() {
        // TODO 注册成功,保存用户信息
    }
}
