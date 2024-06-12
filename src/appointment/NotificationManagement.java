package appointment;

import java.util.ArrayList;
import java.util.List;

public class NotificationManagement {
    private List<Notification> notifications;

    // Composition: NotificationManagement is composed of Notification objects
    public NotificationManagement() {
        this.notifications = new ArrayList<>();
    }

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    public List<Notification> getNotifications() {
        return notifications;
    }
}
