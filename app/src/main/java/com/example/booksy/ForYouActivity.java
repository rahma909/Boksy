package com.example.booksy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class ForYouActivity extends AppCompatActivity {
    List<Book>forYouList;
    RecyclerView recyclerView;
    ForYouAdapter adapter;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_you);
        recyclerView=findViewById(R.id.forYouRecycle);

        bottomNavigationView=findViewById(R.id.navigationBar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        return true;
                    case R.id.forYou:
                        return true;
                    case R.id.read:
                        startActivity(new Intent(getApplicationContext(), ReadActivity.class));
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


        forYouList = new ArrayList<>();
        forYouList.add(new Book(R.drawable.book1,"Love. Water. Memory","5.3"));
        forYouList.add(new Book(R.drawable.book2,"The water cure","5.0") );
        forYouList.add(new Book(R.drawable.book3,"The prophesey","3.4"));
        forYouList.add(new Book(R.drawable.book4,"Love. Water. Memory","3.3"));
        forYouList.add(new Book(R.drawable.book5,"Dracula","5"));
        forYouList.add(new Book(R.drawable.book6,"Follow me to ground","6.5"));
        forYouList.add(new Book(R.drawable.booook,"The second man","2.8"));
        forYouList.add(new Book(R.drawable.bookmain,"Educated","5.0"));
        forYouList.add(new Book(R.drawable.book3,"The prophesey","3.4"));
        forYouList.add(new Book(R.drawable.book4,"Love. Water. Memory","3.3"));
        forYouList.add(new Book(R.drawable.book5,"Dracula","5"));
        forYouList.add(new Book(R.drawable.book6,"Follow me to ground","6.5"));
        forYouList.add(new Book(R.drawable.booook,"The second man","2.8"));
        forYouList.add(new Book(R.drawable.bookmain,"Educated","5.0"));

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(ForYouActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        adapter= new ForYouAdapter(ForYouActivity.this,forYouList);
        recyclerView.setAdapter(adapter);

    }
}