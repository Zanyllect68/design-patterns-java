package com.andresgt.notifications.abstraction;

import com.andresgt.notifications.platform.NotificationPlatform;

public class ConfirmationNotification extends BaseNotification {

    public ConfirmationNotification(NotificationPlatform platform) {
        super(platform);
    }

    @Override
    public void send(String message) {
        platform.show("CONFIRMACIÓN", message);
    }
}
