package com.hunter.fastandroid.ui.activity.products;

import android.widget.GridView;

import com.hunter.fastandroid.R;
import com.hunter.fastandroid.adapter.ProductsAdapter;
import com.hunter.fastandroid.base.BaseActivity;
import com.hunter.fastandroid.dao.Products;
import com.hunter.fastandroid.presenter.impl.ProductsPresenterImpl;
import com.hunter.fastandroid.presenter.interfaces.IProductsPresenter;
import com.hunter.fastandroid.ui.view.interfaces.IProductsView;

import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by Administrator on 2016/4/20.
 */
public class ProductsActivity extends BaseActivity implements IProductsView {
    @Bind(R.id.gridSmall)
    GridView gvProduct;

    ProductsAdapter productsAdapter;

    IProductsPresenter productsPresenter;

    @Override
    public void initView() {
        productsAdapter = new ProductsAdapter(this);
        gvProduct.setAdapter(productsAdapter);

        int categoryId = getIntent().getIntExtra("categoryId", 0);
        if (categoryId != 0) {
            productsPresenter.products(categoryId, this);
        }
    }

    @OnClick(R.id.allBtnBack)
    void back() {
        finish();
    }

    @Override
    public void initPresenter() {
        productsPresenter = new ProductsPresenterImpl();
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.search_result_list;
    }

    @Override
    public void productsResult(List<Products> producsResult) {
        productsAdapter.setData(producsResult);
        productsAdapter.notifyDataSetChanged();
    }
}
