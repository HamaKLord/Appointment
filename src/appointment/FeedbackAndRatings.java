package appointment;

public class FeedbackAndRatings {
    private String feedbackId;
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private int rating;
    private String feedback;

    // Aggregation: Feedback and Ratings are associated with an appointment, patient, and doctor
    public FeedbackAndRatings(String feedbackId, String appointmentId, String patientId, String doctorId, int rating, String feedback) {
        this.feedbackId = feedbackId;
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.rating = rating;
        this.feedback = feedback;
    }

    // Getters and Setters
    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
