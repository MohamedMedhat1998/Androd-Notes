package com.andalus.abo_med7at.textencryption;

import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * Created by Abo_Med7at on 05/07/2017.
 */

public class MyAnimation {
    Context currentContext;
    public MyAnimation(Context context){
        currentContext = context;
    }
    public void SHAKE(View v){
        Animation shake = AnimationUtils.loadAnimation(currentContext, R.anim.shake);
        v.startAnimation(shake);
        Vibrate();
    }
    private void Vibrate(){
        Vibrator v = (Vibrator) currentContext.getSystemService(Context.VIBRATOR_SERVICE);
        // Vibrate for 500 milliseconds
        v.vibrate(500);
    }
}
