package com.maria.nilga.mashapush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;


public class NotificationBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

           /* Log.d("myLogs", "NotificationBroadcastReceiver onReceive(): ");

            Log.d("myLogs", "NotificationBroadcastReceiver onReceive() condition: " + GCMIntentService.isAppOnForeground(context));


        if (intent.getAction().equalsIgnoreCase(Constants.PUSH_MESSAGE_ACTION)) {
            String data = intent.getStringExtra(Constants.PUSH_MESSAGE_KEY);
            if (data != null && !TextUtils.isEmpty(data)) {
//				callNavigation(message);
//				Toast.makeText(context, data, Toast.LENGTH_LONG).show();
                Log.d("Notif", "NotificationBroadcastReceiver DATA: " + data);
            }

            String msg = intent.getStringExtra("msg");
            if (msg != null && !TextUtils.isEmpty(msg)) {
//				callNavigation(message);
//				Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
                Log.d("Notif", "NotificationBroadcastReceiver MSG: " + msg);
            }

            if (BaseActivity.appIsRunning) {
                //msg
                Toast.makeText(context, msg, Toast.LENGTH_LONG).show();

                Intent notificationIntent = new Intent(context, BaseTabNavigationActivity.class);
                notificationIntent.putExtra("PUSH_MESSAGE_KEY", data);
                notificationIntent.putExtra("PUSH_MESSAGE_DATA_KEY", msg);
                notificationIntent.putExtra("PUSH_FOREGROUND_KEY", BaseActivity.appIsRunning);
                notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(notificationIntent);
            } else {
                //data
                Intent notificationIntent = new Intent(context, BaseTabNavigationActivity.class);
                notificationIntent.putExtra("PUSH_MESSAGE_KEY", data);
                notificationIntent.putExtra("PUSH_MESSAGE_DATA_KEY', msg);
                notificationIntent.putExtra("PUSH_FOREGROUND_KEY", BaseActivity.appIsRunning);
                notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(notificationIntent);
            }
        }*/

    }

}
