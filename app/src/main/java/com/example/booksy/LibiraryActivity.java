package com.example.booksy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class LibiraryActivity extends AppCompatActivity {
BottomNavigationView navigationView;
RecyclerView recyclerView;
LibiraryAdapter libiraryAdapter;
List<Book>lsBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libirary);


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
                        return true;
                    case R.id.wishList:
                        startActivity(new Intent(getApplicationContext(), WhishListActivity.class));
                        return true;
                }
                return false;
            }
        });

        recyclerView= findViewById(R.id.recycleview);
        lsBook = new ArrayList<>();
        lsBook.add(new Book(R.drawable.book1,"Love. Water. Memory"));
        lsBook.add(new Book(R.drawable.book2,"The water cure") );
        lsBook.add(new Book(R.drawable.book3,"The prophesey"));
        lsBook.add(new Book(R.drawable.book4,"Love. Water. Memory"));
        lsBook.add(new Book(R.drawable.book5,"Dracula"));
        lsBook.add(new Book(R.drawable.book6,"Follow me to ground"));
        lsBook.add(new Book(R.drawable.book18,"Follow me to ground"));
        lsBook.add(new Book(R.drawable.booook,"The second man"));
        lsBook.add(new Book(R.drawable.bookmain,"Educated"));
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(LibiraryActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        libiraryAdapter= new LibiraryAdapter(LibiraryActivity.this,lsBook);
        recyclerView.setAdapter(libiraryAdapter);
    }
}