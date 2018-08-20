package com.tabraiz.imagecaroseltask.caroselVideo.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.exoplayer2.ui.SimpleExoPlayerView;
import com.tabraiz.imagecaroseltask.R;
import com.tabraiz.imagecaroseltask.base.views.BaseFragment;
import com.tabraiz.imagecaroseltask.caroselVideo.adapter.ImageCarouselAdapter;
import com.tabraiz.imagecaroseltask.caroselVideo.videolifecycleobserver.VideoPlayerComponent;
import com.tabraiz.imagecaroseltask.common.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.tabraiz.imagecaroseltask.common.Constants.VIDEO_STREAMING_URL;


public class CarouselVideoFragment extends BaseFragment {


    @BindView(R.id.media_player_carousel)
    SimpleExoPlayerView playerView;

    @BindView(R.id.recycler_view_carousel)
    RecyclerView carouselRecyclerView;
    private ImageCarouselAdapter imageCarouselAdapter;

    public CarouselVideoFragment() {
        // Required empty public constructor
    }


    public static CarouselVideoFragment newInstance() {
        return new CarouselVideoFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageCarouselAdapter = new ImageCarouselAdapter(Utils.getImageUriList());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_carousel_video, container, false);
        unbinder = ButterKnife.bind(this, view);
        if(savedInstanceState == null){
            getLifecycle().addObserver(new VideoPlayerComponent(getActivity().getApplicationContext(), playerView, VIDEO_STREAMING_URL));
        }
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        carouselRecyclerView.setLayoutManager(layoutManager);
        carouselRecyclerView.setAdapter(imageCarouselAdapter);
    }
}
