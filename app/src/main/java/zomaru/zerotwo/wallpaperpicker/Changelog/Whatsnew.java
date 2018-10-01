package zomaru.zerotwo.wallpaperpicker.Changelog;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import zomaru.zerotwo.wallpaperpicker.R;
import zomaru.zerotwo.wallpaperpicker.Util.Settings.Settings;

public class Whatsnew extends AppCompatActivity {
    private int VALUERECEIVER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Themerize(this);
        setContentView(R.layout.changelog_layout);
    }

    private void Themerize(Activity activity) {
        VALUERECEIVER = Settings.THEMEVALUE;
        switch (VALUERECEIVER) {
            case 1:
                activity.setTheme(R.style.light_theme);
                break;
            case 2:
                activity.setTheme(R.style.dark_theme);
                break;
            case 3:
                activity.setTheme(R.style.black_theme);
                break;
            case 4:
                activity.setTheme(R.style.zero_two_theme);
                break;
            case 5:
                activity.setTheme(R.style.akame_theme);
                break;
        }
    }
}
