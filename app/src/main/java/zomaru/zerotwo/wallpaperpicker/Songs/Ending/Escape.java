package zomaru.zerotwo.wallpaperpicker.Songs.Ending;

import android.app.Activity;
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

public class Escape extends Activity {
    @BindView(R.id.ivesc)
    ImageView imageView;
    @BindView(R.id.cvesc)
    CardView cardView;
    @BindView(R.id.titlesc)
    TextView textView;
    @BindView(R.id.svesc)
    ScrollView scrollView;
    @BindView(R.id.lyricesc)
    TextView lyric;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.escape);
        ButterKnife.bind(this);

        imageView.setImageResource(R.drawable.zerotwo);
        textView.setText("Escape" + "\n" + "Performed by: XX:me");
        lyric.setText("\n" + "==========" + "\n" + "Romaji" + "\n" + "==========" + "\n" + "\n" + "yohō o hazure no ame ga boku-ra o nurashite\n" +
                "furueteru kimi ni nanimo hanashitara ī no\n" +
                "\n" +
                "bishonure no burezā tsumetaku te omotaku te\n" +
                "kago o deta hinadori no muryoku-sa o kanjiteru\n" +
                "\n" +
                "saware sō datta yume wa buatsu kumo no mukō de\n" +
                "mune ni hirogaru amai itami dake kamishimeta\n" +
                "boku to kimi wa deawanai hō ga yokatta ka na\n" +
                "nee hoshi sae mienai yo\n" +
                "nee namida mo dete konai ");
    }
}
