package com.hunter.fastandroid.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hunter.fastandroid.R;
import com.hunter.fastandroid.base.CustomBaseAdapter;
import com.hunter.fastandroid.dao.ProductsCategory;
import com.hunter.fastandroid.dao.ProductsGroup;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2016/4/18.
 */
public class CategoryGroupAdapter extends CustomBaseAdapter<ProductsGroup> {

    public CategoryGroupAdapter(Context context) {
        super(context);
    }

    public void checkItem(int position) {
        if (getCount() == 0) return;

        for (ProductsGroup data : getData()) {
            data.isCheck = false;
        }

        getData().get(position).isCheck = true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        ProductsGroup itemData = getItemData(position);

        if (convertView == null) {
            convertView = getItemView(R.layout.category_group_item, parent);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvGroup.setText(itemData.getName());

        if (itemData.isCheck) {
            convertView.setBackgroundColor(getContext().getResources().getColor(R.color.white));
        } else {
            convertView.setBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        }

        return convertView;
    }

    static class ViewHolder {
        @Bind(R.id.tv_group)
        TextView tvGroup;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
