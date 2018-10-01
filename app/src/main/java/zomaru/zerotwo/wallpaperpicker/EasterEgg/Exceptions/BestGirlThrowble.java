package zomaru.zerotwo.wallpaperpicker.EasterEgg.Exceptions;

/**
 * Created by root on 6/4/18.
 */

public class BestGirlThrowble extends Throwable {
    private String cause;

    public BestGirlThrowble (String cause) {
        this.cause = cause;
        getCause();
    }

}
