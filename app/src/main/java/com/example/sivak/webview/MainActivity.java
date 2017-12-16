package com.example.sivak.webview;

import android.provider.Browser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static Button btn;
    private static EditText et;
    private static WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        et = findViewById(R.id.edittext);
        wv = findViewById(R.id.webview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = et.getText().toString();
                WebView browser = null;
                wv.getSettings().setLoadsImagesAutomatically(true);
                wv.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
                wv.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                wv.loadUrl(url);
            }
        });
    }
}
