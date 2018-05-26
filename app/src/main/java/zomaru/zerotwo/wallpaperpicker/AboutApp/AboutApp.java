package zomaru.zerotwo.wallpaperpicker.AboutApp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;
import zomaru.zerotwo.wallpaperpicker.BuildConfig;
import zomaru.zerotwo.wallpaperpicker.Helper.Animator.CircleImageViewAnimator;
import zomaru.zerotwo.wallpaperpicker.Helper.Animator.TextViewAnimator;
import zomaru.zerotwo.wallpaperpicker.R;
import zomaru.zerotwo.wallpaperpicker.Util.Settings.Settings;

public class AboutApp extends Activity {

    private CircleImageView view;
    private TextView v;

    @BindView(R.id.aalogo)
    CircleImageView circleImageView;
    @BindView(R.id.aaappid)
    TextView textView;
    @BindView(R.id.contributors)
    TextView contributor;
    @BindView(R.id.developer_avatar)
    CircleImageView dev_ava;
    @BindView(R.id.dev_name)
    TextView dev_name;
    @BindView(R.id.crew_avatar)
    ImageView crew_ava;
    @BindView(R.id.crew_name)
    TextView crew_name;
    @BindView(R.id.dev_desc)
    TextView devdesc;
    @BindView(R.id.crew_desc)
    TextView crewdesc;
    private int VALUERECEIVER;
    private final String axel = "https://i.pinimg.com/originals/32/da/88/32da883e3e355aab1ef83c8664cc2e78.jpg";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Themerize(this);
        setContentView(R.layout.about_app);
        ButterKnife.bind(this);
        circleImageView.setBorderColor(Color.CYAN);
        circleImageView.setImageResource(R.drawable.z2light);

        textView.setText("Zero Two Wallpaper" + System.lineSeparator() + "Versi Aplikasi: " + BuildConfig.VERSION_NAME + System.lineSeparator() + "Copyright © 2018 Red Eyed Official" + System.lineSeparator() + "All rights reserved.");

        contributor.setText(getApplicationContext().getResources().getString(R.string.contributors));
        dev_ava.setBorderColor(Color.CYAN);
        dev_ava.setImageResource(R.drawable.zerotwo);
        dev_name.setText(getApplicationContext().getResources().getString(R.string.developer_name));
        devdesc.setText(getApplicationContext().getResources().getString(R.string.developer));
        Glide.with(this).load(axel).into(crew_ava);
        crew_name.setText(getApplicationContext().getResources().getString(R.string.crew));
        crewdesc.setText(getApplicationContext().getResources().getString(R.string.cooperating_crew));
        CircleImageViewAnimator animator = new CircleImageViewAnimator(view);
        animator.setAnimation(circleImageView);
        animator.setAnimation(dev_ava);
        TextViewAnimator viewAnimator = new TextViewAnimator(v);
        viewAnimator.setAnimation(textView);
        viewAnimator.setAnimation(dev_name);
        viewAnimator.setAnimation(devdesc);
        viewAnimator.setAnimation(contributor);
        viewAnimator.setAnimation(crew_name);
        viewAnimator.setAnimation(crewdesc);
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
