package polymorphism.payment;

public class VnPayPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using VnPay.");
    }
    
}
