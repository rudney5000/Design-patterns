package com.dedytech.designpatterns.strategy;

public class PaymentContext {

    private PaypalStrategy strategy;

    public PaymentContext(PaypalStrategy strategy) {
        this.strategy = strategy;
    }

    void executePayment() {
        if (strategy == null) {
            System.err.println("Aucun paiment n'a ete defini");
            return;
        }
        strategy.pay();
    }

    public void setStrategy(PaypalStrategy strategy) {
        this.strategy = strategy;
    }
}
