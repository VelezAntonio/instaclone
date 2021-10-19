package com.example.instaclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("9uYZyPZQGkXrxT5pLhoO1oXA6mlQa1jQtc2Msz98")
                .clientKey("59WmRLmcTyeQsAXJYP5BArBY8xtImCmTsAjehOmq")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
