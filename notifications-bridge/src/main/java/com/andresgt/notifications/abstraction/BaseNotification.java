package com.andresgt.notifications.abstraction;

import com.andresgt.notifications.platform.NotificationPlatform;

public abstract class BaseNotification implements Notification {

    protected final NotificationPlatform platform;

    protected BaseNotification(NotificationPlatform platform) {
        this.platform = platform;
    }
}
