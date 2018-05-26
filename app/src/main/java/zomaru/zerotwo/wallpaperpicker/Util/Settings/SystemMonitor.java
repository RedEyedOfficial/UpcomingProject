package zomaru.zerotwo.wallpaperpicker.Util.Settings;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import butterknife.BindView;
import butterknife.ButterKnife;
import zomaru.zerotwo.wallpaperpicker.Helper.Animator.TextViewAnimator;
import zomaru.zerotwo.wallpaperpicker.R;

public class SystemMonitor extends AppCompatActivity {
    private TextView view;
    @BindView(R.id.tb_system)
    Toolbar toolbar;
    @BindView(R.id.isi_system)
    TextView textView;
    private String oslevel;
    private int VALUERECEIVER;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Themerize(this);
        setContentView(R.layout.system_monitor);
        ButterKnife.bind(this);
        toolbar.setTitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
        textView.setText(getApplicationContext().getResources().getString(R.string.device) + Build.DEVICE + "" + "/" + Build.MODEL + System.lineSeparator() + getApplicationContext().getResources().getString(R.string.android) + oslevel + System.lineSeparator() + getApplicationContext().getResources().getString(R.string.sdk) + Build.VERSION.SDK_INT + System.lineSeparator() + getApplicationContext().getResources().getString(R.string.build_host) + Build.HOST + System.lineSeparator() + getApplicationContext().getResources().getString(R.string.modem_version) + Build.getRadioVersion() + System.lineSeparator() + getApplicationContext().getResources().getString(R.string.device_board) + Build.BOARD + System.lineSeparator() + getApplicationContext().getResources().getString(R.string.rom_type) + Build.TYPE + System.lineSeparator() + getApplicationContext().getResources().getString(R.string.bootloader) + Build.BOOTLOADER + System.lineSeparator() + getApplicationContext().getResources().getString(R.string.hardware) + Build.HARDWARE + System.lineSeparator() + getApplicationContext().getResources().getString(R.string.kernel) + System.getProperty("os.version"));
        TextViewAnimator animator = new TextViewAnimator(view);
        animator.setAnimation(textView);
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
