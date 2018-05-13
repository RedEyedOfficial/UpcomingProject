package zomaru.zerotwo.wallpaperpicker.WallPaperPicker;

import android.app.Application;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by root on 5/8/18.
 */

public class Requester extends Application {
    private RequestQueue requestQueue;
    private static Requester requester;
    public static final String TAG = Requester.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        requester = this;
    }

    public static synchronized Requester getRequester() {
        return requester;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return requestQueue;
    }

    public <T> void addRequest (Request<T> request, String tag) {
        request.setTag(TextUtils.isEmpty(tag)? TAG : tag);
        getRequestQueue().add(request);
    }

    public <T> void addRequest (Request<T> request) {
        request.setTag(TAG);
        getRequestQueue().add(request);
    }

    public void cancelRequest(Object o) {
        if (requestQueue != null) {
            requestQueue.cancelAll(o);
        }
    }
}
