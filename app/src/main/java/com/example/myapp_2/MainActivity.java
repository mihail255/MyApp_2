package com.example.myapp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Швец Дмитрий Юрьевич
    //12.03.2024
    //Переход на следующее окно
    public void Btn_Next(View view) {
        Intent intent = new Intent(MainActivity.this, Onboarding_2.class);
        startActivity(intent);
    }
    //Швец Дмитрий Юрьевич
    //12.03.2024
    //Переход на последнее окно
    public void Btn_Skip(View view) {
        setContentView(R.layout.activity_omboarding3);
    }
}