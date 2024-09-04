package com.example.mycustomecalender;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String eventText = intent.getStringExtra("event");

        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "default")
                .setSmallIcon(R.drawable.ic_notifications_24)
                .setContentTitle("Event Reminder")
                .setContentText(eventText)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        notificationManager.notify(0, builder.build());

    }
}
