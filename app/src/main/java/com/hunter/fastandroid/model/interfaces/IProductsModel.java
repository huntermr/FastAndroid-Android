package com.hunter.fastandroid.model.interfaces;

import com.avos.avoscloud.FindCallback;
import com.hunter.fastandroid.dao.Products;
import com.hunter.fastandroid.dao.ProductsCategory;
import com.hunter.fastandroid.dao.ProductsGroup;

/**
 * 产品模型接口
 */
public interface IProductsModel {
    /**
     * 获取所有产品分组
     *
     * @param findCallback
     */
    void productsGroup(FindCallback<ProductsGroup> findCallback);

    /**
     * 根据产品分组id获取所有产品分类
     *
     * @param groupId
     * @param findCallback
     */
    void productsCategorys(int groupId, FindCallback<ProductsCategory> findCallback);

    /**
     * 根据产品分类id获取产品列表
     *
     * @param categoryId
     * @param findCallback
     */
    void products(int categoryId, FindCallback<Products> findCallback);
}
