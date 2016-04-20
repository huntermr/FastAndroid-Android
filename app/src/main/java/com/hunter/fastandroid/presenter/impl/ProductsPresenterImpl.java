package com.hunter.fastandroid.presenter.impl;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.FindCallback;
import com.hunter.fastandroid.base.BasePresenter;
import com.hunter.fastandroid.dao.Products;
import com.hunter.fastandroid.dao.ProductsCategory;
import com.hunter.fastandroid.dao.ProductsGroup;
import com.hunter.fastandroid.model.impl.ProductsModelImpl;
import com.hunter.fastandroid.presenter.interfaces.IProductsPresenter;
import com.hunter.fastandroid.ui.view.interfaces.IProductsCategoryView;
import com.hunter.fastandroid.ui.view.interfaces.IProductsGroupView;
import com.hunter.fastandroid.ui.view.interfaces.IProductsView;

import java.util.List;

/**
 * Created by Administrator on 2016/4/18.
 */
public class ProductsPresenterImpl extends BasePresenter implements IProductsPresenter {

    @Override
    public void productsGroups(final IProductsGroupView productsGroupView) {
        // 实例化产品模型
        ProductsModelImpl productsModel = new ProductsModelImpl(productsGroupView.getContext());
        // 从产品模型中获取产品分组数据
        productsModel.productsGroup(new FindCallback<ProductsGroup>() {
            @Override
            public void done(List<ProductsGroup> list, AVException e) {
                // 获取成功,返回到View层
                if (e == null) {
                    productsGroupView.groupsResult(list);
                }
            }
        });
    }

    @Override
    public void productsCategorys(int groupId, final IProductsCategoryView productsCategoryView) {
        // 实例化产品模型
        ProductsModelImpl productsModel = new ProductsModelImpl(productsCategoryView.getContext());
        // 从产品模型中获取产品分类数据
        productsModel.productsCategorys(groupId, new FindCallback<ProductsCategory>() {
            @Override
            public void done(List<ProductsCategory> list, AVException e) {
                // 获取成功,返回到View层
                if (e == null) {
                    productsCategoryView.categorysResult(list);
                }
            }
        });
    }

    @Override
    public void products(int categoryId, final IProductsView productsView) {
        // 实例化产品模型
        ProductsModelImpl productsModel = new ProductsModelImpl(productsView.getContext());
        // 从产品模型中获取产品数据
        productsModel.products(categoryId, new FindCallback<Products>() {
            @Override
            public void done(List<Products> list, AVException e) {
                // 获取成功,返回到View层
                if (e == null) {
                    productsView.productsResult(list);
                }
            }
        });
    }
}
