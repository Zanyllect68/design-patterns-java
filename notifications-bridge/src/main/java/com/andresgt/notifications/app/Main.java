package com.andresgt.notifications.app;

import com.andresgt.notifications.abstraction.AlertNotification;
import com.andresgt.notifications.abstraction.ConfirmationNotification;
import com.andresgt.notifications.abstraction.MessageNotification;
import com.andresgt.notifications.abstraction.Notification;
import com.andresgt.notifications.abstraction.WarningNotification;
import com.andresgt.notifications.platform.MobilePlatform;
import com.andresgt.notifications.platform.NotificationPlatform;
import com.andresgt.notifications.platform.WebPlatform;

public class Main {

    public static void main(String[] args) {
        NotificationPlatform web = new WebPlatform();
        NotificationPlatform mobile = new MobilePlatform();

        Notification msgWeb = new MessageNotification(web);
        Notification alertMobile = new AlertNotification(mobile);
        Notification warningWeb = new WarningNotification(web);
        Notification confirmMobile = new ConfirmationNotification(mobile);

        msgWeb.send("Tienes un nuevo mensaje privado.");
        alertMobile.send("Se detectó actividad sospechosa en tu cuenta.");
        warningWeb.send("Espacio en disco bajo.");
        confirmMobile.send("¿Deseas cerrar la sesión en todos los dispositivos?");
    }
}
