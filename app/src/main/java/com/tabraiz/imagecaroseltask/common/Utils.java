package com.tabraiz.imagecaroseltask.common;

import java.util.ArrayList;
import java.util.List;

import static com.tabraiz.imagecaroseltask.common.Constants.IMAGE_BASE_URL;

public class Utils {

    public static List<String> getImageUriList(){
        List<String> urls = new ArrayList<>();
        for (int i=0;i<7;i++){
            urls.add(IMAGE_BASE_URL + i);
        }
        return urls;
    }
}
