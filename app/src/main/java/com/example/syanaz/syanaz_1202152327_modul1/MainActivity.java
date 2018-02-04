package com.example.syanaz.syanaz_1202152327_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText jumlah, menu;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abnormal(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        menu=(EditText)findViewById(R.id.makanan);
        String makan=menu.getText().toString();

        jumlah =(EditText)findViewById(R.id.jumlah);
        String porsi=jumlah.getText().toString();


        intent.putExtra("resto","ABNORMAL");
        intent.putExtra("menu",makan);
        intent.putExtra("porsi",porsi);
        intent.putExtra("harga", "30000");

        startActivity(intent);
    }

    public void eatbus(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        menu =(EditText)findViewById(R.id.makanan);
        String makan=menu.getText().toString();

        jumlah =(EditText)findViewById(R.id.jumlah);
        String angka=jumlah.getText().toString();


        intent.putExtra("resto","EATBUS");
        intent.putExtra("menu",makan);
        intent.putExtra("porsi",angka);
        intent.putExtra("harga", "50000");

        startActivity(intent);
    }
}
