package com.example.parstagram;

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
                .applicationId("34eBrV279WLVMBSRpyV3rVtGgOiUXC9zY48VWdmb")
                .clientKey("hJXQdnoQuVMZfZHIQ17HFSkj1hIHbwU8WUh5bz81")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
