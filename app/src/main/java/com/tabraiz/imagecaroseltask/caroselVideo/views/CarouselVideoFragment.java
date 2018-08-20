package com.tabraiz.imagecaroseltask.caroselVideo.views;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tabraiz.imagecaroseltask.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CarouselVideoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CarouselVideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CarouselVideoFragment extends Fragment {

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
        return inflater.inflate(R.layout.fragment_carousel_video, container, false);
    }
}
