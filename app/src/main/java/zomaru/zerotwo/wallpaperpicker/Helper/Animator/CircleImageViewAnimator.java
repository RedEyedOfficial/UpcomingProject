package zomaru.zerotwo.wallpaperpicker.Helper.Animator;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import de.hdodenhof.circleimageview.CircleImageView;

// helper class for applying animation onto any CircleImageView //

public class CircleImageViewAnimator {
    private CircleImageView circleImageView;

    public CircleImageViewAnimator (CircleImageView circleImageView) {
        this.circleImageView = circleImageView;
    }
    public CircleImageView circleImageViewAnimator () {
        return circleImageView;
    }
    public void setAnimation(CircleImageView circleImageView) {
        this.circleImageView = circleImageView;
        YoYo.with(Techniques.Landing)
                .duration(500)
                .playOn(circleImageView);
    }
}
