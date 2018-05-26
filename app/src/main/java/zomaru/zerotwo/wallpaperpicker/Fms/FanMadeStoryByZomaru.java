package zomaru.zerotwo.wallpaperpicker.Fms;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import zomaru.zerotwo.wallpaperpicker.R;

public class FanMadeStoryByZomaru extends Activity implements SwipeRefreshLayout.OnRefreshListener {
    @BindView(R.id.story_holder)
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView(R.id.fanmadestory)
    WebView webView;
    private WebSettings webSettings;
    private final String alamatweb = "http://zomaru.blogspot.co.id/2018/04/fan-narration-darling-in-franxx-girl-i.html";

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fms);
        ButterKnife.bind(this);

        swipeRefreshLayout.setOnRefreshListener(this);
        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.getUseWideViewPort();
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                swipeRefreshLayout.setRefreshing(true);
            }
        });
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                swipeRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                swipeRefreshLayout.setRefreshing(false);
            }
        });
        webView.loadUrl(alamatweb);

    }

    @Override
    public void onRefresh() {
        webView.reload();
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            finish();
        }
    }
}
