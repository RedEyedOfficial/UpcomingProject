package zomaru.zerotwo.wallpaperpicker.OSL;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import zomaru.zerotwo.wallpaperpicker.Helper.Animator.TextViewAnimator;
import zomaru.zerotwo.wallpaperpicker.R;
import zomaru.zerotwo.wallpaperpicker.Util.Settings.Settings;

public class Library extends AppCompatActivity {
    private int VALUERECEIVER;
    private TextView view;

    @BindView(R.id.tb_lib)
    Toolbar toolbar;
    @BindView(R.id.isi_lib)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Themerize(this);
        setContentView(R.layout.library);
        ButterKnife.bind(this);
        toolbar.setTitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView.setText(getApplicationContext().getResources().getString(R.string.used_libs) + "1. CircleImageView by hdodenhof" + System.lineSeparator() + "2. Butterknife by Jakewharton" + System.lineSeparator() + "3. Android Easing and Animations by daimajia" + System.lineSeparator() + "4. changeloglib by gabrielemariotti" + System.lineSeparator() + "5. Glide by bumptech" + System.lineSeparator() + "6. Okhttp3 by Square" + System.lineSeparator() + "7. TapTargetView by Keepsafe" + System.lineSeparator() + "8. welcome by stephentuso" + System.lineSeparator() + "9. Layanan Firebase, Firebase Database & Storage by Google");
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
