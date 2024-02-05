interface PaymentMethod {
    void processPayment(double amount);
    void refund(double amount);
}

class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment processed for amount: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Credit card refund processed for amount: " + amount);
    }
}

class PayPal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment processed for amount: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("PayPal refund processed for amount: " + amount);
    }
}

class Bitcoin implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Bitcoin payment processed for amount: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Bitcoin refund processed for amount: " + amount);
    }
}

class PaymentTesting {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();
        Bitcoin bitcoin = new Bitcoin();

        creditCard.processPayment(50.0);
        creditCard.refund(10.0);

        payPal.processPayment(30.0);
        payPal.refund(5.0);

        bitcoin.processPayment(20.0);
        bitcoin.refund(2.0);
    }
}
