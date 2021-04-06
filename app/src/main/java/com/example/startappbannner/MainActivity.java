package com.example.startappbannner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.adsbase.StartAppSDK;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartAppSDK.setTestAdsEnabled(true);

        Banner banner = findViewById(R.id.banner);
        banner.loadAd();
        banner.showBanner();
    }
}