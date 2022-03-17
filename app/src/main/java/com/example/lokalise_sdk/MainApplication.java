package com.example.lokalise_sdk;

import android.app.Application;

import com.lokalise.sdk.Lokalise;

public class MainApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Lokalise.init(this,
                "cb886ae9317bec920f2b517670e94a212155fc44", "314085816232058c7f1118.72784781"  );

        Lokalise.updateTranslations();


    }
}
