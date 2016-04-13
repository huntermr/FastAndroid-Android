package com.hunter.fastandroid.model.impl;

import android.content.Context;

import com.hunter.fastandroid.base.BaseModel;
import com.hunter.fastandroid.model.interfaces.IUserModel;
import com.hunter.fastandroid.net.JsonTransactionListener;
import com.hunter.fastandroid.vo.request.LoginRequest;
import com.hunter.fastandroid.vo.request.RegisterRequest;

/**
 * 用户模型实现类
 */
public class UserModelImpl extends BaseModel implements IUserModel {

    public UserModelImpl(Context context) {
        super(context);
    }

    @Override
    public void login(LoginRequest loginRequest, JsonTransactionListener transactionListener) {
        // TODO 将校验后的数据传输给服务器,并将返回结果放入回调方法中交由Presenter处理
    }

    @Override
    public void register(RegisterRequest registerRequest, JsonTransactionListener transactionListener) {
        // TODO 将校验后的数据传输给服务器,并将返回结果放入回调方法中交由Presenter处理
    }
}
