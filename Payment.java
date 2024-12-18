public class Payment {
    private String paymentId;
    private PaymentStatus paymentStatus;
    private double totalAmount;
    public Payment(String paymentId,PaymentStatus paymentStatus,double totalAmount){
        this.paymentId=paymentId;
        this.paymentStatus=PaymentStatus.PENDING;
        this.totalAmount=totalAmount;

    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
