package com.andresgt.notifications.platform;

public class MobilePlatform implements NotificationPlatform {

    @Override
    public void show(String title, String body) {
        System.out.println("[MÓVIL] " + title + " - " + body);
    }
}
