package com.example.chint.linearlayout;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonChecked(View v){
        RadioButton a = (RadioButton)findViewById(R.id.radioButton);
        RadioButton b = (RadioButton)findViewById(R.id.radioButton2);
        RadioButton c = (RadioButton)findViewById(R.id.radioButton3);
        RelativeLayout li = (RelativeLayout) findViewById(R.id.ll);

        int option = v.getId();
        li.setBackgroundColor(Color.WHITE);
        if(option==R.id.radioButton){
            li.setBackgroundColor(Color.RED);
        }
        if(option==R.id.radioButton2){
            li.setBackgroundColor(Color.BLUE);
        }
        if(option==R.id.radioButton3){
            li.setBackgroundColor(Color.GREEN);
        }
    }

    public void onClick1(View v){
        Button a = (Button)findViewById(R.id.google);
        Button b = (Button)findViewById(R.id.yahoo);
        Intent i = new Intent(this, WebviewActivity.class);
        i.putExtra("name", v.getId());
        startActivity(i);

    }

}
