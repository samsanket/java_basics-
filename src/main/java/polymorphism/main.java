package polymorphism;

public class main {

    public static void main(String[] args) {



        Payment pay4 = new CreditCardPayment();
        Payment pay2 = new upiPayment();
        Payment p2 = new Payment();

        pay4.makePayment();
        pay2.makePayment();
        p2.makePayment();

    }
}
