package com.dedytech.designpatterns.strategy;

public class CreditCardPayment implements PaypalStrategy{
    @Override
    public void pay() {
        System.out.println("Paiment Card credit effectuer avec succes");
    }
}
