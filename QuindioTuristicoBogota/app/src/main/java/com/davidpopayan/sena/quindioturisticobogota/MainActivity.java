package com.davidpopayan.sena.quindioturisticobogota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, prueba.class);
                startActivity(intent);
                finish();
            }

        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 3000);
    }
}
