package com.example.booksy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WhishListActivity extends AppCompatActivity {
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whish_list);


        navigationView=findViewById(R.id.navigationBar);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        return true;
                    case R.id.forYou:
                        startActivity(new Intent(getApplicationContext(), ForYouActivity.class));
                        return true;
                    case R.id.read:
                        startActivity(new Intent(getApplicationContext(), ReadActivity.class));
                        return true;
                    case R.id.libirary:
                        startActivity(new Intent(getApplicationContext(), LibiraryActivity.class));
                        return true;
                    case R.id.wishList:
                        return true;
                }
                return false;
            }
        });
    }
}