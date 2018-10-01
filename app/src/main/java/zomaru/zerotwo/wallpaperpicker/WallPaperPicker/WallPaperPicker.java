package zomaru.zerotwo.wallpaperpicker.WallPaperPicker;

import android.app.DownloadManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;
import zomaru.zerotwo.wallpaperpicker.R;

/**
 * Created by root on 5/9/18.
 */

public class WallPaperPicker extends AppCompatActivity {
    public static final String ZERO_TWO_IS_THE_BEST_GIRL = "WallPaperPicker.ZERO_TWO";
    private Context context;

    @BindView(R.id.image_wp)
    ImageView imageView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_wp);
        ButterKnife.bind(this);
        context = getApplicationContext();
        Image image = getIntent().getParcelableExtra(ZERO_TWO_IS_THE_BEST_GIRL);

        Glide.with(this).load(image.getLink()).asBitmap().error(R.drawable.ic_bug_report).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
        if (ContextCompat.checkSelfPermission(WallPaperPicker.this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(WallPaperPicker.this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.preview_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.save_image) {
                donwloadThis();
            Toast toast = Toast.makeText(context, "Gambar akan disimpan di penyimpanan internal pada folder pictures ya darling?", Toast.LENGTH_LONG);
            toast.show();
        }return super.onOptionsItemSelected(item);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast toast = Toast.makeText(WallPaperPicker.this, "Izin diberikan ^^", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(WallPaperPicker.this, "Izin ditolak :(", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        }
    }

    private  void donwloadThis() {
        Image image = getIntent().getParcelableExtra(ZERO_TWO_IS_THE_BEST_GIRL);
        String link = image.getLink();
        String name = image.getName();
        File imageOnSD = new File(Environment.getExternalStorageDirectory()+ "/Zero Two Wallpaper");
        File imageOnInternal = new File(Environment.DIRECTORY_PICTURES);
        boolean mkdir = imageOnSD.exists() & imageOnInternal.exists();
        if (!mkdir) {
            imageOnSD.mkdirs();
            imageOnInternal.mkdirs();
        }
        DownloadManager manager = (DownloadManager)getApplication().getSystemService(Context.DOWNLOAD_SERVICE);
        Uri download = Uri.parse(link);
        DownloadManager.Request request = new DownloadManager.Request(download);
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE | DownloadManager.Request.NETWORK_WIFI)
                .setAllowedOverRoaming(false)
                .setTitle("Downloading..")
                .setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, name)
                .setDescription("Sabar ya darling.. lagi download nih..");
        manager.enqueue(request);
    }
}
