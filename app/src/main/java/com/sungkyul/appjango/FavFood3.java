package com.sungkyul.appjango;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class FavFood3 extends AppCompatActivity {

    private Button btn_done;
    private Button btn_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_food1);
        setContentView(R.layout.activity_fav_food2);
        setContentView(R.layout.activity_fav_food3);

        final CheckBox ch1 = (CheckBox)findViewById(R.id.ch1);
        final CheckBox ch2 = (CheckBox)findViewById(R.id.ch2);
        final CheckBox ch3 = (CheckBox)findViewById(R.id.ch3);
        final CheckBox ch4 = (CheckBox)findViewById(R.id.ch4);
        final CheckBox ch5 = (CheckBox)findViewById(R.id.ch5);
        final CheckBox ch6 = (CheckBox)findViewById(R.id.ch6);
        final CheckBox ch7 = (CheckBox)findViewById(R.id.ch7);
        final CheckBox ch8 = (CheckBox)findViewById(R.id.ch8);
        final CheckBox ch9 = (CheckBox)findViewById(R.id.ch9);
        final CheckBox ch10 = (CheckBox)findViewById(R.id.ch10);
        final CheckBox ch11 = (CheckBox)findViewById(R.id.ch11);
        final CheckBox ch12 = (CheckBox)findViewById(R.id.ch12);
        final CheckBox ch13 = (CheckBox)findViewById(R.id.ch13);
        final CheckBox ch14 = (CheckBox)findViewById(R.id.ch14);
        final CheckBox ch15 = (CheckBox)findViewById(R.id.ch15);
        final CheckBox ch16 = (CheckBox)findViewById(R.id.ch16);
        final CheckBox ch17 = (CheckBox)findViewById(R.id.ch17);
        final CheckBox ch18 = (CheckBox)findViewById(R.id.ch18);
        final CheckBox ch19 = (CheckBox)findViewById(R.id.ch19);
        final CheckBox ch20 = (CheckBox)findViewById(R.id.ch20);
        final CheckBox ch21 = (CheckBox)findViewById(R.id.ch21);
        final CheckBox ch22 = (CheckBox)findViewById(R.id.ch22);
        final CheckBox ch23 = (CheckBox)findViewById(R.id.ch23);
        final CheckBox ch24 = (CheckBox)findViewById(R.id.ch24);
        final CheckBox ch25 = (CheckBox)findViewById(R.id.ch25);
        final CheckBox ch26 = (CheckBox)findViewById(R.id.ch26);
        final CheckBox ch27 = (CheckBox)findViewById(R.id.ch27);
        final CheckBox ch28 = (CheckBox)findViewById(R.id.ch28);
        final CheckBox ch29 = (CheckBox)findViewById(R.id.ch29);
        final CheckBox ch30 = (CheckBox)findViewById(R.id.ch30);
        final CheckBox ch31 = (CheckBox)findViewById(R.id.ch31);
        final CheckBox ch32 = (CheckBox)findViewById(R.id.ch32);
        final CheckBox ch33 = (CheckBox)findViewById(R.id.ch33);
        final CheckBox ch34 = (CheckBox)findViewById(R.id.ch34);
        final CheckBox ch35 = (CheckBox)findViewById(R.id.ch35);
        final CheckBox ch36 = (CheckBox)findViewById(R.id.ch36);
        final CheckBox ch37 = (CheckBox)findViewById(R.id.ch37);
        final CheckBox ch38 = (CheckBox)findViewById(R.id.ch38);
        final CheckBox ch39 = (CheckBox)findViewById(R.id.ch39);
        final CheckBox ch40 = (CheckBox)findViewById(R.id.ch40);
        final CheckBox ch41 = (CheckBox)findViewById(R.id.ch41);
        final CheckBox ch42 = (CheckBox)findViewById(R.id.ch42);
        final CheckBox ch43 = (CheckBox)findViewById(R.id.ch43);
        final CheckBox ch44 = (CheckBox)findViewById(R.id.ch44);
        final CheckBox ch45 = (CheckBox)findViewById(R.id.ch45);
        final CheckBox ch46 = (CheckBox)findViewById(R.id.ch46);
        final CheckBox ch47 = (CheckBox)findViewById(R.id.ch47);
        final CheckBox ch48 = (CheckBox)findViewById(R.id.ch48);
        final CheckBox ch49 = (CheckBox)findViewById(R.id.ch49);
        final CheckBox ch50 = (CheckBox)findViewById(R.id.ch50);
        final CheckBox ch51 = (CheckBox)findViewById(R.id.ch51);
        final CheckBox ch52 = (CheckBox)findViewById(R.id.ch52);
        final CheckBox ch53 = (CheckBox)findViewById(R.id.ch53);
        final CheckBox ch54 = (CheckBox)findViewById(R.id.ch54);
        final CheckBox ch55 = (CheckBox)findViewById(R.id.ch55);
        final CheckBox ch56 = (CheckBox)findViewById(R.id.ch56);
        final CheckBox ch57 = (CheckBox)findViewById(R.id.ch57);
        final CheckBox ch58 = (CheckBox)findViewById(R.id.ch58);
        final CheckBox ch59 = (CheckBox)findViewById(R.id.ch59);
        final CheckBox ch60 = (CheckBox)findViewById(R.id.ch60);
        final CheckBox ch61 = (CheckBox)findViewById(R.id.ch61);
        final CheckBox ch62 = (CheckBox)findViewById(R.id.ch62);
        final CheckBox ch63 = (CheckBox)findViewById(R.id.ch63);
        final CheckBox ch64 = (CheckBox)findViewById(R.id.ch64);
        final CheckBox ch65 = (CheckBox)findViewById(R.id.ch65);
        final CheckBox ch66 = (CheckBox)findViewById(R.id.ch66);
        final CheckBox ch67 = (CheckBox)findViewById(R.id.ch67);
        final CheckBox ch68 = (CheckBox)findViewById(R.id.ch68);
        final CheckBox ch69 = (CheckBox)findViewById(R.id.ch69);
        final CheckBox ch70 = (CheckBox)findViewById(R.id.ch70);
        final CheckBox ch71 = (CheckBox)findViewById(R.id.ch71);
        final CheckBox ch72 = (CheckBox)findViewById(R.id.ch72);
        final CheckBox ch73 = (CheckBox)findViewById(R.id.ch73);
        final CheckBox ch74 = (CheckBox)findViewById(R.id.ch74);
        final CheckBox ch75 = (CheckBox)findViewById(R.id.ch75);
        final CheckBox ch76 = (CheckBox)findViewById(R.id.ch76);
        final CheckBox ch77 = (CheckBox)findViewById(R.id.ch77);
        final CheckBox ch78 = (CheckBox)findViewById(R.id.ch78);
        final CheckBox ch79 = (CheckBox)findViewById(R.id.ch79);
        final CheckBox ch80 = (CheckBox)findViewById(R.id.ch80);
        final CheckBox ch81 = (CheckBox)findViewById(R.id.ch81);
        final CheckBox ch82 = (CheckBox)findViewById(R.id.ch82);
        final CheckBox ch83 = (CheckBox)findViewById(R.id.ch83);
        final CheckBox ch84 = (CheckBox)findViewById(R.id.ch84);
        final CheckBox ch85 = (CheckBox)findViewById(R.id.ch85);
        final CheckBox ch86 = (CheckBox)findViewById(R.id.ch86);
        final CheckBox ch87 = (CheckBox)findViewById(R.id.ch87);
        final CheckBox ch88 = (CheckBox)findViewById(R.id.ch88);
        final CheckBox ch89 = (CheckBox)findViewById(R.id.ch89);
        final CheckBox ch90 = (CheckBox)findViewById(R.id.ch90);
        final CheckBox ch91 = (CheckBox)findViewById(R.id.ch91);
        final CheckBox ch92 = (CheckBox)findViewById(R.id.ch92);
        final CheckBox ch93 = (CheckBox)findViewById(R.id.ch93);
        final CheckBox ch94 = (CheckBox)findViewById(R.id.ch94);
        final CheckBox ch95 = (CheckBox)findViewById(R.id.ch95);
        final CheckBox ch96 = (CheckBox)findViewById(R.id.ch96);
        final CheckBox ch97 = (CheckBox)findViewById(R.id.ch97);
        final CheckBox ch98 = (CheckBox)findViewById(R.id.ch98);
        final CheckBox ch99 = (CheckBox)findViewById(R.id.ch99);
        final CheckBox ch100 = (CheckBox)findViewById(R.id.ch100);

        btn_done = findViewById(R.id.btn_done);
        final TextView tv = (TextView)findViewById(R.id.textView2);
        btn_done.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_done:
                        String result = "";
                        if (ch1.isChecked()) result += ch1.getText().toString();
                        if (ch2.isChecked()) result += ch2.getText().toString();
                        if (ch3.isChecked()) result += ch3.getText().toString();
                        if (ch4.isChecked()) result += ch4.getText().toString();
                        if (ch5.isChecked()) result += ch5.getText().toString();
                        if (ch6.isChecked()) result += ch6.getText().toString();
                        if (ch7.isChecked()) result += ch7.getText().toString();
                        if (ch8.isChecked()) result += ch8.getText().toString();
                        if (ch9.isChecked()) result += ch9.getText().toString();
                        if (ch10.isChecked()) result += ch10.getText().toString();
                        if (ch11.isChecked()) result += ch11.getText().toString();
                        if (ch12.isChecked()) result += ch12.getText().toString();
                        if (ch13.isChecked()) result += ch13.getText().toString();
                        if (ch14.isChecked()) result += ch14.getText().toString();
                        if (ch15.isChecked()) result += ch15.getText().toString();
                        if (ch16.isChecked()) result += ch16.getText().toString();
                        if (ch17.isChecked()) result += ch17.getText().toString();
                        if (ch18.isChecked()) result += ch18.getText().toString();
                        if (ch19.isChecked()) result += ch19.getText().toString();
                        if (ch20.isChecked()) result += ch20.getText().toString();
                        if (ch21.isChecked()) result += ch21.getText().toString();
                        if (ch22.isChecked()) result += ch22.getText().toString();
                        if (ch23.isChecked()) result += ch23.getText().toString();
                        if (ch24.isChecked()) result += ch24.getText().toString();
                        if (ch25.isChecked()) result += ch25.getText().toString();
                        if (ch26.isChecked()) result += ch26.getText().toString();
                        if (ch27.isChecked()) result += ch27.getText().toString();
                        if (ch28.isChecked()) result += ch28.getText().toString();
                        if (ch29.isChecked()) result += ch29.getText().toString();
                        if (ch30.isChecked()) result += ch30.getText().toString();
                        if (ch31.isChecked()) result += ch31.getText().toString();
                        if (ch32.isChecked()) result += ch32.getText().toString();
                        if (ch33.isChecked()) result += ch33.getText().toString();
                        if (ch34.isChecked()) result += ch34.getText().toString();
                        if (ch35.isChecked()) result += ch35.getText().toString();
                        if (ch36.isChecked()) result += ch36.getText().toString();
                        if (ch37.isChecked()) result += ch37.getText().toString();
                        if (ch38.isChecked()) result += ch38.getText().toString();
                        if (ch39.isChecked()) result += ch39.getText().toString();
                        if (ch40.isChecked()) result += ch40.getText().toString();
                        if (ch41.isChecked()) result += ch41.getText().toString();
                        if (ch42.isChecked()) result += ch42.getText().toString();
                        if (ch43.isChecked()) result += ch43.getText().toString();
                        if (ch44.isChecked()) result += ch44.getText().toString();
                        if (ch45.isChecked()) result += ch45.getText().toString();
                        if (ch46.isChecked()) result += ch46.getText().toString();
                        if (ch47.isChecked()) result += ch47.getText().toString();
                        if (ch48.isChecked()) result += ch48.getText().toString();
                        if (ch49.isChecked()) result += ch49.getText().toString();
                        if (ch50.isChecked()) result += ch50.getText().toString();
                        if (ch51.isChecked()) result += ch51.getText().toString();
                        if (ch52.isChecked()) result += ch52.getText().toString();
                        if (ch53.isChecked()) result += ch53.getText().toString();
                        if (ch54.isChecked()) result += ch54.getText().toString();
                        if (ch55.isChecked()) result += ch55.getText().toString();
                        if (ch56.isChecked()) result += ch56.getText().toString();
                        if (ch57.isChecked()) result += ch57.getText().toString();
                        if (ch58.isChecked()) result += ch58.getText().toString();
                        if (ch59.isChecked()) result += ch59.getText().toString();
                        if (ch60.isChecked()) result += ch60.getText().toString();
                        if (ch61.isChecked()) result += ch61.getText().toString();
                        if (ch62.isChecked()) result += ch62.getText().toString();
                        if (ch63.isChecked()) result += ch63.getText().toString();
                        if (ch64.isChecked()) result += ch64.getText().toString();
                        if (ch65.isChecked()) result += ch65.getText().toString();
                        if (ch66.isChecked()) result += ch66.getText().toString();
                        if (ch67.isChecked()) result += ch67.getText().toString();
                        if (ch68.isChecked()) result += ch68.getText().toString();
                        if (ch69.isChecked()) result += ch69.getText().toString();
                        if (ch70.isChecked()) result += ch70.getText().toString();
                        if (ch71.isChecked()) result += ch71.getText().toString();
                        if (ch72.isChecked()) result += ch72.getText().toString();
                        if (ch73.isChecked()) result += ch73.getText().toString();
                        if (ch74.isChecked()) result += ch74.getText().toString();
                        if (ch75.isChecked()) result += ch75.getText().toString();
                        if (ch76.isChecked()) result += ch76.getText().toString();
                        if (ch77.isChecked()) result += ch77.getText().toString();
                        if (ch78.isChecked()) result += ch78.getText().toString();
                        if (ch79.isChecked()) result += ch79.getText().toString();
                        if (ch80.isChecked()) result += ch80.getText().toString();
                        if (ch81.isChecked()) result += ch81.getText().toString();
                        if (ch82.isChecked()) result += ch82.getText().toString();
                        if (ch83.isChecked()) result += ch83.getText().toString();
                        if (ch84.isChecked()) result += ch84.getText().toString();
                        if (ch85.isChecked()) result += ch85.getText().toString();
                        if (ch86.isChecked()) result += ch86.getText().toString();
                        if (ch87.isChecked()) result += ch87.getText().toString();
                        if (ch88.isChecked()) result += ch88.getText().toString();
                        if (ch89.isChecked()) result += ch89.getText().toString();
                        if (ch90.isChecked()) result += ch90.getText().toString();
                        if (ch91.isChecked()) result += ch91.getText().toString();
                        if (ch92.isChecked()) result += ch92.getText().toString();
                        if (ch93.isChecked()) result += ch93.getText().toString();
                        if (ch94.isChecked()) result += ch94.getText().toString();
                        if (ch95.isChecked()) result += ch95.getText().toString();
                        if (ch96.isChecked()) result += ch96.getText().toString();
                        if (ch97.isChecked()) result += ch97.getText().toString();
                        if (ch98.isChecked()) result += ch98.getText().toString();
                        if (ch99.isChecked()) result += ch99.getText().toString();
                        if (ch100.isChecked()) result += ch100.getText().toString();

                        tv.setText(result);
                        break;
                    default:
                        break;
                }
            }
        });

        btn_main = findViewById(R.id.btn_main);
        btn_main.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FavFood3.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}