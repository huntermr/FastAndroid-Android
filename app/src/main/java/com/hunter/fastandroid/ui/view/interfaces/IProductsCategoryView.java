package com.hunter.fastandroid.ui.view.interfaces;

import com.hunter.fastandroid.base.IBaseView;
import com.hunter.fastandroid.dao.ProductsCategory;

import java.util.List;

/**
 * Created by Administrator on 2016/4/18.
 */
public interface IProductsCategoryView extends IBaseView {
    /**
     * 获取产品分类列表结果
     *
     * @param categorysResult
     */
    void categorysResult(List<ProductsCategory> categorysResult);
}
