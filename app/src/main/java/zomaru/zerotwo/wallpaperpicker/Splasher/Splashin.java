package zomaru.zerotwo.wallpaperpicker.Splasher;


import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

import zomaru.zerotwo.wallpaperpicker.R;

public class Splashin extends WelcomeActivity {
    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .page(new BasicPage(R.drawable.z2light,
                        getApplicationContext().getResources().getString(R.string.welcome),
                        getApplicationContext().getResources().getString(R.string.splash_desc))
                        .background(R.color.hiro))
                .page(new BasicPage(R.drawable.ic_open_source,
                        "Sebuah aplikasi online gallery open source yang sangat mudah untuk digunakan.", ""
                ))
                .defaultBackgroundColor(R.color.zerotwo)
                .page(new BasicPage(R.drawable.ic_theme,
                        "Didukung dengan tema interaktif dan desain User Interface yang simple nan unik namun tetap nyaman dimata.", ""))
                .defaultBackgroundColor(R.color.zerotwo)
                .page(new BasicPage(R.drawable.zerotwo, "Aplikasi ini dibuat dan dikembangkan oleh fans, dari fans, dan untuk fans Zero Two",
                        "Mari, bersama kita menjadi fans yang baik dan lindungi Eo To kita ini."))
                .swipeToDismiss(true)
                .exitAnimation(android.R.anim.fade_out)
                .build();
    }

    public static String welcomeKey() {
        return "WelcomeScreen";
    }
}