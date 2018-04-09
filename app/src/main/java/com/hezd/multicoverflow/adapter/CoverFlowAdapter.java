package com.hezd.multicoverflow.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.hezd.multicoverflow.R;
import com.hezd.multicoverflow.util.DensityUtil;
import com.hezd.multicoverflow.widget.ICoverFlowAdapter;
import com.hezd.multicoverflow.widget.MyBitmapImageViewTarget;

import java.util.List;


public class CoverFlowAdapter implements ICoverFlowAdapter {
    private List<String> mArray;
    private static final float IMAGE_SCALE = 1242f/802f;
    private Context context;

    public CoverFlowAdapter(Context context, List<String> mArray) {
        this.context = context;
        this.mArray = mArray;
    }

    public CoverFlowAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<String> mArray) {
        this.mArray = mArray;
    }

    @Override
    public int getCount() {
        return 10;
//        return mArray == null ? 0 : mArray.size();
    }

    @Override
    public Object getItem(int position) {
        return mArray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = null;
        if (convertView == null) {
            holder = new Holder();
            convertView = View.inflate(context, R.layout.coverflow_item_view, null);
            holder.image = convertView.findViewById(R.id.iv_image);
            convertView.setTag(holder);
        }
        holder = (Holder) convertView.getTag();
//        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) holder.image.getLayoutParams();
//        int with = DensityUtil.getScreenWidth(context)-DensityUtil.dip2px(context,30);
//        int height = (int) (with/IMAGE_SCALE);
//        holder.image.getLayoutParams().height = height;
//        layoutParams.width = with;
//        layoutParams.height = height;
        return convertView;
    }

    @Override
    public void getData(View view, int position) {
        // 具体数据处理代码，自己根据业务逻辑处理
//        if(view!=null) {
//            Holder holder = (Holder) view.getTag();
////            String url = mArray.get(position);
//            Glide.with(context)
//                    .load("")
//                    .asBitmap()
//                    .placeholder(R.mipmap.default_image)
//                    .dontAnimate()
//                    .centerCrop()
//                    .into(new MyBitmapImageViewTarget(holder.image));
//        }

    }

    public static class Holder {
        public ImageView image;
    }

}
