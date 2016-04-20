package com.hunter.fastandroid.dao;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

/**
 * Created by Administrator on 2016/4/20.
 */
@AVClassName("Products")
public class Products extends AVObject {
    public String getProductsImage() {
        if (getAVFile("productImage") != null) {
            return getAVFile("productImage").getUrl();
        }

        return "";
    }

    public float getProductPrice() {
        if (getNumber("productPrice") != null) {
            return getNumber("productPrice").floatValue();
        }

        return 0;
    }

    public String getProductName() {
        return getString("productName");
    }

}
