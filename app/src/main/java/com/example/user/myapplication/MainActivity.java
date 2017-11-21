package com.example.user.myapplication;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.VideoView;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

//    private String url = "https://medlineplus.gov/ency/anatomyvideos/000013.htm";
//    private String url = "https://player.vimeo.com/video/201878775?api=1&autoplay=1&maxheight=480&maxwidth=800";
    private String url = "https://developer.android.com/guide/components/fragments.html?hl=ru";
//    private String url = "https://www.adobe.com/shockwave/welcome/";
//    private String url = "http://calorieking.com/products/iosfoodsearch/";
//    private String url = "https://www.adobe.com/software/flash/about/";
//    private String url = "http://nihseniorhealth.gov/diabetes/selfmonitoring/video/db2_na.html?intro=yes";

//    private String url = "https://medlineplus.gov/ency/videos/mov/200079_eng_ad.mp4";

//    private String url = "http://broken-links.com/tests/video/";
//private String url = "http://www.bd.com/us/diabetes/page.aspx?cat=7001&id=7258";

//    private String url = "https://mdtprodmedia2.streaming.mediaservices.windows.net/8b957c75-2a14-4ff3-a8c5-e953427b4e4d/1616_3191b92b-ce75-4234-9228-32d0d6953ab0.ism/manifest(format=m3u8-aapl)";

    WebView webView;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        webView = (WebView) findViewById(R.id.web);



        /*mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.getSettings().setPluginState(WebSettings.PluginState.ON);
        mWebView.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND);
        mWebView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Log.d("myLogs", "shouldOverrideUrlLoading");
                return super.shouldOverrideUrlLoading(view, request);
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                Log.d("myLogs", "onPageStarted url = " + url);
                super.onPageStarted(view, url, favicon);
            }
        });
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setAppCacheEnabled(true);
        mWebView.getSettings().setSaveFormData(true);
        mWebView.loadUrl(url);*/


        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView view, String url, String message, final android.webkit.JsResult result)
            {
                Log.d("myLogs", message);
                new AlertDialog.Builder(view.getContext()).setMessage(message).setCancelable(true).show();
                result.confirm();
                return true;
            }

        });

        webView.setWebChromeClient(new WebChromeClient());



        webView.getSettings().setJavaScriptEnabled(true);

        webView.getSettings().setDomStorageEnabled(true);
//        webView.getSettings().setAllowFileAccessFromFileURLs(true);
//        webView.getSettings().setAllowUniversalAccessFromFileURLs(true);

        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.getSettings().setAllowFileAccess(true);
//        webView.getSettings().setPluginState(WebSettings.PluginState.ON_DEMAND);

        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        webView.getSettings().setAllowFileAccess(true);
//        webView.getSettings().setUserAgentString("Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");

        webView.getSettings().setUserAgentString("Mozilla/5.0 (Linux; Android 6.0.1; SAMSUNG SM-G900P Build/MMB29M) AppleWebKit/537.36 (KHTML, like Gecko) SamsungBrowser/4.0 Chrome/44.0.2403.133 Mobile Safari/537.36");
        Map<String, String> extraHeaders = new HashMap<String, String>();
        extraHeaders.put("x-wap-profile","http://device.sprintpcs.com/Samsung/SM-G900P-SPRINT/PH3.rdf");
        extraHeaders.put("Accept-Encoding","gzip, deflate, sdch");
        extraHeaders.put("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*;q=0.8");
//        Mozilla/5.0 (Linux; Android 6.0.1; SAMSUNG SM-G900P Build/MMB29M) AppleWebKit/537.36 (KHTML, like Gecko) SamsungBrowser/4.0 Chrome/44.0.2403.133 Mobile Safari/537.36

        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                Log.d("myLogs", "shouldOverrideUrlLoading url = " + url + " - getWidth = " + view.getWidth());
                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                Log.d("myLogs", "onPageStarted url = " + url + " - getWidth = " + view.getWidth());
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                Log.d("myLogs", "onPageFinished url = " + url);
            }

            @Override
            public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {
                super.onReceivedSslError(view, handler, error);
                Log.d("myLogs", "onReceivedSslError " + error.getPrimaryError());

                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setMessage("Ignore SSL certificate errors. Do you want to proceed?");
                builder.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        handler.proceed();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        handler.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });


        webView.loadUrl(url);


        /*WebView container = (WebView)findViewById(R.id.web);

        container.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        container.getSettings().setJavaScriptEnabled(true);
        container.getSettings().setDomStorageEnabled(true);
        container.getSettings().setAllowFileAccessFromFileURLs(true);
        container.getSettings().setAllowUniversalAccessFromFileURLs(true);
        container.getSettings().setPluginState(WebSettings.PluginState.ON);
        container.getSettings().setLoadsImagesAutomatically(true);
        container.getSettings().setJavaScriptCanOpenWindowsAutomatically(
                true);
        container.getSettings().setAllowFileAccess(true);
        container.setWebChromeClient(new WebChromeClient() {

            @Override
            public void onConsoleMessage(String message, int lineNumber,
                                         String sourceID) {
                Log.d("TAG", message + " -- From line "
                        + lineNumber + " of " + sourceID);
            }

            @Override
            public boolean onJsAlert(WebView view, String url,
                                     String message, final android.webkit.JsResult result) {
                Log.d("TAG", message);
                new AlertDialog.Builder(view.getContext())
                        .setMessage(message).setCancelable(true).show();
                result.confirm();
                return true;
            }

        });




        container.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                return false;
            }

        });

        container.loadUrl(url);*/

    }



}
