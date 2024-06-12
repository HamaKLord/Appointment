package appointment;

import java.util.Date;

public class Payment {
    private String paymentId;
    private String billId;
    private double amount;
    private Date paymentDate;

    // Association: Payment is associated with a bill
    public Payment(String paymentId, String billId, double amount, Date paymentDate) {
        this.paymentId = paymentId;
        this.billId = billId;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Getters and Setters
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
