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

public class BeautifulWorld extends Activity {
    @BindView(R.id.ivbw)
    ImageView imageView;
    @BindView(R.id.cvbw)
    CardView cardView;
    @BindView(R.id.titlebw)
    TextView textView;
    @BindView(R.id.svbw)
    ScrollView scrollView;
    @BindView(R.id.lyricbw)
    TextView lyric;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beautiful_world);
        ButterKnife.bind(this);

        imageView.setImageResource(R.drawable.beautiful);
        textView.setText("Beautiful World" + "\n" + "Performed by: XX:me");
        lyric.setText(System.lineSeparator() + "==========" + "\n" +"Romaji" + System.lineSeparator() + "==========" + System.lineSeparator() + "\n" + "doushite kimi bakari mitsumete shimaun darou\n" +
                "taikutsu na kyoushitsu ni kimi ga irodori wo kureteru\n" +
                "neguse nokoru kami mo kawaiku omotte shimau\n" +
                "terete hanasenakute mado wo ake kaze wo uke\n" +
                "mune ippai ni iki wo suikon da\n" +
                "\n" +
                "aozora ga sawaresou na hodo azayaka ni miete\n" +
                "ureshikute setsunakute kore ga koi nan da\n" +
                "kimi ga tada boku no namae wo nee, koe ni suru dake de\n" +
                "jiyuu ni nareru ki ga shitan da "+ "\n" + System.lineSeparator() + "==========" + "\n" + "English translation" + System.lineSeparator() + "==========" + "\n"+ "\n" + "I wonder why I keep staring at you.\n" +
                "In a boring classroom, you make things more interesting.\n" +
                "You think that bed head is pretty too.\n" +
                "Without being able to speak out of shyness, I open the window and receive the wind,\n" +
                "I took a deep breath.\n" +
                "I see that the blue sky seems bright enough to be touched.\n" +
                "\n" +
                "It makes you happy, it makes you sad... that's how love is.\n" +
                "You know, my name... you just have to say it\n" +
                "to make me feel free.");
    }
}
