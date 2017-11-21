package com.maria.nilga.mashapush;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Config;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by User on 11/28/2016.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("myLogs", "Refreshed token: " + refreshedToken);
        // Saving reg id to shared preferences
//        sendRegistrationToServerreRegIdInPref(refreshedToken);

        // sending reg id to your server
//        sendRegistrationToServer(refreshedToken);


        // Notify UI that registration has completed, so the progress indicator can be hidden.
       /* Intent registrationComplete = new Intent(Config.REGISTRATION_COMPLETE);
        registrationComplete.putExtra("token", refreshedToken);
        LocalBroadcastManager.getInstance(this).sendBroadcast(registrationComplete);*/


    }


}
