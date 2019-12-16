package com.ebrainless.sejarahandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.ebrainless.sejarahandroid.adapter.ListAndroidAdapter;
import com.ebrainless.sejarahandroid.adapter.ServiceDetail;
import com.ebrainless.sejarahandroid.model.Androids;
import com.ebrainless.sejarahandroid.model.AndroidsData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rvAndroids;
    private ArrayList<Androids> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAndroids = findViewById(R.id.rv_androids);
        rvAndroids.setHasFixedSize(true);
        list.addAll(AndroidsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvAndroids.setLayoutManager(new LinearLayoutManager(this));
        ListAndroidAdapter listAndroidAdapter = new ListAndroidAdapter(list);
        rvAndroids.setAdapter(listAndroidAdapter);

        listAndroidAdapter.setOnItemClickCallback(new ListAndroidAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Androids data) {
                Intent iServiceDetail = new Intent(MainActivity.this, ServiceDetail.class);
                iServiceDetail.putExtra(ServiceDetail.EXTRA_NAME, data.getName());
                iServiceDetail.putExtra(ServiceDetail.EXTRA_HISTORY, data.getHistory());
                iServiceDetail.putExtra(ServiceDetail.EXTRA_PHOTO, data.getPhoto());

                startActivity(iServiceDetail);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.menu.author:
                Intent moveIntent = new Intent(MainActivity.this, AboutAuthor.class);
                startActivity(moveIntent);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.author,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.author:
                Intent moveIntent = new Intent(MainActivity.this, AboutAuthor.class);
                startActivity(moveIntent);
                break;
        }
        return false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
