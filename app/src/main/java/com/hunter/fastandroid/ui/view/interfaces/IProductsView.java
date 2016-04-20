package com.hunter.fastandroid.ui.view.interfaces;

import com.hunter.fastandroid.base.IBaseView;
import com.hunter.fastandroid.dao.Products;
import com.hunter.fastandroid.dao.ProductsCategory;

import java.util.List;

/**
 * Created by Administrator on 2016/4/18.
 */
public interface IProductsView extends IBaseView {
    /**
     * 获取产品列表结果
     *
     * @param producsResult
     */
    void productsResult(List<Products> producsResult);
}
