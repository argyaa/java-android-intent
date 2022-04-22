// Nama : Argya Aulia Fauzandika
// NIM  : 10119035
// Kelas: IF-1
// Tanggal Pengerjaan : 22 April 2022

package com.argya.tugas_android_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), login.class));
                finish();
            }
        }, 3000);
    }
}
