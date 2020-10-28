package com.sungkyul.appjango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavFood1 extends AppCompatActivity {
    private Button btn_next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_food1);

        btn_next1 = findViewById(R.id.btn_next1);
        btn_next1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FavFood1.this, FavFood2.class);
                startActivity(intent);
            }
        });
    }
}