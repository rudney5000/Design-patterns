package com.dedytech.designpatterns.strategy;

public class PayPalPayment implements PaypalStrategy{

    @Override
    public void pay() {
        System.out.println("Paiement PayPal effectuer avec succes");
    }
}
