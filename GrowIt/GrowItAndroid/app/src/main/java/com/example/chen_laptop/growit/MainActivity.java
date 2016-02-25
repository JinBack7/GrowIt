package com.example.chen_laptop.growit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static Button buttonplay;
    static Button buttonopt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonplay = (Button) findViewById(R.id.buttonplay);
        buttonopt = (Button) findViewById(R.id.buttonopt);
        buttonplay.getBackground().setAlpha(0);
        buttonopt.getBackground().setAlpha(0);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
}
