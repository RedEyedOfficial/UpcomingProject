package zomaru.zerotwo.wallpaperpicker.WallPaperPicker;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import zomaru.zerotwo.wallpaperpicker.R;

public class Picker extends AppCompatActivity {

    private final String link = "https://i.pinimg.com/originals/a3/62/af/a362af9fa250ba044cf11785f75fa899.jpg";
    private Context context;
    private int permissionGiven;
    @BindView(R.id.zerotwo_image)
    ImageView imageView;
    @BindView(R.id.applying)
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallpaperpicker);
        ButterKnife.bind(this);

        context = getApplicationContext();
        Glide.with(context).load(link).placeholder(R.drawable.z2light).into(imageView);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(Picker.this, Manifest.permission.SET_WALLPAPER) !=PackageManager.PERMISSION_GRANTED) {
                    permissionGiven = 2;
                    ActivityCompat.requestPermissions(Picker.this, new String[]{Manifest.permission.SET_WALLPAPER}, 1);
                    if (ContextCompat.checkSelfPermission(Picker.this, Manifest.permission.SET_WALLPAPER) != PackageManager.PERMISSION_DENIED) {
                        permissionGiven = 1;
                    }
                } else {
                    Toast toast1 = Toast.makeText(Picker.this, "Izin sudah diberikan :)", Toast.LENGTH_LONG);
                    toast1.show();
                    permissionGiven = 1;
                }

                switch (permissionGiven) {
                    case 1:
                        startActivity(new Intent(Intent.ACTION_SET_WALLPAPER));
                        break;
                    case 2:
                        Toast toast1 = Toast.makeText(Picker.this, "Izin belum diberikan :( sudahkah mengeceknya melalui pengaturan > perizinan?", Toast.LENGTH_LONG);
                        toast1.show();
                        break;
                }
            }
        });
        Snackbar.make(getWindow().getDecorView().getRootView(), getApplicationContext().getResources().getString(R.string.snackbar), Snackbar.LENGTH_LONG).setDuration(3000).show();
    }
}
