package com.example.rsu.myproject;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Website extends AppCompatActivity {


    private WebViewClient webViewClient;
    private ProgressBar progressLoading;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        progressLoading = (ProgressBar) findViewById(R.id.progressBar);
        progressLoading.setVisibility(View.VISIBLE);

        WebView mWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        String mWeb = getIntent().getStringExtra("Web");
        mWebView.loadUrl(mWeb);

        webViewClient = new WebViewClient() {

            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                progressLoading.setVisibility(View.VISIBLE);
                super.onPageStarted(view, url, favicon);
            }

            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressLoading.setVisibility(View.INVISIBLE);
            }

        };//End of webViewClient

        mWebView.setWebViewClient(webViewClient);
        webSettings.setAppCacheEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        mWebView.canGoBack();
        mWebView.canGoForward();


    }//End of onCreate
}
