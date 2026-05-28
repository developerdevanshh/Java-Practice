package com.dev.engineer.solid;

interface PaymentMethod{
    void pay();
}

class UPIPayment implements PaymentMethod{
    public void pay(){
        System.out.println("Payment Done using UPI.");
    }
}

class CreditCard implements PaymentMethod{
    public void pay(){
        System.out.println("Payment done using credit card.");
    }
}


class PayPal implements PaymentMethod{
    public void pay(){
        System.out.println("Payment done using PayPal.");
    }
}

class PaymentProcessor {
    void processPayment(PaymentMethod paymentMethod){
        paymentMethod.pay();
    }
}

public class O_PaymentMethods {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        PaymentMethod upi = new UPIPayment();
        PaymentMethod creditCard = new CreditCard();
        PaymentMethod paypal = new PayPal();

        paymentProcessor.processPayment(upi);
        paymentProcessor.processPayment(creditCard);
        paymentProcessor.processPayment(paypal);
    }
}
