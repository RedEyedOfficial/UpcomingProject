package zomaru.zerotwo.wallpaperpicker.Helper.Animator;

import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

// helper class to animate any TextView //

public class TextViewAnimator {
    private TextView textView;

    public TextViewAnimator (TextView textView) {
        this.textView = textView;
    }
    public TextView textViewAnimation() {
        return textView;
    }
    public void setAnimation(TextView textView) {
        this.textView = textView;
        YoYo.with(Techniques.FadeIn)
                .duration(500)
                .playOn(textView);
    }
}
