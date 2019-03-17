package com.example.devzucca.kpopevent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.devzucca.fcm.R;

public class Webview2 extends AppCompatActivity {

    private WebView mWebView;
    private WebSettings mWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview2);

         mWebView = (WebView) findViewById(R.id.webview);
         mWebView.setWebViewClient(new WebViewClient());
         mWebSettings = mWebView.getSettings();
         mWebSettings.setJavaScriptEnabled(true);
         mWebView.loadUrl("https://www.tickettailor.com/events/youngbros/240153");




        }
    }


