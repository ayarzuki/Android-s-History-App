package com.ebrainless.sejarahandroid.adapter;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.ebrainless.sejarahandroid.R;

public class ServiceDetail extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_HISTORY = "extra_history";
    public static final String EXTRA_PHOTO = "extra_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_detail);

        ImageView tvPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvHistory = findViewById(R.id.tv_item_history);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String history = getIntent().getStringExtra(EXTRA_HISTORY);
        int photo = getIntent().getIntExtra(EXTRA_PHOTO, 0);

        Glide.with(this).load(photo).into(tvPhoto);
        tvName.setText(name);
        tvHistory.setText(history);

    }
}
