package zomaru.zerotwo.wallpaperpicker.OSL;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import zomaru.zerotwo.wallpaperpicker.R;
import zomaru.zerotwo.wallpaperpicker.Util.Settings.Settings;

public class OpenSource extends AppCompatActivity {
    private int VALUERECEIVER;

    @BindView(R.id.tb_open)
    Toolbar toolbar;
    @BindView(R.id.isi_open)
    TextView textView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Themerize(this);
        setContentView(R.layout.open_source);
        ButterKnife.bind(this);
        toolbar.setTitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView.setText(getApplicationContext().getResources().getString(R.string.license_warning) +System.lineSeparator() + System.lineSeparator() + "-- Zomaru Two Wallpaper App --" + System.lineSeparator() + System.lineSeparator() +
                " * © 2018 Red Eyed Official" +System.lineSeparator() +
                " *" +System.lineSeparator() +
                " * Licensed under the Apache License, Version 2.0 (the License); you may not" +System.lineSeparator() +
                " * use this file except in compliance with the License. You may obtain a copy of" +System.lineSeparator() +
                " * the License at" +System.lineSeparator() +
                " *" +System.lineSeparator() +
                " * http://www.apache.org/licenses/LICENSE-2.0" +System.lineSeparator() +
                " *" +System.lineSeparator() +
                " * Unless required by applicable law or agreed to in writing, software" +System.lineSeparator() +
                " * distributed under the License is distributed on an AS IS BASIS, WITHOUT" +System.lineSeparator() +
                " * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the" +System.lineSeparator() +
                " * License for the specific language governing permissions and limitations under" +System.lineSeparator() +
                " * the License." +
                " *" + System.lineSeparator() + System.lineSeparator() + "-- Darling in the Franxx icon --" + System.lineSeparator() + System.lineSeparator() + "Copyright © Darling in the Franxx");
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
