package com.example.booksy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ReadActivity extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);

        bottomNavigationView=findViewById(R.id.navigationBar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
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
                        return true;
                    case R.id.libirary:
                        startActivity(new Intent(getApplicationContext(), LibiraryActivity.class));
                        return true;
                    case R.id.wishList:
                        startActivity(new Intent(getApplicationContext(), WhishListActivity.class));
                        return true;
                }
                return false;
            }
        });
    }
}