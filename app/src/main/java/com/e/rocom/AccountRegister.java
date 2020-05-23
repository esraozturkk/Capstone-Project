package com.e.rocom;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


public class AccountRegister extends AppCompatActivity {

    Button btnBackX, btnNextX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_register);

        btnBackX = findViewById(R.id.btnBack);
        btnNextX = findViewById(R.id.btnNext);

        btnBackX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePage2 = new Intent(getApplicationContext(), WelcomePage.class);
                startActivity(changePage2);
            }
        });

        btnNextX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePage2 = new Intent(getApplicationContext(), UniversityRegister.class);
                startActivity(changePage2);
            }
        });
    }
}
