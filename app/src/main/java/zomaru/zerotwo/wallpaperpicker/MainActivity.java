package zomaru.zerotwo.wallpaperpicker;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.stephentuso.welcome.WelcomeHelper;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.OkHttpClient;
import zomaru.zerotwo.wallpaperpicker.AboutApp.AboutApp;
import zomaru.zerotwo.wallpaperpicker.AboutZeroTwo.AboutHer;
import zomaru.zerotwo.wallpaperpicker.AdsAway.AdsAway;
import zomaru.zerotwo.wallpaperpicker.BugReport.BugReport;
import zomaru.zerotwo.wallpaperpicker.Extra.Extra;
import zomaru.zerotwo.wallpaperpicker.OSL.OSL;
import zomaru.zerotwo.wallpaperpicker.Splasher.Splashin;
import zomaru.zerotwo.wallpaperpicker.Trivia.Trivia;
import zomaru.zerotwo.wallpaperpicker.Util.Settings.Settings;
import zomaru.zerotwo.wallpaperpicker.WallPaperPicker.Image;
import zomaru.zerotwo.wallpaperpicker.WallPaperPicker.Picker;
import zomaru.zerotwo.wallpaperpicker.WallPaperPicker.WallPaperPicker;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private String TAG = MainActivity.class.getSimpleName();
    private WallPaperPickerAdapter adapter;
    private boolean quickReceiver;
    private WelcomeHelper wh;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.zero_two_layout)
    RecyclerView recyclerView;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawer;
    @BindView(R.id.nav_view)
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        wh = new WelcomeHelper(this, Splashin.class);
        wh.show(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        setSupportActionBar(toolbar);

        recyclerView.setLayoutManager(new android.support.v7.widget.StaggeredGridLayoutManager(2, android.support.v7.widget.StaggeredGridLayoutManager.VERTICAL));
        adapter = new WallPaperPickerAdapter(this, Image.getPhoto());
        recyclerView.setAdapter(adapter);
        WallpaperLayoutManager wallpaperLayoutManager = new WallpaperLayoutManager(16);
        recyclerView.addItemDecoration(wallpaperLayoutManager);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@NonNull View view) {
                TapTargetView.showFor(MainActivity.this, TapTarget.forView(findViewById(R.id.wallpaper_to_pick), "Sentuh gambar untuk melihat preview", "").textColor(R.color.white)
                        .targetCircleColor(R.color.red)
                        .descriptionTextColor(R.color.white)
                        .descriptionTextSize(10)
                        .targetRadius(60)
                        .titleTextSize(30)
                        .titleTextColor(R.color.white)
                        .outerCircleColor(R.color.gray)
                        .outerCircleAlpha(0.76f));
            }
        });

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(30, TimeUnit.MINUTES).writeTimeout(30, TimeUnit.MINUTES).readTimeout(30, TimeUnit.MINUTES);
        builder.followSslRedirects(true);
        builder.followRedirects(true);
        OkHttpClient client = builder.build();
        client.connectTimeoutMillis();
        client.readTimeoutMillis();
        client.authenticator();
        client.certificatePinner();
        client.proxyAuthenticator();
        client.retryOnConnectionFailure();

        checkIzin();
        quickReceiver = Settings.quickEnabled;
        if (quickReceiver) {

        } else {
            AdsAway.AdsFetcher(this);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        wh.onSaveInstanceState(outState);
        // splash screen hanya sekali saja
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast toast = Toast.makeText(this, "Izin diberikan ^^", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(this, "Izin ditolak :(", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
            break;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(MainActivity.this, Settings.class));
            return true;
        } else if
                (id == R.id.restart) {
            this.finish();
            startActivity(new Intent(this, MainActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.app_version_drw) {
            startActivity(new Intent(MainActivity.this, AboutApp.class));
        } else if (id == R.id.about_zero_two) {
            startActivity(new Intent(MainActivity.this, AboutHer.class));
        } else if (id == R.id.trivia) {
            startActivity(new Intent(MainActivity.this, Trivia.class));
        } else if (id == R.id.settings) {
            startActivity(new Intent(MainActivity.this, Settings.class));
        } else if (id == R.id.wallpaperpicker) {
            startActivity(new Intent(MainActivity.this, Picker.class));
        } else if (id == R.id.extra) {
            startActivity(new Intent(MainActivity.this, Extra.class));
        } else if (id == R.id.bug_report) {
            startActivity(new Intent(MainActivity.this, BugReport.class));
        } else if (id == R.id.github) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/RedEyedOfficial"));
            ResolveInfo resolveInfo = getPackageManager().resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY);
            String packageName = resolveInfo.activityInfo.packageName;
            startActivity(getPackageManager().getLaunchIntentForPackage(packageName));
            startActivity(intent);
        } else if (id == R.id.facebook) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://web.facebook.com/RedEyedOfficial"));
            ResolveInfo resolveInfo = getPackageManager().resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY);
            String packageName = resolveInfo.activityInfo.packageName;
            startActivity(getPackageManager().getLaunchIntentForPackage(packageName));
            startActivity(intent);
        } else if (id == R.id.osl) {
            startActivity(new Intent(MainActivity.this, OSL.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void checkIzin() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.SET_WALLPAPER) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SET_WALLPAPER}, 1);
        }
    }

    public class WallPaperPickerAdapter extends RecyclerView.Adapter<WallPaperPickerAdapter.WallpaperPickerView> {

        @Override
        public WallPaperPickerAdapter.WallpaperPickerView onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.wallpaper_content, parent, false);
            WallpaperPickerView wallPaperPickerView = new WallpaperPickerView(view);
            return wallPaperPickerView;
        }

        @Override
        public void onBindViewHolder(WallPaperPickerAdapter.WallpaperPickerView wallpaperPickerView, int position) {
            Image image = images[position];
            ImageView imageView = wallpaperPickerView.imageView;
            quickReceiver = Settings.quickEnabled;
            Glide.with(getApplicationContext()).load(image.getLink()).placeholder(R.drawable.z2light)
            .into(imageView);
        }

        @Override
        public int getItemCount() {
            return (images.length);
        }

        public class WallpaperPickerView extends RecyclerView.ViewHolder implements View.OnClickListener {
            public ImageView imageView;
            public WallpaperPickerView(View view) {
                super(view);
                imageView = (ImageView)view.findViewById(R.id.wallpaper_to_pick);
                view.setOnClickListener(this);
            }
            @Override
            public void onClick (View view) {
                int position = getAdapterPosition();
                if (position!= RecyclerView.NO_POSITION) {
                        Image image = images[position];
                        Intent intent = new Intent(context, WallPaperPicker.class);
                        intent.putExtra(WallPaperPicker.ZERO_TWO_IS_THE_BEST_GIRL, image);
                        startActivity(intent);

                }
            }
        }
        private Image[] images;
        private Context context;

        public WallPaperPickerAdapter(Context context, Image[] images) {
            this.context = context;
            this.images = images;

        }
    }
}