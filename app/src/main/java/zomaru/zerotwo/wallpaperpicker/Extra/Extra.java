package zomaru.zerotwo.wallpaperpicker.Extra;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;

import zomaru.zerotwo.wallpaperpicker.Fms.FanMadeStoryByZomaru;
import zomaru.zerotwo.wallpaperpicker.R;
import zomaru.zerotwo.wallpaperpicker.Songs.Ending.BeautifulWorld;
import zomaru.zerotwo.wallpaperpicker.Songs.Ending.Escape;
import zomaru.zerotwo.wallpaperpicker.Songs.Ending.Hitori;
import zomaru.zerotwo.wallpaperpicker.Songs.Ending.ManatsuNoSetsuna;
import zomaru.zerotwo.wallpaperpicker.Songs.Ending.Torikago;
import zomaru.zerotwo.wallpaperpicker.Songs.OST.VanquishMyFear;
import zomaru.zerotwo.wallpaperpicker.Songs.Opening.KissOfDeath;

public class Extra extends PreferenceActivity {
    private PreferenceScreen extra;
    private PreferenceScreen opening;
    private PreferenceScreen ending;
    private PreferenceScreen ost;
    private Preference story;
    private Preference op1;
    private Preference ed1;
    private Preference ed2;
    private Preference ed3;
    private Preference ed4;
    private Preference ed5;
    private Preference ost1;
    private final String EXTRA = "extra_song";
    private final String OPENING = "opening";
    private final String ENDING = "ending";
    private final String OST = "ost";
    private final String KISS = "kiss";
    private final String TORIKAGO = "torikago";
    private final String MANATSU = "manatsu";
    private final String BEAUTIFUL = "beautiful";
    private final String HITORI = "hitori";
    private final String ESCAPE = "escape";
    private final String VANQUISH = "vanquish";
    private final String STORY = "fanmadestory";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.extras);

        extra = (PreferenceScreen)findPreference(EXTRA);
        extra.setIcon(R.drawable.ic_extra);

        story = (Preference)findPreference(STORY);
        story.setIcon(R.drawable.ic_story);
        story.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(Extra.this, FanMadeStoryByZomaru.class));
                return true;
            }
        });

        opening = (PreferenceScreen)findPreference(OPENING);
        opening.setIcon(R.drawable.ic_song);

        ending = (PreferenceScreen)findPreference(ENDING);
        ending.setIcon(R.drawable.ic_song);

        ost = (PreferenceScreen)findPreference(OST);
        ost.setIcon(R.drawable.ic_song);

        op1 = (Preference)findPreference(KISS);
        op1.setIcon(R.drawable.ic_song);
        op1.setTitle("Kiss Of Death");
        op1.setSummary(getApplicationContext().getResources().getString(R.string.song_click));
        op1.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(Extra.this, KissOfDeath.class));
                return true;
            }
        });

        ed1 = (Preference)findPreference(TORIKAGO);
        ed1.setIcon(R.drawable.ic_song);
        ed1.setTitle("Torikago (Bird Cage)");
        ed1.setSummary(getApplicationContext().getResources().getString(R.string.song_click));
        ed1.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(Extra.this, Torikago.class));
                return true;
            }
        });

        ed2 = (Preference)findPreference(MANATSU);
        ed2.setTitle("Manatsu no Setsuna");
        ed2.setIcon(R.drawable.ic_song);
        ed2.setSummary(getApplicationContext().getResources().getString(R.string.song_click));
        ed2.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(Extra.this, ManatsuNoSetsuna.class));
                return true;
            }
        });

        ed3 = (Preference)findPreference(BEAUTIFUL);
        ed3.setTitle("Beautiful World");
        ed3.setIcon(R.drawable.ic_song);
        ed3.setSummary(getApplicationContext().getResources().getString(R.string.song_click));
        ed3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(Extra.this, BeautifulWorld.class));
                return true;
            }
        });

        ed4 = (Preference)findPreference(HITORI);
        ed4.setTitle("Hitori (Alone)");
        ed4.setIcon(R.drawable.ic_song);
        ed4.setSummary(getApplicationContext().getResources().getString(R.string.song_click));
        ed4.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(Extra.this, Hitori.class));
                return true;
            }
        });

        ed5 = (Preference)findPreference(ESCAPE);
        ed5.setIcon(R.drawable.ic_song);
        ed5.setTitle("Escape");
        ed5.setSummary(getApplicationContext().getResources().getString(R.string.song_click));
        ed5.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(Extra.this, Escape.class));
                return true;
            }
        });

        ost1 = (Preference)findPreference(VANQUISH);
        ost1.setIcon(R.drawable.ic_song);
        ost1.setTitle("Vanquish");
        ost1.setSummary(getApplicationContext().getResources().getString(R.string.song_click));
        ost1.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            @Override
            public boolean onPreferenceClick(Preference preference) {
                startActivity(new Intent(Extra.this, VanquishMyFear.class));
                return true;
            }
        });

    }
}
