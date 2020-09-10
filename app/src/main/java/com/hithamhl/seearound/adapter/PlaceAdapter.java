package com.hithamhl.seearound.adapter;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.hithamhl.seearound.R;
import com.hithamhl.seearound.fragment.MomentFragment;
import com.hithamhl.seearound.fragment.MosqueFragment;
import com.hithamhl.seearound.fragment.ParksFragment;
import com.hithamhl.seearound.fragment.ResturentFragment;

public class PlaceAdapter extends FragmentPagerAdapter {
    private static final int POSITION_RESTAURANT = 0;
    private static final int POSITION_MOSQUE = 1;
    private static final int POSITION_PARK = 2;
    private static final int POSITION_MOMENTS = 3;

    private static final int NUMBER_OF_POSITIONS = POSITION_MOMENTS + 1;

    Context context;

    public PlaceAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        if (POSITION_RESTAURANT==position){
            return new ResturentFragment();
        }else if(POSITION_MOSQUE==position){
            return new MosqueFragment();
        }else if(POSITION_PARK==position){
            return new ParksFragment();
        }else {
            return new MomentFragment();
        }

    }

    @Override
    public int getCount() {
        return NUMBER_OF_POSITIONS;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(POSITION_RESTAURANT==position){
            return context.getResources().getString(R.string.Restaurants);
        }else if(POSITION_MOSQUE==position){
            return context.getResources().getString(R.string.places_of_worship);
        }else if(POSITION_PARK==position){
            return context.getResources().getString(R.string.parks);

        }else if(POSITION_MOMENTS==position){
            return context.getResources().getString(R.string.tourist_destinations);
        }else {
            return context.getResources().getString(R.string.Restaurants);

        }
    }
}
