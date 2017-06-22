package com.example.chint.linearlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView w = (WebView)findViewById(R.id.web);
        w.getSettings().setJavaScriptEnabled(true);
        w.setWebViewClient(new WebViewClient());

        Intent i = getIntent();
        int id = i.getIntExtra("name",0);

        if(id == R.id.google)
            w.loadUrl("http://www.google.com");
        if(id == R.id.yahoo)
            w.loadUrl("http://www.yahoo.com");
    }

}
