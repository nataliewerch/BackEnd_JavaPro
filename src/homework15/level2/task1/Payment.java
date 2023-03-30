package homework15.level2.task1;

import java.util.Objects;

public final class  Payment {
    private final double amountPayment;
    private final PaymentType paymentType;

    public Payment(double amountPayment, PaymentType paymentType) {
        this.amountPayment = amountPayment;
        this.paymentType = paymentType;
    }

    public double getAmountPayment() {
        return amountPayment;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Double.compare(payment.amountPayment, amountPayment) == 0 && paymentType == payment.paymentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountPayment, paymentType);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amountPayment=" + amountPayment +
                ", paymentType=" + paymentType +
                '}';
    }
}
