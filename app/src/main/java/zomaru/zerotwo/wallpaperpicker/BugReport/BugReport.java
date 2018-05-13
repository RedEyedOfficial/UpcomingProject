package zomaru.zerotwo.wallpaperpicker.BugReport;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;

import zomaru.zerotwo.wallpaperpicker.R;
import zomaru.zerotwo.wallpaperpicker.Util.Settings.Settings;

public class BugReport extends PreferenceActivity {

    private Preference bugger;
    private Preference feedback;
    private final String BUG = "bug_report";
    private final String FEEDBACK = "feedback";
    private int VALUERECEIVER;

    public void onCreate(Bundle savedInstanceState) {
        Themerize(this);
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.bug_report);

        bugger = (Preference)findPreference(BUG);
        bugger.setIcon(R.drawable.ic_bug_report);
        bugger.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfRV0SSQ6O2QmtjnUCinf3P3pb9kHPyuURrrbe8wCvOrGvC2g/viewform"));
                ResolveInfo resolveInfo = getPackageManager().resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY);
                String packageName = resolveInfo.activityInfo.packageName;
                startActivity(getPackageManager().getLaunchIntentForPackage(packageName));
                startActivity(intent);
                return true;
            }
        });

        feedback = (Preference)findPreference(FEEDBACK);
        feedback.setIcon(R.drawable.ic_feedback);
        feedback.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfMWqD0STqR8bhLOwFH5m_QYFBBf-CbjhzTca33ajUZtwBnZg/viewform"));
                ResolveInfo resolveInfo = getPackageManager().resolveActivity(intent,PackageManager.MATCH_DEFAULT_ONLY);
                String packageName = resolveInfo.activityInfo.packageName;
                startActivity(getPackageManager().getLaunchIntentForPackage(packageName));
                startActivity(intent);
                return true;
            }
        });
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
                if (Build.VERSION.SDK_INT < 24) {

                } else {
                    activity.setTheme(R.style.zero_two_theme);
                } break;
            case 5:
                if (Build.VERSION.SDK_INT < 24) {

                } else {
                    activity.setTheme(R.style.red_eyed_theme);
                } break;
        }
    }
}
