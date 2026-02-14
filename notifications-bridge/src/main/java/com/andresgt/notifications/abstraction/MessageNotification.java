package com.andresgt.notifications.abstraction;

import com.andresgt.notifications.platform.NotificationPlatform;

public class MessageNotification extends BaseNotification {

    public MessageNotification(NotificationPlatform platform) {
        super(platform);
    }

    @Override
    public void send(String message) {
        platform.show("Mensaje", message);
    }
}
