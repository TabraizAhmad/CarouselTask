package com.tabraiz.imagecaroseltask.base.views;

import android.support.v4.app.Fragment;

import butterknife.Unbinder;

/**
 * Created by tahmad.dtt on 8/20/18.
 */

public class BaseFragment extends Fragment {
    protected Unbinder unbinder = null;

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
        }
    }
}
