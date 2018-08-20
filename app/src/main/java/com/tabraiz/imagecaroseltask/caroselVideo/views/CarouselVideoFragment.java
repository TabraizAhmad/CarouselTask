package com.tabraiz.imagecaroseltask.caroselVideo.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.exoplayer2.ui.SimpleExoPlayerView;
import com.tabraiz.imagecaroseltask.R;
import com.tabraiz.imagecaroseltask.base.views.BaseFragment;
import com.tabraiz.imagecaroseltask.caroselVideo.viewmodel.VideoPlayerComponent;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.tabraiz.imagecaroseltask.common.Constants.VIDEO_STREAMING_URL;


public class CarouselVideoFragment extends BaseFragment {


    @BindView(R.id.media_player_carousel)
    SimpleExoPlayerView playerView;

    public CarouselVideoFragment() {
        // Required empty public constructor
    }


    public static CarouselVideoFragment newInstance() {
        CarouselVideoFragment fragment = new CarouselVideoFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
        return view;    }
}
