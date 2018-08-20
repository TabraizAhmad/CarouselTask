package com.tabraiz.imagecaroseltask.common;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<String> getImageUriList(){
        List<String> urls = new ArrayList<>();
        for (int i=0;i<7;i++){
            urls.add("https://picsum.photos/300/200?i="+i);
        }
        return urls;
    }
}
