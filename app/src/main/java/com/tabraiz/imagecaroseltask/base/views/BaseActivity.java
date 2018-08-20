package com.tabraiz.imagecaroseltask.base.views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by tahmad.dtt on 8/20/18.
 */

public class BaseActivity extends AppCompatActivity {

    protected void replaceFragment(int fragment_container, Fragment fragment, boolean addToBackStack) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(fragment_container, fragment);
        if (addToBackStack) {
            ft.addToBackStack(fragment.getClass().getName());
        }
        ft.commit();
    }
}
