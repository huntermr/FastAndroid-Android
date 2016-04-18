package com.hunter.fastandroid.model.impl;

import android.content.Context;

import com.avos.avoscloud.AVQuery;
import com.avos.avoscloud.FindCallback;
import com.hunter.fastandroid.base.BaseModel;
import com.hunter.fastandroid.dao.ProductsCategory;
import com.hunter.fastandroid.dao.ProductsGroup;
import com.hunter.fastandroid.model.interfaces.IProductsModel;

/**
 * Created by Administrator on 2016/4/18.
 */
public class ProductsModelImpl extends BaseModel implements IProductsModel {

    public ProductsModelImpl(Context context) {
        super(context);
    }

    @Override
    public void productsGroup(FindCallback<ProductsGroup> findCallback) {
        // LeanCloud获取数据
        // https://leancloud.cn/docs/android_guide.html#子类化
        // https://leancloud.cn/docs/android_guide.html#查询

        AVQuery<ProductsGroup> query = AVQuery.getQuery(ProductsGroup.class);
        query.findInBackground(findCallback);
    }

    @Override
    public void productsCategorys(int groupId, FindCallback<ProductsCategory> findCallback) {
        // LeanCloud获取数据
        // https://leancloud.cn/docs/android_guide.html#子类化
        // https://leancloud.cn/docs/android_guide.html#查询

        AVQuery<ProductsCategory> query = AVQuery.getQuery(ProductsCategory.class);
        query.whereEqualTo("groupId", groupId);

        query.findInBackground(findCallback);
    }
}
