// Nama : Argya Aulia Fauzandika
// NIM  : 10119035
// Kelas: IF-1
// Tanggal Pengerjaan : 22 April 2022


package com.argya.tugas_android_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLihatProfile = findViewById(R.id.btn_profile);

        btnLihatProfile.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, profile.class);
                startActivity(intent);
            }
        });

    }
}
