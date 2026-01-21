package polymorphism.payment;

public class PaymentWrong {
     public void pay(String method, double amount) {
        if ("COD".equals(method)) {
            // logic COD
        } else if ("VNPAY".equals(method)) {
            // logic VNPay
        } else if ("PAYPAL".equals(method)) {
            // logic Paypal
        }
    }
}
