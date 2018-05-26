package zomaru.zerotwo.wallpaperpicker.Util.Settings;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.SwitchPreference;

import zomaru.zerotwo.wallpaperpicker.BuildConfig;
import zomaru.zerotwo.wallpaperpicker.Changelog.Whatsnew;
import zomaru.zerotwo.wallpaperpicker.R;

public class Settings extends PreferenceActivity {

    private final String THEME = "theme";
    private final String MONITOR = "monitor";
    private final String AV = "ssav";
    private final String CHANGELOG = "changelog";
    private final String ZAP = "applywp";
    private final String HITORI = "animate";
    private final String SILENT = "silence";
    public static boolean quickEnabled;
    public static boolean isAnimated;
    public static boolean diam;
    private ListPreference themechooser;
    private Preference monitor;
    private Preference appver;
    private Preference changelog;
    private SwitchPreference quickapply;
    private SwitchPreference animator;
    private SwitchPreference silencer;
    private String oslevel;
    public static int THEMEVALUE;

    public void onCreate (Bundle savedInstanceState) {
        Themer.activityApplyTheme(this);

        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);

        themechooser = (ListPreference)findPreference(THEME);
        themechooser.setIcon(R.drawable.ic_theme);
        themechooser.setDefaultValue(1);
        themechooser.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object o) {
                final ListPreference listPreference = (ListPreference) preference;
                final int theme = listPreference.findIndexOfValue((String) o);
                listPreference.setSummary("Tema saat ini adalah: " + listPreference.getEntries()[theme]);
                switch (listPreference.findIndexOfValue((String) o)) {
                    default:
                    case 0:
                        lightApply();
                        listPreference.setSummary("Tema saat ini adalah: " + listPreference.getEntries()[theme]);
                        THEMEVALUE = 1;
                        break;
                    case 1:
                        darkApply();
                        listPreference.setSummary("Tema saat ini adalah: " + listPreference.getEntries()[theme]);
                        THEMEVALUE = 2;
                        break;
                    case 2:
                        blackApply();
                        listPreference.setSummary("Tema saat ini adalah: " + listPreference.getEntries()[theme]);
                        THEMEVALUE = 3;
                        break;
                    case 3:
                            zerotwoApply();
                            listPreference.setSummary("Tema saat ini adalah: " + listPreference.getEntries()[theme]);
                            THEMEVALUE = 4;

                        break;
                    case 4:
                            akameApply();
                            listPreference.setSummary("Tema saat ini adalah: " + listPreference.getEntries()[theme]);
                            THEMEVALUE = 5;

                        break;
                }
                return true;
            }
        });

        quickapply = (SwitchPreference)findPreference(ZAP);
        quickapply.setIcon(R.drawable.ic_quick);
        quickapply.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object o) {
                boolean hidup = quickapply.isChecked();
                if (hidup) {
                    quickEnabled = false;
                } else {
                    quickEnabled = true;
                }
                return true;
            }
        });

        animator = (SwitchPreference)findPreference(HITORI);
        animator.setIcon(R.drawable.ic_play_animation);
        animator.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object o) {
                boolean animated = animator.isChecked();
                if (animated) {
                    isAnimated = false;
                } else {
                    isAnimated = true;
                }
                return true;
            }
        });
        silencer = (SwitchPreference)findPreference(SILENT);
        silencer.setIcon(R.drawable.ic_darling_mute);
        silencer.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object o) {
                boolean mute = silencer.isChecked();
                if (mute) {
                    diam = false;
                } else {
                    diam = true;
                }
                return true;
            }
        });

        monitor = (Preference)findPreference(MONITOR);
        switch (Build.VERSION.SDK_INT) {
            case 19:
                oslevel = "Kitkat";
                break;
            case 20:
                oslevel = "Kitkat";
                break;
            case 21:
                oslevel = "Lolipop";
                break;
            case 22:
                oslevel = "Lolipop";
                break;
            case 23:
                oslevel = "Marshmallow";
                break;
            case 24:
                oslevel = "Nougat";
                break;
            case 25:
                oslevel = "Nougat";
                break;
            case 26:
                oslevel = "Oreo";
                break;
        }
        changelog = (Preference)findPreference(CHANGELOG);
        changelog.setSummary(getApplicationContext().getResources().getString(R.string.changelog_summary));
        changelog.setIcon(R.drawable.ic_about_app);
        changelog.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(Settings.this, Whatsnew.class));
                return true;
            }
        });

        monitor.setSummary(getApplicationContext().getResources().getString(R.string.system_summary));
        monitor.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(Settings.this, SystemMonitor.class));
                return true;
            }
        });

        appver = (Preference)findPreference(AV);
        appver.setSummary(BuildConfig.VERSION_NAME);
    }

    public void lightApply() {
        Themer.setTheme(this, Themer.LIGHT_THEME);
    }

    public void darkApply () {
        Themer.setTheme(this, Themer.DARK_THEME);
    }

    public void blackApply () {
        Themer.setTheme(this, Themer.BLACK_THEME);
    }

    public void akameApply () {
        Themer.setTheme(this, Themer.RED_EYED_THEME);
    }

    public void zerotwoApply () {
        Themer.setTheme(this, Themer.ZERO_TWO_THEME);
    }

}
