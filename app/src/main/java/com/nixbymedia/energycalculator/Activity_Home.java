package com.nixbymedia.energycalculator;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class Activity_Home extends AppCompatActivity {


    android.support.v4.app.FragmentManager fragmentManager;
    int count = 0;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_back:
                    manageBackStack();
                    return false;

                case R.id.navigation_comment:

                    checkEnabled();
                    return true;
                case R.id.navigation_forward:
                    //fragmentManager.beginTransaction().replace(R.id.fragment_main, new Thermal_Envelope()).commit();
                    manageForwardStack();
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        BottomNavigationView navigation =  findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.fragment_main, new PropertyDetail()).commit();

        checkEnabled();


    }

    @SuppressLint("RestrictedApi")
    private void checkEnabled(){
        if(count == 0){
            BottomNavigationItemView back = findViewById(R.id.navigation_back);
            back.setEnabled(false);
        }
        if(count == 6){
            BottomNavigationItemView forward = findViewById(R.id.navigation_forward);
            forward.setEnabled(false);
        }
    }


    private void manageBackStack() {
        switch (count) {
            case 0:
                count = 0;
                break;
            case 1:
                count = 0;
                fragmentManager.beginTransaction().replace(R.id.fragment_main, new PropertyDetail()).commit();
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();
                break;
            case 2:
                count = count -1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();
                break;
            case 3:
                count = count -1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();
                break;

            case 4:
                count = count -1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();
                break;
            case 5:
                count = count -1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();

                break;
            case 6:
                count = count -1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();

                break;
            case 7:
                break;

            case 8:

                break;
            default:
                /*int a =getSupportFragmentManager().getBackStackEntryCount();
                Toast.makeText(this, a, Toast.LENGTH_SHORT).show();*/
        }
    }

    private void manageForwardStack() {
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

        switch (count) {
            case 0:
                fragmentManager.beginTransaction().replace(R.id.fragment_main, new Thermal_Envelope()).commit();
                count = count + 1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();
                break;
            case 1:
                fragmentManager.beginTransaction().replace(R.id.fragment_main, new Heating_System()).commit();
                count = count + 1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();
                break;
            case 2:
                count = count + 1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();
                break;
            case 3:
                count = count + 1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();
                break;

            case 4:
                count = count + 1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();
                break;
            case 5:
                count = count + 1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();
                break;
            case 6:
                count = count + 1;
                Toast.makeText(this, " "+count, Toast.LENGTH_SHORT).show();
                break;
            case 7:
                break;

            default:
                /*int a =getSupportFragmentManager().getBackStackEntryCount();
                Toast.makeText(this, ""+a, Toast.LENGTH_SHORT).show();*/
        }
    }

}
