package zomaru.zerotwo.wallpaperpicker.OSL;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;

import zomaru.zerotwo.wallpaperpicker.R;
import zomaru.zerotwo.wallpaperpicker.Util.Settings.Settings;

public class OSL extends PreferenceActivity {
    private Preference preference;
    private Preference pref;
    private final String OSL = "osl";
    private final String LIBRARY = "library";
    private int VALUERECEIVER;

    public void onCreate(Bundle savedInstanceState) {
        Themerize(this);
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.osl);

        preference = (Preference)findPreference(OSL);
        preference.setTitle(getApplicationContext().getResources().getString(R.string.open_source));
        preference.setSummary(getApplicationContext().getResources().getString(R.string.osl_summary));
        preference.setIcon(R.drawable.ic_open_source);
        preference.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(zomaru.zerotwo.wallpaperpicker.OSL.OSL.this, OpenSource.class));
                return true;
            }
        });

        pref = (Preference)findPreference(LIBRARY);
        pref.setIcon(R.drawable.ic_library);
        pref.setTitle(getApplicationContext().getResources().getString(R.string.library));
        pref.setSummary(getApplicationContext().getResources().getString(R.string.lib_summary));
        pref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(zomaru.zerotwo.wallpaperpicker.OSL.OSL.this, Library.class));
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
                activity.setTheme(R.style.zero_two_theme);
                break;
            case 5:
                activity.setTheme(R.style.red_eyed_theme);
                break;
        }
    }
}
