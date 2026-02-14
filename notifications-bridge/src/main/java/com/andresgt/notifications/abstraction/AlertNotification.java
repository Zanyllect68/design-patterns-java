package com.andresgt.notifications.abstraction;

import com.andresgt.notifications.platform.NotificationPlatform;

public class AlertNotification extends BaseNotification {

    public AlertNotification(NotificationPlatform platform) {
        super(platform);
    }

    @Override
    public void send(String message) {
        platform.show("ALERTA", message);
    }
}
