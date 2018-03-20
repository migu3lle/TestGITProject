package com.example.gunmic.mytestgitapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Ich bin ein Test");
        Log.d("test_log", "Hallo ich bin ein Test Logeintrag");
        Log.d("test_log", "Hallo ich bin ein zweiter Test Logeintrag");
    }
}
