package com.example.myapp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Onboarding_2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding2);

    }
    //Швец Дмитрий Юрьевич
    //12.03.2024
    //Переход на последнее окно
    public void Btn_Skip(View view) {
        setContentView(R.layout.activity_omboarding3);
    }
    //Швец Дмитрий Юрьевич
    //12.03.2024
    //Переход на следующее окно

    public void Btn_Next(View view) {
        Intent intent = new Intent(Onboarding_2.this, Omboarding_3.class);
        startActivity(intent);
    }
}