package StrategyPattern;



interface PaymentStrategies {
    void pay();
}

class NetBanking implements PaymentStrategies {
    @Override
    public void pay() {
        System.out.println("Paid via Netbanking");
    }
}

class CreditCard implements PaymentStrategies {
    @Override
    public void pay() {
        System.out.println("Payment via CreditCard");
    }
}

class Upi implements PaymentStrategies {
    @Override
    public void pay() {
        System.out.println("Payment via Upi");
    }
}

class DebitCard implements PaymentStrategies {
    @Override
    public void pay() {
        System.out.println("Payment via DebitCard");
    }
}


class Checkout {
    PaymentStrategies strategy;
    public Checkout(PaymentStrategies strategy) {
        this.strategy = strategy;
    }
    public void makePayment(){
        // we can make payment using different method like CC, NET_BANKING, UPI, DEBIT_CARD -> these are different strategies
        strategy.pay();
    }
}
public class paymentExample {

    public static void main(String[] args) {
        Checkout checkout1 = new Checkout(new CreditCard());
        checkout1.makePayment();

        Checkout checkout2 = new Checkout(new NetBanking());
        checkout2.makePayment();

        Checkout checkout3 = new Checkout(new Upi());
        checkout3.makePayment();

        Checkout checkout4 = new Checkout(new DebitCard());
        checkout4.makePayment();
    }
}
