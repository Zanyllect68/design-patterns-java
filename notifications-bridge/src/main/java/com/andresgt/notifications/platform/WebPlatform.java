package com.andresgt.notifications.platform;

public class WebPlatform implements NotificationPlatform {

    @Override
    public void show(String title, String body) {
        System.out.println("[WEB] " + title + " - " + body);
    }
}
