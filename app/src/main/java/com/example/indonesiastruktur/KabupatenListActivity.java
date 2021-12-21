package com.example.indonesiastruktur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class KabupatenListActivity extends AppCompatActivity implements Listener{
    long provId ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabupaten_list);
        ListKabFragment frag =
                (ListKabFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_kab);

        provId = (long)getIntent().getExtras().get("idProp");
        System.out.println("Terima Prop id dari intent"+provId);
        frag.setPropId(provId);
        System.out.println("Kirim prop id ke frament"+provId);
    }

    public void itemClicked(long id) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("idKab", (int)id);
        intent.putExtra("idProp", (int)provId);
        startActivity(intent);
    }
}