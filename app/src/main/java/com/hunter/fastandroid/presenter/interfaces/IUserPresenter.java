package com.hunter.fastandroid.presenter.interfaces;

import com.hunter.fastandroid.ui.view.interfaces.ILoginView;
import com.hunter.fastandroid.ui.view.interfaces.IRegisterView;
import com.hunter.fastandroid.vo.request.LoginRequest;
import com.hunter.fastandroid.vo.request.RegisterRequest;

/**
 * Created by Administrator on 2015/10/20.
 */
public interface IUserPresenter {
    /**
     * 登录
     *
     * @param loginView
     * @param loginRequest
     */
    void login(ILoginView loginView, LoginRequest loginRequest);

    /**
     * 注册
     *
     * @param registerView
     * @param registerRequest
     */
    void register(IRegisterView registerView, RegisterRequest registerRequest);
}
