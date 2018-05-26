package zomaru.zerotwo.wallpaperpicker.Helper;

import android.app.Activity;
import android.media.MediaPlayer;

import zomaru.zerotwo.wallpaperpicker.R;
import zomaru.zerotwo.wallpaperpicker.Util.Settings.Settings;

/**
 * Created by root on 5/24/18.
 */

public class BokuNoDarling {
    private Activity activity;
    public BokuNoDarling (Activity activity) {
        this.activity = activity;
    }

    public Activity Darling() {
        return activity;
    }

    public void setDarling(Activity activity) {

        this.activity = activity;
        MediaPlayer mediaPlayer = MediaPlayer.create(activity, R.raw.mydarling);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.release();
            }
        });
        mediaPlayer.start();
    }



}
