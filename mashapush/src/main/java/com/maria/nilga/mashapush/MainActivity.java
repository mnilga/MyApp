package com.maria.nilga.mashapush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import me.leolin.shortcutbadger.ShortcutBadger;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_CAMERA = 142;
    File photoFile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get token
        String token = FirebaseInstanceId.getInstance().getToken();

        Log.d("myLogs", token);

        Button butRemove = (Button)findViewById(R.id.butRemove);
        butRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("myLogs", "onClick");



                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            // Delete token.
                            FirebaseInstanceId.getInstance().deleteInstanceId();
                            String token = FirebaseInstanceId.getInstance().getToken();
                            Log.d("myLogs", "deleteInstanceId");

                        } catch (IOException e) {
                            e.printStackTrace();
                            Log.e("myLogs", "deleteInstanceId error: " + e);
                        }
                    }
                }).start();


            }
        });


        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        String avatarUrl = "https://dev-mdt-coach.wellnesslayers.com/Content/Images/defaultCoachAvatar.png";

        if (avatarUrl != null) {
            Picasso.with(this).load(avatarUrl)
                    .into(imageView, new Callback() {
                        @Override
                        public void onSuccess() {
                            Log.d("myLogs", "onSuccess");
                        }

                        @Override
                        public void onError() {
                            Log.e("myLogs", "onError ");
                        }
                    });
        } else {
//            imageView.setImageResource(R.drawable.thumbnail);
        }


    }


}
