package com.example.armani.unilocator;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.example.armani.unilocator.fragments.MainFragment;


public class MapsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        MainFragment mainFragment = (MainFragment)getSupportFragmentManager().findFragmentById(R.id.container_main);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            //Maps Activity will load mainFragment here and show the map
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container_main, mainFragment)
                    .commit();
        }

    }


}
