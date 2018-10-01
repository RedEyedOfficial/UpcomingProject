package zomaru.zerotwo.wallpaperpicker.EasterEgg.Exceptions;

/**
 * Created by root on 6/4/18.
 */

public class BestGirlException extends RuntimeException {
    private String message;
    private Throwable cause;

    public BestGirlException (String message, BestGirlThrowble cause) {
        this.message = message;
        this.cause = cause;
        getLocalizedMessage();
        getCause();
        printStackTrace();
    }

}
