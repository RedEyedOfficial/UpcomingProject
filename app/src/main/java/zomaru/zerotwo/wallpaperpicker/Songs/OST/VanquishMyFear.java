package zomaru.zerotwo.wallpaperpicker.Songs.OST;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import zomaru.zerotwo.wallpaperpicker.R;

/**
 * Created by root on 5/22/18.
 */

public class VanquishMyFear extends Activity {
    @BindView(R.id.ivanquish)
    ImageView imageView;
    @BindView(R.id.cvanquish)
    CardView cardView;
    @BindView(R.id.titlevanquish)
    TextView textView;
    @BindView(R.id.svanquish)
    ScrollView scrollView;
    @BindView(R.id.lyricvanquish)
    TextView lyric;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vanquish);
        ButterKnife.bind(this);
        Resources resources = getApplicationContext().getResources();
        TransitionDrawable drawable = (TransitionDrawable)resources.getDrawable(R.drawable.bopf);
        drawable.setCrossFadeEnabled(true);
        imageView.setImageDrawable(drawable);
        drawable.startTransition(4000);

        textView.setText("Vanquish" + "\n" + "Performed by: Monique Dehaney (Artis)" + "\n" + "Asami Tachibana (Aransemen)");
        lyric.setText("Mother used to say\n" +
                "\"You are so special.\n" +
                "No one will shine as bright my dear\".\n" +
                "Will i tire of slaying endless beasts that hunts them?\n" +
                "Will the killing rid me of these horns that disgust them?\n" +
                "Little demon in the forest all alone\n" +
                "You where there\n" +
                "Now I remember!\n" +
                "Yes! You where there!\n" +
                "Come with me now\n" +
                "So ride on my DARLING!\n" +
                "Here comes the sun\n" +
                "It won't shine on us forever\n" +
                "You touched my heart\n" +
                "So ride on my DARLING!\n" +
                "We can win the fight and\n" +
                "Vanquish my fear ");
    }
}
