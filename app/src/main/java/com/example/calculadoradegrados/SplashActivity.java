package com.example.calculadoradegrados;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculadoradegrados.MainActivity;

public class SplashActivity extends AppCompatActivity {

    private TextView ContTextView;
    private long timeLeftInMillis = 5000; // 5 segundos de cuenta regresiva

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        ContTextView = findViewById(R.id.ContTextView);

        startCountDown();

    }

    private void startCountDown() {
        new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();
    }

    private void updateTimer() {
        int seconds = (int) (timeLeftInMillis / 1000);
        ContTextView.setText(String.valueOf(seconds));
    }
}
