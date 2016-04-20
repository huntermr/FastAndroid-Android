package com.hunter.fastandroid.presenter.interfaces;

import com.hunter.fastandroid.ui.view.interfaces.IProductsCategoryView;
import com.hunter.fastandroid.ui.view.interfaces.IProductsGroupView;
import com.hunter.fastandroid.ui.view.interfaces.IProductsView;

/**
 * Created by Administrator on 2016/4/18.
 */
public interface IProductsPresenter {
    /**
     * 获取产品分组列表
     *
     * @param productsGroupView
     */
    void productsGroups(IProductsGroupView productsGroupView);

    /**
     * 获取产品分类列表
     *
     * @param productsCategoryView
     */
    void productsCategorys(int groupId, IProductsCategoryView productsCategoryView);

    /**
     * 获取产品分类列表
     *
     * @param productsView
     */
    void products(int categoryId, IProductsView productsView);
}
