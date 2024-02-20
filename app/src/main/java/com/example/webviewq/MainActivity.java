package com.example.webviewq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    WebView wv1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ed1);
        wv1 = findViewById(R.id.wv1);
        btn1 = findViewById(R.id.btn1);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setWebViewClient(new MyWebViewClient());
    }
    public void dodge(View view) {
        String stringUrl=ed1.getText().toString();
        if (!(stringUrl.equals("")))
        {
            wv1.loadUrl(stringUrl);
        }

    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
}