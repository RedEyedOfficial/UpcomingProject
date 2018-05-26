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

public class ManatsuNoSetsuna extends Activity {
    @BindView(R.id.ivmns)
    ImageView imageView;
    @BindView(R.id.cvmns)
    CardView cardView;
    @BindView(R.id.titlemns)
    TextView textView;
    @BindView(R.id.svmns)
    ScrollView scrollView;
    @BindView(R.id.lyricmns)
    TextView lyric;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manatsu);
        ButterKnife.bind(this);
        imageView.setImageResource(R.drawable.midsummer);
        textView.setText("Manatsu no setsuna" + "\n" +"(Midsummer moment)" + System.lineSeparator() + "Performed by: XX:me");
        lyric.setText("\n" + "==========" + "\n" + "Romaji" + "\n" + "==========" + "\n" + "\n" + "Aozora to sunahama ga\n" +
                "hazukashigaranakute mo ii yo to sasotteru\n" +
                "\n" +
                "T shatsu wo nugou to suru\n" +
                "kimi kara shisen awatete sorasu\n" +
                " \n" +
                "parasoru no shita de hiyakedome nutteru\n" +
                "kimi ga itsu mo yori otona ni miete\n" +
                "nodo ga kawaita\n" +
                "\n" +
                "Manatsu no setsuna no tokimeki kanjitetai\n" +
                "\n" +
                "namiuchigiwa hashiru kimi wo bisho nure de oikakete\n" +
                "isshun furikaetta kimi no hajikeru egao ga\n" +
                "boku wo kogashite\n" +
                "\n" +
                "atama karappo ni natte yuku yo " + "\n" + "\n" + "==========" + "\n" + "English translation" + "\n" + "==========" + "\n" + "\n" + "the blue sky and the beach\n" +
                "tempt me to not feel embarrassed\n" +
                "as I'm about to take off my T shirt,\n" +
                "I turn panicked from your gaze\n" +
                " \n" +
                "Taking sunscreen out under the parasol,\n" +
                "I thought you looked more like an adult than usual\n" +
                "My throat's dry\n" +
                " \n" +
                "I want to feel my heart pounding in a midsummer's moment\n" +
                "As you run on the waters edge, I, sopping wet, chase you\n" +
                "In an instant, when you turn and smile,\n" +
                "I freeze and my mind empties ");
    }
}
