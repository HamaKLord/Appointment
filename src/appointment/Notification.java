package appointment;

import java.util.Date;

public class Notification {
    private String notificationId;
    private String message;
    private Date date;

    public Notification(String notificationId, String message, Date date) {
        this.notificationId = notificationId;
        this.message = message;
        this.date = date;
    }

    // Getters and Setters
    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
