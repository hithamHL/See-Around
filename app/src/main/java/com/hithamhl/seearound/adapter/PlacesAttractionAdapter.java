package com.hithamhl.seearound.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.hithamhl.seearound.R;
import com.hithamhl.seearound.model.Places;

import java.util.List;

public class PlacesAttractionAdapter extends

        RecyclerView.Adapter<PlacesAttractionAdapter.ViewHolder> {

    private static final String TAG = PlacesAttractionAdapter.class.getSimpleName();

    private Context context;

    private List<Places> list;

    private OnItemClickListener onItemClickListener;

    public PlacesAttractionAdapter(Context context, List<Places> list,

                                   OnItemClickListener onItemClickListener) {

        this.context = context;

        this.list = list;

        this.onItemClickListener = onItemClickListener;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView placeName,countryName;
        ImageView palceImage;
        public ViewHolder(View itemView) {

            super(itemView);
            placeName=itemView.findViewById(R.id.placeName_placeItem);
            countryName=itemView.findViewById(R.id.country_placeItem);
            palceImage=itemView.findViewById(R.id.image_placeItem);

        }

        public void bind(final Places model,

                         final OnItemClickListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {

                @Override

                public void onClick(View v) {

                    listener.onItemClick(getLayoutPosition());

                }

            });

        }

    }

    @Override

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.place_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;

    }

    @Override

    public void onBindViewHolder(ViewHolder holder, int position) {

        Places item = list.get(position);

        holder.bind(item, onItemClickListener);
        holder.placeName.setText(item.getPlaceName());
        holder.countryName.setText(item.getCountryName());
        Glide.with(context)
                .load(item.getPlaceImage())
                .override(250,250)
                .centerCrop()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.ic_error_load)
                .into(holder.palceImage);


    }

    @Override

    public int getItemCount() {

        return list.size();

    }

    public interface OnItemClickListener {

        void onItemClick(int position);

    }

}