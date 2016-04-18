package com.hunter.fastandroid.dao;

import com.avos.avoscloud.AVClassName;
import com.avos.avoscloud.AVObject;

@AVClassName("ProductsGroup")
public class ProductsGroup extends AVObject {
    public Number getId() {
        return getNumber("groupId");
    }

    public void setId(int categoryId) {
        put("groupId", categoryId);
    }

    public String getName() {
        return getString("groupName");
    }

    public void setName(String categoryName) {
        put("groupName", categoryName);
    }

    public boolean isCheck;
}
