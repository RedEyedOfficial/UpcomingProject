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
 * Created by root on 5/17/18.
 */

public class Torikago extends Activity {
    @BindView(R.id.ivtkg)
    ImageView imageView;
    @BindView(R.id.cvtkg)
    CardView cardView;
    @BindView(R.id.titletkg)
    TextView textView;
    @BindView(R.id.svtkg)
    ScrollView scrollView;
    @BindView(R.id.lyrictkg)
    TextView lyric;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.torikago);
        ButterKnife.bind(this);
        imageView.setImageResource(R.drawable.torikago);
        textView.setText("Torikago" + System.lineSeparator() + "(Bird Cage)" + "\n" + "Performed by: XX:me");
        lyric.setText(System.lineSeparator() + "==========" + "\n" +"Romaji" + System.lineSeparator() + "==========" + System.lineSeparator() + "\n" +"kyoushitsu no madogoshi ni　bonyari to sora ni tou\n" +
                "nan no tame　boku wa ikite iru no?　wakannai yo\n" +
                "\n" +
                "kyoukasho no yohaku ni egaita risou no boku wa\n" +
                "otona-tachi no iinari janai\n" +
                "tobu tori no you na　jiyuu ga atte\n" +
                "\n" +
                "yume wo misetakuse ni　kinaereru chikara wo\n" +
                "ataete kurenai nante　tsuraku naru dake da yo\n" +
                "sukāto no take sae　kimerareta nagasa de\n" +
                "yaritai koto mo dekizu ni　boku wa doko ni iru no?"+ "\n"+ "\n" + "kokoro no naka　koe ga suru　\"koko ni iru\" to\n" + "\n" + System.lineSeparator() + "==========" + "\n" + "English translation" + System.lineSeparator() + "==========" + "\n"+ "\n" + "through the classroom window, I absentmindedly ask the sky\n" +
                "what's the purpose of my life? I have no idea\n" +
                "\n" +
                "things i want to know but don't think myself are all I study\n" +
                "As I realized this, I was losing my own voice\n" +
                "\n" +
                "In my textbook's margin, I wrote my ideals\n" +
                "not to do as I'm told, but to have the freedom of a soaring bird\n" +
                "\n" +
                "though I showed my dreams, my granted power and ungranted just become bitter\n" +
                "when I can't even decide the length of my skirt or do as I'd like,\n" +
                "where am I?\n" +
                "\n" +
                "the voice in my heart answered \"you're here.\"\n" +
                "The sky is beautiful, though. ");
    }
}
