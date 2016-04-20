package com.hunter.fastandroid.dao;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

@AVClassName("ProductsCategory")
public class ProductsCategory extends AVObject {
    public Number getId() {
        return getNumber("categoryId");
    }

    public void setId(int categoryId) {
        put("categoryId", categoryId);
    }

    public String getName() {
        return getString("categoryName");
    }

    public void setName(String categoryName) {
        put("categoryName", categoryName);
    }

    public String getImage() {
        if (getAVFile("categoryImage") != null) {
            return getAVFile("categoryImage").getUrl();
        }

        return "";
    }

    public void setImage(String categoryImage) {
        put("categoryImage", categoryImage);
    }
}
