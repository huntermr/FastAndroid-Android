package com.hunter.fastandroid.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hunter.fastandroid.R;
import com.hunter.fastandroid.base.CustomBaseAdapter;
import com.hunter.fastandroid.dao.Products;
import com.hunter.fastandroid.utils.CommonUtils;
import com.hunter.fastandroid.utils.ImageUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/4/20.
 */
public class ProductsAdapter extends CustomBaseAdapter<Products> {

    public ProductsAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        Products itemData = getItemData(position);

        if (convertView == null) {
            convertView = getItemView(R.layout.nine_grid_browse_item, parent);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ImageUtils.loadImage(itemData.getProductsImage(), holder.ivProduct);
        holder.tvName.setText(itemData.getProductName());
        holder.tvPrice.setText(CommonUtils.formatPriceNumber(itemData.getProductPrice()));

        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.imgProduct)
        ImageView ivProduct;
        @Bind(R.id.textProductNameBig)
        TextView tvName;
        @Bind(R.id.textVanclPrice)
        TextView tvPrice;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
