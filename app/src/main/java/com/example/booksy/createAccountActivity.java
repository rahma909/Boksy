package com.example.booksy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class createAccountActivity extends AppCompatActivity {
    EditText  fullName,userName,email,password;
    Button createAccount;
    TextView signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        fullName=findViewById(R.id.fullName);
        userName=findViewById(R.id.userName);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        signUp=findViewById(R.id.textSignInPage);
        createAccount=findViewById(R.id.btnCreateAccount);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(createAccountActivity.this,LogInActiviy.class));
            }
        });
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(createAccountActivity.this,HomeActivity.class));
            }
        });
    }
}