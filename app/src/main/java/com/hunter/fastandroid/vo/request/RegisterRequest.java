package com.hunter.fastandroid.vo.request;

import com.hunter.fastandroid.base.BaseRequest;

/**
 * 用户登录请求实体类
 */
public class RegisterRequest extends BaseRequest {
    // 用户名 必填
    public String userName;
    // 密码 必填
    public String password;
    // 邮箱 选填
    public String email;
    // 手机号 选填
    public String phone;
}
