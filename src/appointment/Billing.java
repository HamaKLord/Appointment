package appointment;

import java.util.Date;

public class Billing {
    private String billId;
    private String patientId;
    private String doctorId;
    private Date billingDate;
    private double amount;
    private String status;

    // Association: A bill is associated with a patient and a doctor
    public Billing(String billId, String patientId, String doctorId, Date billingDate, double amount, String status) {
        this.billId = billId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.billingDate = billingDate;
        this.amount = amount;
        this.status = status;
    }

    // Getters and Setters
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
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

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
