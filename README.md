***

# Notifications Bridge (Patrón Bridge en Java)

Proyecto de ejemplo en Java que implementa el **patrón de diseño Bridge** para gestionar notificaciones en diferentes plataformas (web, móvil, escritorio).

## Descripción del problema

En una aplicación real, las notificaciones pueden ser de distintos tipos (mensaje, alerta, advertencia, confirmación) y mostrarse en varias plataformas (web, móvil, escritorio).  
Si se usara solo herencia, habría que crear clases como:

- `NotificacionMensajeWeb`  
- `NotificacionAlertaWeb`  
- `NotificacionMensajeMovil`  
- `NotificacionAlertaMovil`  
- etc.

Esto genera una explosión de clases difícil de mantener.

## Solución: Patrón Bridge

El patrón **Bridge** separa la **abstracción** (tipo de notificación) de su **implementación** (plataforma donde se muestra).  
Así podemos combinar libremente tipos de notificación y plataformas sin crear una clase por cada combinación.

En este proyecto:

- Abstracción: `Notification` y sus subclases (`MessageNotification`, `AlertNotification`, `WarningNotification`, `ConfirmationNotification`).  
- Implementación: `NotificationPlatform` y sus implementaciones (`WebPlatform`, `MobilePlatform`, `DesktopPlatform`).  

De esta forma, podemos crear objetos como:

- `new AlertNotification(new MobilePlatform())`  
- `new MessageNotification(new WebPlatform())`

## Estructura de clases

- `Notification` (interface): define el método `send(String message)`.  
- `NotificationPlatform` (interface): define el método `show(String title, String body)`.  
- `BaseNotification` (abstract class): implementación base que guarda una referencia a `NotificationPlatform`.  
- `MessageNotification`, `AlertNotification`, `WarningNotification`, `ConfirmationNotification`: distintos tipos de notificación.  
- `WebPlatform`, `MobilePlatform`, `DesktopPlatform`: distintas plataformas de presentación.  
- `Main`: clase de entrada con el método `main`, donde se crean y envían las notificaciones de ejemplo.

## Requisitos

- Java 21 (o compatible).  
- Maven.  
- Cualquier IDE o editor (por ejemplo, Visual Studio Code con soporte para Java).

## Cómo ejecutar

1. Clonar el repositorio:

```bash
https://github.com/Zanyllect68/notifications-bridge.git
cd notifications-bridge
```

2. Compilar y ejecutar con Maven:

```bash
mvn clean package
mvn exec:java -Dexec.mainClass="com.andresgt.notifications.Main"
```

O, desde el IDE (VS Code):

- Abrir el proyecto.  
- Abrir la clase `Main`.  
- Ejecutar el método `main`.

## Ejemplo de salida

Al ejecutar `Main`, deberías ver algo similar a:

```text
[WEB] Mensaje - Tienes un nuevo mensaje privado.
[MÓVIL] ALERTA - Se detectó actividad sospechosa en tu cuenta.
[WEB] ADVERTENCIA - Espacio en disco bajo.
[MÓVIL] CONFIRMACIÓN - ¿Deseas cerrar la sesión en todos los dispositivos?
```

## Aprendizajes y objetivos

Este proyecto muestra:

- Uso del patrón de diseño **Bridge** para evitar la explosión de clases en combinaciones tipo/plataforma.  
- Separación clara de responsabilidades entre la lógica de la notificación y el medio por el que se presenta.  
- Código sencillo y extensible: es fácil agregar un nuevo tipo de notificación o una nueva plataforma sin modificar las clases existentes.

***
