import polymorphism.payment.PaymentMethod;
import polymorphism.payment.PaypalPayment;
import polymorphism.payment.VnPayPayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, OOP Review!");
        

        // use payment method paypal
        PaymentMethod paypal =  new PaypalPayment();
        paypal.pay(120);

        PaymentMethod vnPayPay =  new VnPayPayment();
        vnPayPay.pay(130);




         
        
    }
}