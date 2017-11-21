package com.example.user.myapplication;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        android.app.Fragment fragment = new Main2ActivityFragment();

        transaction.replace(R.id.fragment, fragment);
        transaction.commit();
    }

}
