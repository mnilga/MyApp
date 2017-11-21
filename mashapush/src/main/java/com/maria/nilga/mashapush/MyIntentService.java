package com.maria.nilga.mashapush;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import me.leolin.shortcutbadger.ShortcutBadger;


public class MyIntentService extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     */
    public MyIntentService() {
        super("my");
    }

    public void onCreate() {
        super.onCreate();

        Log.d("myLogs", "onCreate MyIntentService");
        ShortcutBadger.applyCount(getApplicationContext(), 10);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
