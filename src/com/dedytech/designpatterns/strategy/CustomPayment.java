package com.dedytech.designpatterns.strategy;

public class CustomPayment implements PaypalStrategy{
    @Override
    public void pay() {
        System.out.println("Paiment personalise a ete effectue avec succes");
    }
}
