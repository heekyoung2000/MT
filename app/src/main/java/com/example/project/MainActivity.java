package com.example.project;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView tvDate;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        //bottomnavigationview 출력
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setSelectedItemId(R.id.homeItem);

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
                        startActivity(new Intent(getApplicationContext()
                                , searchActivity.class));
                        overridePendingTransition(0, 0);
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
        //오늘의 날짜 출력
                tvDate = (TextView) findViewById(R.id.homeItem);
        tvDate.setText(getTime());
    }
    private String getTime() {
        long now = System.currentTimeMillis();
        Date date = new Date(now);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 회원님의 식단입니다");
        String getTime = dateFormat.format(date);

        return getTime;
    }

    /*private FragmentManager fragmentManager = getSupportFragmentManager();
    private homeFragment fragmentHome = new homeFragment();
    private cameraFragment fragmentCamera = new cameraFragment();
    private calendarFragment fragmentCalendar = new calendarFragment();
    private searchFragment fragmentSearch = new searchFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setSelectedItemId(R.id.homeItem);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.homeItem:
                        startActivity(new Intent(getApplicationContext()
                                , homeActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.searchItem:
                        startActivity(new Intent(getApplicationContext()
                                , searchActivity.class));
                        overridePendingTransition(0, 0);
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


    }*/
}



    /*class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch(menuItem.getItemId())
            {
                case R.id.homeItem:
                    startActivity(new Intent(getApplicationContext()
                    ,homeActivity.class));
                    overridePendingTransition(0,0);
                    return true;
                    //transaction.replace(R.id.frameLayout, fragmentHome).commitAllowingStateLoss();
                    //break;

                case R.id.cameraItem:
                    Intent intent2 = new Intent(MainActivity.this, cameraActivity.class);
                    startActivity(intent2);
                    //transaction.replace(R.id.frameLayout, fragmentCamera).commitAllowingStateLoss();

                    break;

                case R.id.calendarItem:
                    Intent intent3 = new Intent(MainActivity.this, calendarActivity.class);
                    startActivity(intent3);
                    //transaction.replace(R.id.frameLayout, fragmentCalendar).commitAllowingStateLoss();
                    break;

                case R.id.searchItem:
                        /*Intent intent4 = new Intent(MainActivity.this, searchActivity.class);
                        startActivity(intent4);
                    transaction.replace(R.id.frameLayout, fragmentSearch).commitAllowingStateLoss();
                    break;
            }
            return true;
        }

    }*/

