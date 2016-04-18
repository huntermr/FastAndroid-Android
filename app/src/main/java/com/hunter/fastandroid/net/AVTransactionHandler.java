package com.hunter.fastandroid.net;

import java.util.List;

/**
 * 事务处理监听
 */
public abstract class AVTransactionHandler<T> {
    /**
     * 带字符串数据的成功回调
     *
     * @param objectList
     */
    public abstract void onSuccess(List<T> objectList);

    /**
     * 带字符串数据的成功回调
     *
     * @param object
     */
    public abstract void onSuccess(T object);

    /**
     * 带错误码的失败回调
     *
     * @param errorCode
     */
    public void onFailure(int errorCode) {
        switch (errorCode) {
            // TODO 自定义处理
        }
    }
}
