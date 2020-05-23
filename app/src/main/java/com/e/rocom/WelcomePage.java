package com.e.rocom;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class WelcomePage extends AppCompatActivity {

    Button btnSignup, btnSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        btnSignup = findViewById(R.id.btnSignup);
        btnSignin = findViewById(R.id.btnSignin);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePage = new Intent(getApplicationContext(), PersonalRegister.class);
                startActivity(changePage);
            }
        });

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePage = new Intent(getApplicationContext(), Login.class);
                startActivity(changePage);
            }
        });

    }
}
