package com.dedytech.designpatterns.strategy;

public class PaymentCash implements PaypalStrategy{
    @Override
    public void pay() {
        System.out.println("Paiment Cash effectuer avec success");
    }
}
