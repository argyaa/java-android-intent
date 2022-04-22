package com.argya.tugas_android_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView btnRegister = findViewById(R.id.btn_sign_up);
        Button btnLogin = findViewById(R.id.btn_login);

        btnRegister.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}