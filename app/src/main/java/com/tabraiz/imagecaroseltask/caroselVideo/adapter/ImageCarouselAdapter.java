package com.tabraiz.imagecaroseltask.caroselVideo.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tabraiz.imagecaroseltask.R;
import com.tabraiz.imagecaroseltask.network.PicassoClient;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ImageCarouselAdapter extends RecyclerView.Adapter<ImageCarouselAdapter.ImageViewHolder> {

    private final int LOOPING_IMAGE_THRESHOLD = 200;
    private final int ITEMS_PER_ROW = 3;

    private List<String> urlList =new ArrayList<>();

    private Context context;
    public ImageCarouselAdapter(Context context,List<String> urls){
        this.urlList = urls;
        this.context = context;
    }

    @NonNull
    @Override
    public ImageCarouselAdapter.ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_slider, parent, false);
        return new ImageViewHolder (itemView);    }

    @Override
    public void onBindViewHolder(@NonNull ImageCarouselAdapter.ImageViewHolder holder, int position) {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);

        holder.itemView.getLayoutParams().width = displaymetrics.widthPixels / ITEMS_PER_ROW;

        PicassoClient.downloadImage(urlList.get(position % urlList.size()),holder.imageView);
    }

    @Override
    public int getItemCount() {
        return urlList.size()*LOOPING_IMAGE_THRESHOLD;
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.row_slider_image_view)
        ImageView imageView;

        ImageViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


}
