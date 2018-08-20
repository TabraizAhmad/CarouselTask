package com.tabraiz.imagecaroseltask.caroselVideo.views;

import android.os.Bundle;

import com.tabraiz.imagecaroseltask.R;
import com.tabraiz.imagecaroseltask.base.views.BaseActivity;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        if(savedInstanceState == null)  {

                replaceFragment(R.id.fragment_container, CarouselVideoFragment.newInstance(),
                        false);
        }
    }
}
