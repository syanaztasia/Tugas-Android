package com.example.syanaz.syanaz_1202152327_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView resto, menu, jumlahpesanan, harga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String TempatMakan = intent.getStringExtra("resto");
        String Menu = intent.getStringExtra("menu");
        String Porsi = intent.getStringExtra("porsi");
        String Harga = intent.getStringExtra("harga");
        int Jumlah= Integer.valueOf(Harga)* Integer.valueOf(Porsi);

        resto = (TextView)findViewById(R.id.resto);
        resto.setText(TempatMakan);
        menu = (TextView)findViewById(R.id.menu_makanan);
        menu.setText(Menu);
        jumlahpesanan = (TextView) findViewById(R.id.porsi);
        jumlahpesanan.setText(Porsi);
        harga = (TextView) findViewById(R.id.jumlah_harga);
        harga.setText(String.valueOf(Jumlah));
        if (Jumlah > 65000){
            Toast warn = Toast.makeText(this, "Duit anda tidak mencukupi, coba lagi", Toast.LENGTH_LONG);
            warn.show();
        } else {
            Toast peringatan =Toast.makeText(this, "Duit anda sudah mencukupi, silahkan makan disini",Toast.LENGTH_LONG);
            peringatan.show();
        }

    }
}
