package com.hunter.fastandroid.ui.view.interfaces;

import com.hunter.fastandroid.base.IBaseView;
import com.hunter.fastandroid.dao.ProductsCategory;
import com.hunter.fastandroid.dao.ProductsGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/4/18.
 */
public interface IProductsGroupView extends IBaseView {
    /**
     * 获取产品分组列表结果
     *
     * @param groupsResult
     */
    void groupsResult(List<ProductsGroup> groupsResult);
}
