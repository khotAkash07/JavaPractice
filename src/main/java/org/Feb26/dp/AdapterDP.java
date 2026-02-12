package org.Feb26.dp;

interface Payment{
    void pay();
}

class OldPayment{
    public void oldPay(){
        System.out.println("This is old pay method");
    }
}

class PaymentAdapter implements Payment{
    private final OldPayment oldPayment;
    public PaymentAdapter(OldPayment oldPayment){
        this.oldPayment = oldPayment;
    }
    public void pay(){
        oldPayment.oldPay();
    }
}

public class AdapterDP{

    public static void main(String[] args){
        Payment payment = new PaymentAdapter(new OldPayment());
        payment.pay();
    }

}
