package com.hithamhl.seearound;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;

import com.hithamhl.seearound.adapter.PlaceAdapter;
import com.hithamhl.seearound.utils.ClipOutlineProvider;
import com.iammert.library.AnimatedTabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager placePager;
    AnimatedTabLayout placeTabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){

        placePager=findViewById(R.id.palce_viewPager);
        placeTabs=findViewById(R.id.placeTabLayout);
        PlaceAdapter placeAdapter=new PlaceAdapter(getApplicationContext(),getSupportFragmentManager());
        placePager.setAdapter(placeAdapter);
        placeTabs.setupViewPager(placePager);
        ClipOutlineProvider clipOutlineProvider= null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            clipOutlineProvider = new ClipOutlineProvider();

            placeTabs.setOutlineProvider(clipOutlineProvider);
            placeTabs.setClipToOutline(true);

        }

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
   private class ClipOutlineProvider extends ViewOutlineProvider {
        @Override
        public void getOutline(View view, Outline outline) {
            final int margin = Math.min(view.getWidth(), view.getHeight()) / 10;
            if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP) {
                outline.setRoundRect(margin, margin, view.getWidth() - margin,
                        view.getHeight() - margin, margin / 5);
            }
        }
    }



}
