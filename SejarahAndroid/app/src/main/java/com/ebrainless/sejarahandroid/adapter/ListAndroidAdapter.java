package com.ebrainless.sejarahandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.ebrainless.sejarahandroid.R;
import com.ebrainless.sejarahandroid.model.Androids;

import java.util.ArrayList;

public class ListAndroidAdapter extends RecyclerView.Adapter<ListAndroidAdapter.ListViewHolder> {
    private ArrayList<Androids> listAndroid;

    public ListAndroidAdapter(ArrayList<Androids> list) {
        this.listAndroid = list;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_android, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Androids androids = listAndroid.get(position);
        Glide.with(holder.itemView.getContext())
                .load(androids.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(androids.getName());
        holder.tvHistory.setText((androids.getHistory()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listAndroid.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAndroid.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvHistory;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvHistory = itemView.findViewById(R.id.tv_item_history);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Androids data);
    }
}
