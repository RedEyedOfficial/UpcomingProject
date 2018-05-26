package zomaru.zerotwo.wallpaperpicker.Songs.Opening;

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
 * Created by root on 5/16/18.
 */

public class KissOfDeath extends Activity {
    @BindView(R.id.ivkod)
    ImageView imageView;
    @BindView(R.id.cvkod)
    CardView cardView;
    @BindView(R.id.titlekod)
    TextView textView;
    @BindView(R.id.svkod)
    ScrollView scrollView;
    @BindView(R.id.lyrickod)
    TextView lyric;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kod);
        ButterKnife.bind(this);
        imageView.setImageResource(R.drawable.kiss_of_death);
        textView.setText("Kiss of Death" + System.lineSeparator() + "Performed by: Mika Nakashima & HYDE" + System.lineSeparator());
        lyric.setText(System.lineSeparator() + "==========" + "\n" + "Romaji" + "\n" + "==========" + System.lineSeparator() + "\n" +
                "Soba ni kite kuzure iku yokusei\n" +
                "boku wo kowagaranaide Ah\n" +
                "tobenai tori ga yume mita sora\n" +
                "majiwatte koi Love, sore wa chigau Red\n" + "\n" +
                "doa wo tataku oto ni boku wa mimi wo seida\n" +
                "tataiteru no wa kimi sore to mo hoka no…\n" +
                "\n" +
                "Will you leave just a KISS OF DEATH?\n" +
                "\n" +
                "Darling unmei ga kekkan wo hashiru yo\n" +
                "ugoki hajimeta sekai…　ai\n" +
                "dare yori mo tokeaitai yo Darling\n" +
                "boku wo kowagaranaide, Kiss me now\n" +
                "\n" +
                "kimi eo ajiwaitai sonna boku wa hen\n" +
                "hitori ja sore wa kanjirarenai\n" +
                "dakushime au no wa kizu wo fusagu kara\n" +
                "boku no kuchibiru de sono iki wo fusagu\n" +
                "\n" +
                "Will you leave just a KISS OF DEATH?\n" +
                "\n" +
                "Darling kodou ga yubi no saki de\n" +
                "tokedasu kimochi wa nani?　Nee\n" +
                "Soba ni kite kuzure iku yokusei\n" +
                "boku wo kowagaranaide Kiss me now My Love!\n" +
                "\n" +
                "ushinai iku toki to nita kankaku to kimi no aji ga shita\n" +
                "Did you leave me the KISS OF DEATH?\n" +
                "\n" +
                "Darling unmei ga kekkan wo hashiru yo\n" +
                "ugoki hajimeta sekai... ai\n" +
                "dare yori mo tokeaitai yo Darling\n" +
                "boku wo kowagaranaide\n" +
                "kimi wo ajiwasete And kiss me now!" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "==========" + "\n" +  "English Translation" + System.lineSeparator() + "==========" +
                "\n" + "\n" +
                "Come over here beside me. My restraint crumbles.\n" +
                "Don’t fear me.\n" +
                "\n" +
                "A flightless bird dreamed of the sky.\n" +
                "The color mixing there is a different kind of red.\n" +
                "\n" +
                "I covered my ears to the sound of knocking on my door.\n" +
                "Is that you knocking? Or is it some other?\n" +
                "Will your lips taste the kiss of death?\n" +
                "\n" +
                "Darling, fate runs through my veins\n" +
                "As this world begins to move …is it love?\n" +
                "I want to melt like no one has before, Darling.\n" +
                "So don’t fear me, just kiss me now!\n" +
                "\n" +
                "I want to taste you …does that make me weird?\n" +
                "It’s something we’re unable to feel all alone.\n" +
                "\n" +
                "Embracing one another will keep our wounds sealed,\n" +
                "So I’ll seal your breath with my lips.\n" +
                "Will your lips taste the kiss of death?\n" +
                "\n" +
                "Darling, what is this melting feeling I feel\n" +
                "From the beating of my heart to the tips of my fingers? Hey…\n" +
                "Come over here beside me. My restraint crumbles.\n" +
                "So don’t fear me, just kiss me now, my love!\n" +
                "\n" +
                "I felt something like the moment of death\n" +
                "With your taste.\n" +
                "Did your lips taste the kiss of death?\n" +
                "\n" +
                "Darling, fate runs through my veins\n" +
                "As this world begins to move …is it love?\n" +
                "I want to melt like no one has before, Darling.\n" +
                "So don’t fear me, just kiss me now!\n");
    }
}
