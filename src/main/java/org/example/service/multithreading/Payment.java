package org.example.service.multithreading;

public class Payment {
    public static void main(String[] args) {
        PaymentAnar paymentAnar = new PaymentAnar();
        PaymentMurad paymentMurad = new PaymentMurad();
        PaymentVuqar paymentVuqar = new PaymentVuqar();
        paymentAnar.run();
        paymentMurad.run();
        paymentVuqar.run();
    }

}

