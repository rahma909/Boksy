package com.example.booksy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInActiviy extends AppCompatActivity {
    EditText email,password;
    Button signup;
    TextView registerPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_activiy);
        email=findViewById(R.id.logInEmail);
        password=findViewById(R.id.logInPassword);
        registerPage=findViewById(R.id.textRegisterPage);
        signup=findViewById(R.id.btnSignUp);
        registerPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogInActiviy.this,createAccountActivity.class));
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogInActiviy.this,HomeActivity.class));
            }
        });
    }
}