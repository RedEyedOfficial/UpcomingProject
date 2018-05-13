package zomaru.zerotwo.wallpaperpicker.WallPaperPicker;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interceptors.HttpLoggingInterceptor;
import com.androidnetworking.interfaces.DownloadListener;
import com.androidnetworking.interfaces.DownloadProgressListener;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.nostra13.universalimageloader.utils.StorageUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import zomaru.zerotwo.wallpaperpicker.R;

/**
 * Created by root on 5/9/18.
 */

public class WallPaperPicker extends AppCompatActivity {
    public static final String ZERO_TWO_IS_THE_BEST_GIRL = "WallPaperPicker.ZERO_TWO";
    private static final String DIREKTORI = "/ZeroTwoWallpaper/";
    private final String filename = "Zero Two.jpg";
    private Context context;
    private int width;
    private int height;

    @BindView(R.id.image_wp)
    ImageView imageView;
    @BindView(R.id.download_process)
    ProgressBar progressBar;
    @BindView(R.id.download_procentage)
    TextView textView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_wp);
        ButterKnife.bind(this);
        context = getApplicationContext();
        OkHttpClient okHttpClient = new OkHttpClient() .newBuilder()
                .addNetworkInterceptor(new HttpLoggingInterceptor())
                .build();
        AndroidNetworking.initialize(context,okHttpClient);
        Point size = new Point();
        this.getWindowManager().getDefaultDisplay().getRealSize(size);
        width = size.x;
        height = size.y;
        File cacheDir = StorageUtils.getCacheDirectory(context);
        Image image = getIntent().getParcelableExtra(ZERO_TWO_IS_THE_BEST_GIRL);

        Glide.with(this).load(image.getLink()).asBitmap().error(R.drawable.ic_bug_report).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
        if (ContextCompat.checkSelfPermission(WallPaperPicker.this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(WallPaperPicker.this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.preview_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.save_image) {
            try {
                imageView = (ImageView) findViewById(R.id.image_wp);
                Image image = getIntent().getParcelableExtra(ZERO_TWO_IS_THE_BEST_GIRL);
                final String string = image.getLink();
                final String namafile = image.getName();
                File folder = new File(context.getFilesDir() + File.separator + "/Zero Two Wallpaper/");
                boolean success = true;
                if (!folder.exists()) {
                    success = folder.mkdirs();
                }
                if (success) {
                    Toast toast = Toast.makeText(WallPaperPicker.this, "folder baru dibuat", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(WallPaperPicker.this, "folder baru tidak dibuat", Toast.LENGTH_SHORT);
                    toast.show();
                }
                final File gambar = File.createTempFile("Zero Two", ".jpg");
                File file = new File(folder, namafile);
                final FileOutputStream outputStream = new FileOutputStream(file);

                AndroidNetworking.download(string, context.getFilesDir().getAbsolutePath(), namafile).setTag("Download").setPriority(Priority.HIGH).build().setDownloadProgressListener(new DownloadProgressListener() {
                    private int prosentase;

                    @Override
                    public void onProgress(long bytesDownloaded, long totalBytes) {
                        final int progress = (int) (bytesDownloaded * 100 / totalBytes);
                        if (progress != prosentase) {
                            try {
                                Toast toast = Toast.makeText(WallPaperPicker.this, getApplicationContext().getResources().getString(R.string.downloading), Toast.LENGTH_LONG);
                                toast.show();
                                progressBar.setProgress(progress);
                                textView.setText("Mendownload.." + progress + " %");
                                outputStream.write(namafile.getBytes());
                                outputStream.flush();
                                outputStream.close();
                                prosentase = progress;
                            } catch (IOException a) {
                                a.printStackTrace();
                            }
                        }

                    }
                }).startDownload(new DownloadListener() {
                    @Override
                    public void onDownloadComplete() {
                        progressBar.setProgress(100);
                        Toast toast = Toast.makeText(WallPaperPicker.this, getApplicationContext().getResources().getString(R.string.download_finish), Toast.LENGTH_LONG);
                        toast.show();
                    }

                    @Override
                    public void onError(ANError anError) {
                        progressBar.setVisibility(View.GONE);
                        progressBar.setProgress(0);
                        Toast toast = Toast.makeText(WallPaperPicker.this, getApplicationContext().getResources().getString(R.string.download_error), Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
                progressBar.setProgress(0);
                progressBar.setVisibility(View.VISIBLE);
            } catch (IOException a) {
                a.printStackTrace();
            }
        }   return super.onOptionsItemSelected(item);
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
}
