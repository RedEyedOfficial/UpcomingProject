package zomaru.zerotwo.wallpaperpicker.Songs.Ending;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import zomaru.zerotwo.wallpaperpicker.R;
import zomaru.zerotwo.wallpaperpicker.Util.Settings.Settings;

/**
 * Created by root on 5/22/18.
 */

public class Hitori extends Activity {

    @BindView(R.id.ivalone)
    ImageView imageView;
    @BindView(R.id.cvalone)
    CardView cardView;
    @BindView(R.id.titlealone)
    TextView textView;
    @BindView(R.id.svalone)
    ScrollView scrollView;
    @BindView(R.id.lyricalone)
    TextView lyric;
    private boolean animator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alone);
        ButterKnife.bind(this);
        animator = Settings.isAnimated;
        if (animator) {
            AnimationDrawable drawable = (AnimationDrawable) imageView.getBackground();
            drawable.setEnterFadeDuration(5000);
            drawable.setExitFadeDuration(5000);
            drawable.start();
        } else {
            imageView.setImageResource(R.drawable.page_one);
        }
        textView.setText("Hitori (Alone)" + "\n" + "Performed by: XX:me (only 002)");
        lyric.setText("\n" + "==========" + "\n" + "Romaji" + "\n" + "==========" + "\n" + "\n" + "narande tondeku tsugai no tori\n" +
                "  te o tsunaideru oyako no nobita kage\n" +
                "  yuuhi ga terashita kirei na mono\n" +
                "  sonna futsuu ga mabushikatta\n" +
                "\n" +
                "  BLUE no BENCH ga hinyari shite\n" +
                "  boku dake no kemono ni kanjita\n" +
                "\n" +
                "  futsuu ga yokute sou aritakute\n" +
                "  \"Dou sureba nareru ka na?\" hitori kangaeta\n" +
                "  sabishii nante iu hazu nakute\n" +
                "  datte hora ieru hito, kimi wa soba ni inai kara\n" +
                "\n" +
                "  dakedo boku wa kimi to aete\n" +
                "  yappari yokatta n darou\n" +
                "  hanareteite mo sunagatteiru to\n" +
                "  shinjireba aruite ikeru\n" +
                "\n" +
                "  futsuu ga yokute sou aritakute\n" +
                "  nareru you ni kyou mo mata kizudzuite mo sagasu\n" +
                "  sabishii nante iu hazu nakute\n" +
                "  datte hora ieru hito, kimi wa soba ni inai kara\n" +
                "\n" +
                "  moshi mo mata aeta nara\n" +
                "  zutto soba ni itai karaa " + "\n" + "\n" + "==========" + "\n" + "English translation" + "\n" + "==========" + "\n" + "\n" + "A pair of birds, flying away alongside each other\n" +
                "Hands connected, parent and child's extended shadow\n" +
                "The sunset's glimmer is such a beautiful thing\n" +
                "Such 'normal' things are brilliant\n" +
                "\n" +
                "The blue bench feels cool\n" +
                "Only me, a beast, felt it\n" +
                "\n" +
                "Normal is good, and I want to be one\n" +
                "\"What should I do? Is it possible?\", then I thought of one person\n" +
                "I feel lonely, yet I can't say it\n" +
                "'Cause that person for me to talk to, you are not by my side\n" +
                "\n" +
                "But the fact that I met you\n" +
                "is surely a good thing\n" +
                "When we're apart, when we're connected\n" +
                "If we believe, we can walk forward\n" +
                "\n" +
                "Normal is good, and I'm want it\n" +
                "If it's possible, today again, even if it hurts me I'll look for it\n" +
                "I'm lonely, yet I can't say it\n" +
                "'Cause that person for me to talk to, you are not by my side\n" +
                "\n" +
                "If we're to meet again\n" +
                "I want to stay by your side forever ");
    }
}
