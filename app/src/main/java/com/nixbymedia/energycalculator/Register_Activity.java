package com.nixbymedia.energycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Register_Activity extends AppCompatActivity {

    ImageButton btnSignUp;
    Button btnLogin;
    EditText mobilenumber, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);

        btnSignUp = findViewById(R.id.signUp_reg);
        btnLogin = findViewById(R.id.signIn_reg);
        password = findViewById(R.id.password_reg);
        mobilenumber = findViewById(R.id.mobile_number_reg);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register_Activity.this, Login_Activity.class));
                overridePendingTransition(R.anim.animation1,R.anim.animation2);
                finish();
            }
        });


    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(Register_Activity.this, Login_Activity.class));
        overridePendingTransition(R.anim.animation1,R.anim.animation2);
        finish();
    }
}
