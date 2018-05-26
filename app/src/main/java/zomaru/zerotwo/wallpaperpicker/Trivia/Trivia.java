package zomaru.zerotwo.wallpaperpicker.Trivia;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import zomaru.zerotwo.wallpaperpicker.Helper.Animator.TextViewAnimator;
import zomaru.zerotwo.wallpaperpicker.R;
import zomaru.zerotwo.wallpaperpicker.Util.Settings.Settings;

public class Trivia extends AppCompatActivity {
    private int VALUERECEIVER;
    private TextView view;
    @BindView(R.id.trivia_text_view)
    TextView textView;

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Themerize(this);
        setContentView(R.layout.trivia);
        ButterKnife.bind(this);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.cltl);
        collapsingToolbarLayout.setTitle("Trivia");

        collapsingToolbarLayout.setExpandedTitleColor(Color.BLACK);
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.RED);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tb);
        toolbar.setTitleTextColor(Color.WHITE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                Trivia.this.finish();
            }
        });
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
