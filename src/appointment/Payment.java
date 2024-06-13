package appointment;

import java.util.Date;

public interface Payment {
    String getPaymentId();
    void setPaymentId(String paymentId);
    String getBillId();
    void setBillId(String billId);
    double getAmount();
    void setAmount(double amount);
    Date getPaymentDate();
    void setPaymentDate(Date paymentDate);
}





 class CreditCardPayment implements Payment {
    private String paymentId;
    private String billId;
    private double amount;
    private Date paymentDate;
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String paymentId, String billId, double amount, Date paymentDate, String cardNumber, String expiryDate, String cvv) {
        this.paymentId = paymentId;
        this.billId = billId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public String getPaymentId() {
        return paymentId;
    }

    @Override
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public String getBillId() {
        return billId;
    }

    @Override
    public void setBillId(String billId) {
        this.billId = billId;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public Date getPaymentDate() {
        return paymentDate;
    }

    @Override
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}



 class PayPalPayment implements Payment {
    private String paymentId;
    private String billId;
    private double amount;
    private Date paymentDate;
    private String email;
    private String password;

    public PayPalPayment(String paymentId, String billId, double amount, Date paymentDate, String email, String password) {
        this.paymentId = paymentId;
        this.billId = billId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.email = email;
        this.password = password;
    }

    @Override
    public String getPaymentId() {
        return paymentId;
    }

    @Override
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public String getBillId() {
        return billId;
    }

    @Override
    public void setBillId(String billId) {
        this.billId = billId;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public Date getPaymentDate() {
        return paymentDate;
    }

    @Override
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
