package com.andresgt.notifications.platform;

public class DesktopPlatform implements NotificationPlatform {

    @Override
    public void show(String title, String body) {
        System.out.println("[ESCRITORIO] " + title + " - " + body);
    }
}
