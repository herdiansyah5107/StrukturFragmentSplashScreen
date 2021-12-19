package com.example.indonesiastruktur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements Listener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Membuat Item List Bisa Diklik
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long i)
                    {
                        if (position == 0) {
                            Intent intent = new Intent(MainActivity.this,
                                    Indonesia.class);
                            startActivity(intent);
                        } else if (position == 1) {
                            Intent intent = new Intent(MainActivity.this,
                                    JawaBaratActivity.class);
                            startActivity(intent);
                        } else if (position == 2) {
                            Intent intent = new Intent(MainActivity.this,
                                    JawaTengahActivity.class);
                            startActivity(intent);
                        }else if (position == 3) {
                            Intent intent = new Intent(MainActivity.this,
                                    JawaTimurActivity.class);
                            startActivity(intent);
                        }
                    }
                };
        ListView listView = (ListView) findViewById(R.id.list_provinsi);
        listView.setOnItemClickListener(itemClickListener);
        }
    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID, (int)id);
        startActivity(intent);
    }

}

