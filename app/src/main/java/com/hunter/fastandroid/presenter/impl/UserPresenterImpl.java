package com.hunter.fastandroid.presenter.impl;

import android.text.TextUtils;

import com.hunter.fastandroid.base.BasePresenter;
import com.hunter.fastandroid.base.BaseResponse;
import com.hunter.fastandroid.model.impl.UserModelImpl;
import com.hunter.fastandroid.model.interfaces.IUserModel;
import com.hunter.fastandroid.net.JsonTransactionListener;
import com.hunter.fastandroid.presenter.interfaces.IUserPresenter;
import com.hunter.fastandroid.ui.view.interfaces.ILoginView;
import com.hunter.fastandroid.ui.view.interfaces.IRegisterView;
import com.hunter.fastandroid.utils.CommonUtils;
import com.hunter.fastandroid.utils.MyStringUtils;
import com.hunter.fastandroid.vo.request.LoginRequest;
import com.hunter.fastandroid.vo.request.RegisterRequest;
import com.hunter.fastandroid.vo.response.UserInfo;

public class UserPresenterImpl extends BasePresenter implements IUserPresenter {

    @Override
    public void login(final ILoginView loginView, LoginRequest loginRequest) {

        // 校验用户名和密码是否为空
        if (isEmpty(loginRequest.userName, loginView, "用户名不能为空")) return;
        if (isEmpty(loginRequest.password, loginView, "密码不能为空")) return;

        // 实例化用户模型,调用登录方法,传入接口所需参数
        IUserModel userModel = new UserModelImpl(loginView.getContext());
        userModel.login(loginRequest, new JsonTransactionListener() {
            @Override
            public void onSuccess(BaseResponse response) {
                if (response.isSuccess()) {
                    // 登录成功,调用view接口显示用户信息
                    UserInfo userInfo = CommonUtils.getGson().fromJson(response.getData(), UserInfo.class);
                    loginView.loginCallback(userInfo);
                } else {
                    // 登录失败,根据业务需求进行处理...
                }
            }

            @Override
            public void onFailure(int errorCode) {
                // 网络访问异常
                super.onFailure(errorCode);
            }
        });
    }

    @Override
    public void register(final IRegisterView registerView, final RegisterRequest registerRequest) {
        // 校验用户名和密码是否为空
        if (isEmpty(registerRequest.userName, registerView, "用户名不能为空")) return;
        if (isEmpty(registerRequest.password, registerView, "密码不能为空")) return;

        // 如果有填写邮箱则进行验证
        if (!TextUtils.isEmpty(registerRequest.email)) {
            if (!CommonUtils.isEmail(registerRequest.email)) {
                registerView.showToast("邮箱格式不正确");
                return;
            }
        }

        // 如果有填写手机则进行验证
        if (!TextUtils.isEmpty(registerRequest.phone)) {
            if (!MyStringUtils.isHandset(registerRequest.phone)) {
                registerView.showToast("手机格式不正确");
                return;
            }
        }

        // 实例化用户模型,调用登录方法,传入接口所需参数
        IUserModel userModel = new UserModelImpl(registerView.getContext());
        userModel.register(registerRequest, new JsonTransactionListener() {
            @Override
            public void onSuccess(BaseResponse response) {
                if (response.isSuccess()) {
                    // 注册成功
                    registerView.registerCallback();
                } else {
                    // 注册失败
                    registerView.showToast("注册失败,请重试");
                }
            }

            @Override
            public void onFailure(int errorCode) {
                // 网络访问异常
                super.onFailure(errorCode);
            }
        });
    }
}
