package zomaru.zerotwo.wallpaperpicker.AboutZeroTwo;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import zomaru.zerotwo.wallpaperpicker.R;

public class AboutHer extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
    @BindView(R.id.about_her)
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView(R.id.zero_two_web)
    WebView webView;
    private WebSettings webSettings;
    private final String alamatweb = "http://darling-in-the-franxx.wikia.com/wiki/Zero_Two";

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_zero_two);
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

