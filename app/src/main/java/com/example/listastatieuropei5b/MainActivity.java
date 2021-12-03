package com.example.listastatieuropei5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lwStati;
    String listaStati[] = {"Italia", "Francia", "Germania", "Lussemburgo", "Svizzera"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lwStati = (ListView)findViewById(R.id.listaStati);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,R.layout.activity_main,R.id.textView, listaStati);
        lwStati.setAdapter(aa);
    }
}