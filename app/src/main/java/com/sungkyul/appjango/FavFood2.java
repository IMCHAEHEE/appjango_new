package com.sungkyul.appjango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavFood2 extends AppCompatActivity {
    private Button btn_next2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_food2);

        btn_next2 = findViewById(R.id.btn_next2);
        btn_next2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FavFood2.this, FavFood3.class);
                startActivity(intent);
            }
        });
    }
}