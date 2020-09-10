package com.hithamhl.seearound.utils;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class ClipOutlineProvider extends ViewOutlineProvider {
    @Override
    public void getOutline(View view, Outline outline) {
        final int margin = Math.min(view.getWidth(), view.getHeight()) / 10;
        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP) {
            outline.setRoundRect(margin, margin, view.getWidth() - margin,
                    view.getHeight() - margin, margin / 2);
        }
    }
}
