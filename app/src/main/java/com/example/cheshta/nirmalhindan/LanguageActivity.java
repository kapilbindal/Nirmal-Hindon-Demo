package com.example.cheshta.nirmalhindan;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.firebase.auth.FirebaseAuth;

public class LanguageActivity extends AppCompatActivity {
    Button btnEnglish,btnHindi,btnAdmin,btnUser;
    LinearLayout layoutUser,layoutLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        btnEnglish = findViewById(R.id.btnEnglish);
        btnHindi = findViewById(R.id.btnHindi);
        //btnAdmin = findViewById(R.id.btnAdmin);
        //btnUser = findViewById(R.id.btnUser);
        layoutLanguage = findViewById(R.id.layoutLanguage);
        //layoutUser = findViewById(R.id.layoutUser);

        btnHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this,LoginActivity.class));
            }
        });

        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this,LoginActivity.class));
            }
        });
       /* btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this,LoginActivity.class));
            }
        });
        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this,LoginActivity.class));
            }
        });*/
    }
}
