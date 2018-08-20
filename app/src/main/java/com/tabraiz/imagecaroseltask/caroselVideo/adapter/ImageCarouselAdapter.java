package com.tabraiz.imagecaroseltask.caroselVideo.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
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

    private List<String> urlList =new ArrayList<>();

    public ImageCarouselAdapter(List<String> urls){
        urlList = urls;
    }

    @NonNull
    @Override
    public ImageCarouselAdapter.ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_slider, parent, false);
        return new ImageViewHolder (itemView);    }

    @Override
    public void onBindViewHolder(@NonNull ImageCarouselAdapter.ImageViewHolder holder, int position) {
        PicassoClient.downloadImage(urlList.get(position),holder.imageView);
    }

    @Override
    public int getItemCount() {
        return urlList.size();
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
