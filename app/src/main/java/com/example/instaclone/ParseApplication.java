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
            .applicationId("v1dQBTjU1pls5v6iqPdG2F1p7wWxeAgCjd8Uozsk")
            .clientKey("ULyMAc0ggtbZVY6ZRRAqoHFBPE4L2MOHSSw1GjJX")
            .server("https://parseapi.back4app.com")
            .build()
    );
    }
}
