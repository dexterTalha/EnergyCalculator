package com.nixbymedia.energycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Login_Activity extends AppCompatActivity {
    Button btnSignUp;
    ImageButton btnLogin;
    EditText password, mobilenumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.signIn);
        btnSignUp = findViewById(R.id.signUp);
        password = findViewById(R.id.password);
        mobilenumber = findViewById(R.id.mobile_number);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent
                        (Login_Activity.this, Activity_Home.class));
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent
                        (Login_Activity.this, Register_Activity.class));
                overridePendingTransition(R.anim.animation4,R.anim.animation3);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
