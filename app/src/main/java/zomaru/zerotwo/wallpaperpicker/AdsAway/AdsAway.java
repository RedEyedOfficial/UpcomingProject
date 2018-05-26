package zomaru.zerotwo.wallpaperpicker.AdsAway;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;

import zomaru.zerotwo.wallpaperpicker.Helper.BokuNoDarling;
import zomaru.zerotwo.wallpaperpicker.Util.Settings.Settings;

public class AdsAway {
    private static String tipehp;
    public static void AdsFetcher (final Activity activity) {
        tipehp = Build.DEVICE;
        final android.support.v7.app.AlertDialog alertDialog = new android.support.v7.app.AlertDialog.Builder(activity).create();
        alertDialog.setTitle("Hp sampah teredeteksi !!!");
        alertDialog.setMessage(tipehp + "/" + Build.MODEL + " " + "Anda sepertinya jelek seperti muka anda :<");
        alertDialog.setCancelable(false);
        alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Shut Up!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int which) {
                alertDialog.cancel();
                boolean receiver = Settings.diam;
                if (receiver) {
                } else {
                    BokuNoDarling bokuNoDarling = new BokuNoDarling(activity);
                    bokuNoDarling.setDarling(activity);
                }
            }
        });
        alertDialog.show();

    }
}
