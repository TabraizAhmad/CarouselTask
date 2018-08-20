package com.tabraiz.imagecaroseltask.network;


import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.tabraiz.imagecaroseltask.R;

public class PicassoClient {

    public static void downloadImage(String url, ImageView img)
    {
        if(url != null && url.length()>0)
        {
            Picasso.get().load(url).placeholder(R.drawable.placeholder).into(img);
        }else {
            Picasso.get().load(R.drawable.placeholder).into(img);
        }
    }
}
