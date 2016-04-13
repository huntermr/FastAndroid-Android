package com.hunter.fastandroid.model.interfaces;

import com.hunter.fastandroid.net.JsonTransactionListener;
import com.hunter.fastandroid.vo.request.LoginRequest;
import com.hunter.fastandroid.vo.request.RegisterRequest;

/**
 * 用户模型接口
 */
public interface IUserModel {
    /**
     * 登录
     *
     * @param loginRequest
     * @param transactionListener
     */
    void login(LoginRequest loginRequest, JsonTransactionListener transactionListener);

    /**
     * 注册
     *
     * @param registerRequest
     * @param transactionListener
     */
    void register(RegisterRequest registerRequest, JsonTransactionListener transactionListener);
}
