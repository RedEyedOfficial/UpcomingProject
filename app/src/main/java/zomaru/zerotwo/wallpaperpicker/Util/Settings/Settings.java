package zomaru.zerotwo.wallpaperpicker.Util.Settings;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.HardwarePropertiesManager;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.SwitchPreference;
import android.renderscript.Script;

import zomaru.zerotwo.wallpaperpicker.BuildConfig;
import zomaru.zerotwo.wallpaperpicker.Changelog.Whatsnew;
import zomaru.zerotwo.wallpaperpicker.R;

public class Settings extends PreferenceActivity {

    private final String THEME = "theme";
    private final String MONITOR = "monitor";
    private final String AV = "ssav";
    private final String CHANGELOG = "changelog";
    private final String ZAP = "applywp";
    public static boolean quickEnabled;
    private ListPreference themechooser;
    private Preference monitor;
    private Preference appver;
    private Preference changelog;
    private SwitchPreference quickapply;
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
                        if (Build.VERSION.SDK_INT < 24) {
                            final AlertDialog alertDialog = new AlertDialog.Builder(Settings.this).create();
                            alertDialog.setTitle(getApplicationContext().getResources().getString(R.string.warning));
                            alertDialog.setMessage(getApplicationContext().getResources().getString(R.string.theme_message) + oslevel + System.lineSeparator() + getApplicationContext().getResources().getString(R.string.theme_messages));
                            alertDialog.setCancelable(false);
                            alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK :(", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    alertDialog.dismiss();
                                }
                            });
                            alertDialog.show();
                        } else {
                            zerotwoApply();
                            listPreference.setSummary("Tema saat ini adalah: " + listPreference.getEntries()[theme]);
                            THEMEVALUE = 4;
                        }
                        break;
                    case 4:
                        if (Build.VERSION.SDK_INT < 24) {
                            final AlertDialog alertDialog = new AlertDialog.Builder(Settings.this).create();
                            alertDialog.setTitle(getApplicationContext().getResources().getString(R.string.warning));
                            alertDialog.setMessage(getApplicationContext().getResources().getString(R.string.theme_message) + oslevel + System.lineSeparator() + getApplicationContext().getResources().getString(R.string.theme_messages));
                            alertDialog.setCancelable(false);
                            alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK :(", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    alertDialog.dismiss();
                                }
                            });
                            alertDialog.show();
                        } else {
                            akameApply();
                            listPreference.setSummary("Tema saat ini adalah: " + listPreference.getEntries()[theme]);
                            THEMEVALUE = 5;
                        }
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
