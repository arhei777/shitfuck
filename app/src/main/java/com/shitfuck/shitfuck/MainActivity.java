package com.shitfuck.shitfuck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int iii=99;
        boolean bool = true;
        //comment j'ai foutu ca la...
        bool = (Boolean) (true);


    }
}
