package com.hunter.fastandroid.utils;

import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * 图片加载工具类
 */
public class ImageUtils {
    /**
     * 加载远程图片
     *
     * @param url       图片路径
     * @param imageView 要加载的控件
     */
    public static void loadImage(String url, ImageView imageView) {
        ImageLoader.getInstance().displayImage(url, imageView);
    }

    /**
     * 加载远程图片
     * @param loadingRes    加载中显示图片
     * @param url       图片路径
     * @param imageView 要加载的控件
     */
    public static void loadImage(int loadingRes, String url, ImageView imageView) {
        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .cacheInMemory(true) // 加载图片时会在内存中加载缓存
                .cacheOnDisk(true) // 加载图片时会在磁盘中加载缓存
                .showImageOnLoading(loadingRes)
                .showImageOnFail(loadingRes)
                .showImageForEmptyUri(loadingRes)
                .build();

        ImageLoader.getInstance().displayImage(url, imageView, options);
    }
}
