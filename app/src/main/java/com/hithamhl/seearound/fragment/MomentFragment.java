package com.hithamhl.seearound.fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Toast;

import com.hithamhl.seearound.R;
import com.hithamhl.seearound.adapter.PlacesAttractionAdapter;
import com.hithamhl.seearound.model.Places;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MomentFragment extends Fragment {

    RecyclerView placeRecycleView;
    PlacesAttractionAdapter placesAttractionAdapter;
    List<Places> placesList;

    public MomentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_moment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        placeRecycleView=view.findViewById(R.id.momentRecycle);
        placesAttractionAdapter=new PlacesAttractionAdapter(getContext(), allPlaces(), new PlacesAttractionAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getContext(), allPlaces().get(position).getPlaceAddress(), Toast.LENGTH_SHORT).show();
            }
        });

        placeRecycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        int animat=R.anim.layout_from_bottom;
        LayoutAnimationController animationController= AnimationUtils.loadLayoutAnimation(getContext(),animat);
        placeRecycleView.setLayoutAnimation(animationController);
        placeRecycleView.setAdapter(placesAttractionAdapter);
    }

    private List<Places> allPlaces(){
        placesList=new ArrayList<>();
        placesList.add(new Places("Casper & Gambinis Palestine - كاسبر","رام الله",
                "Ramallah, Al masyoon, near by Al Rafedein square, Adel Masri building.",
                "8am : 12am","AA",
                "https://www.e-aswaq.com/images/34/10678833_1704850109740437_1919286581227765847_n.jpg"));

        placesList.add(new Places("Reef Café - ريف","رام الله",
                "الطيرة الشارع الرئيس مقابل السفارة الصينيةRamallah 123",
                "8am : 12am","AA",
                "https://www.e-aswaq.com/images/1/11144960_915434481850813_5593132532346795701_n.jpg"));
        placesList.add(new Places("Orjuwan Kitchen - ارجوان","رام الله",
                "Al Masyoun - Khalil Sakakini Cultural Center St.",
                "8am : 12am","AA",
                "https://www.e-aswaq.com/images/54/11537705_633384426764215_3717491853385362068_n.png"));
        placesList.add(new Places("Casper & Gambinis Palestine - كاسبر","رام الله",
                "Ramallah, Al masyoon, near by Al Rafedein square, Adel Masri building.",
                "8am : 12am","AA",
                "https://www.e-aswaq.com/images/34/10678833_1704850109740437_1919286581227765847_n.jpg"));

        placesList.add(new Places("Reef Café - ريف","رام الله",
                "الطيرة الشارع الرئيس مقابل السفارة الصينيةRamallah 123",
                "8am : 12am","AA",
                "https://www.e-aswaq.com/images/1/11144960_915434481850813_5593132532346795701_n.jpg"));
        placesList.add(new Places("Orjuwan Kitchen - ارجوان","رام الله",
                "Al Masyoun - Khalil Sakakini Cultural Center St.",
                "8am : 12am","AA",
                "https://www.e-aswaq.com/images/54/11537705_633384426764215_3717491853385362068_n.png"));
        return placesList;
    }
}
