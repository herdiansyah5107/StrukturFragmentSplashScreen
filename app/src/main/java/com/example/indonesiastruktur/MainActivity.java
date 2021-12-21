package com.example.indonesiastruktur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements  Listener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Membuat Item List Bisa Dikli
    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, KabupatenListActivity.class);
        intent.putExtra("idProp", id);
        startActivity(intent);
    }
}



