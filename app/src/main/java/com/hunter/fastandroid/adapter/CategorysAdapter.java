package com.hunter.fastandroid.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hunter.fastandroid.R;
import com.hunter.fastandroid.base.CustomBaseAdapter;
import com.hunter.fastandroid.dao.ProductsCategory;
import com.hunter.fastandroid.dao.ProductsGroup;
import com.hunter.fastandroid.utils.ImageUtils;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/4/18.
 */
public class CategorysAdapter extends CustomBaseAdapter<ProductsCategory> {

    public CategorysAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        ProductsCategory itemData = getItemData(position);

        if (convertView == null) {
            convertView = getItemView(R.layout.child_item_layout, parent);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvName.setText(itemData.getName());
        ImageUtils.loadImage(itemData.getImage(), holder.ivImage);

        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.imageView1)
        ImageView ivImage;
        @Bind(R.id.child_textView)
        TextView tvName;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
