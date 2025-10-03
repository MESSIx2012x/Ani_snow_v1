package com.example.web;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView w = new WebView(this);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl("https://anime-snow.netlify.app/");
        setContentView(w);
    }
}
