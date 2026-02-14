package com.andresgt.notifications.abstraction;

import com.andresgt.notifications.platform.NotificationPlatform;

public class WarningNotification extends BaseNotification {

    public WarningNotification(NotificationPlatform platform) {
        super(platform);
    }

    @Override
    public void send(String message) {
        platform.show("ADVERTENCIA", message);
    }
}
