package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class searchActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //bottomnavigationview 출력
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setSelectedItemId(R.id.searchItem);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.homeItem:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.searchItem:
                        return true;

                    case R.id.cameraItem:
                        startActivity(new Intent(getApplicationContext()
                                , cameraActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.calendarItem:
                        startActivity(new Intent(getApplicationContext()
                                , calendarActivity.class));
                        overridePendingTransition(0, 0);
                        return true;



                }
                return false;
            }
        });
    }
}
