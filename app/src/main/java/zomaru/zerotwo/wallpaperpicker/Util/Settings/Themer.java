package zomaru.zerotwo.wallpaperpicker.Util.Settings;

import android.app.Activity;
import android.content.Intent;

import zomaru.zerotwo.wallpaperpicker.R;

public class Themer {
    //theme changing utility//
    private static int Theme;
    public static final int LIGHT_THEME = 1;
    public static final int DARK_THEME = 2;
    public static final int BLACK_THEME = 3;
    public static final int ZERO_TWO_THEME = 4;
    public static final int RED_EYED_THEME = 5;

    public static void setTheme(Activity activity, int teme) {
        Theme = teme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    public static void activityApplyTheme(Activity activity) {
        switch (Theme) {
            default:
            case LIGHT_THEME:
                activity.setTheme(R.style.light_theme);
                break;
            case DARK_THEME:
                activity.setTheme(R.style.dark_theme);
                break;
            case BLACK_THEME:
                activity.setTheme(R.style.black_theme);
                break;
            case ZERO_TWO_THEME:
                activity.setTheme(R.style.zero_two_theme);
                break;
            case RED_EYED_THEME:
                activity.setTheme(R.style.akame_theme);
                break;
        }
    }
}
