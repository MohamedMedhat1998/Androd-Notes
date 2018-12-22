package com.andalus.abomed7at.customarrayadaptertest;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;

/**
 * Created by AboMed7at on 9/25/2017.
 */

public class Wasfa {

    private int ImageID;
    private String ButtonText;
    private String TVT;

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public String getButtonText() {
        return ButtonText;
    }

    public void setButtonText(String buttonText) {
        ButtonText = buttonText;
    }

    public String getTVT() {
        return TVT;
    }

    public void setTVT(String TVT) {
        this.TVT = TVT;
    }

    public Wasfa(int imageId , String textButton , String textViewText) {
        ImageID = imageId;
        ButtonText = textButton;
        TVT = textViewText;
    }
}
