// Encapsulation (wrapping data and methods together and prevents direct modification.)
// Abstraction (showing essential features and hiding implementation details)
abstract class BankAccount{
    public double balance;
    BankAccount(double balance){
        this.balance = balance;
    }

    // Compile Time PolyMorphism
    public void deposit(double amount){
        balance += amount;
    }
    public void deposit(double amount, double bonus){
        balance += (amount+bonus);
    }
    public double getBalance(){
        return balance;
    }

    // ABSTRACT METHOD
    public abstract void addInterest();
}
class SavingsAccount extends BankAccount{
    SavingsAccount(double balance){
        super(balance); // super keyword used to access member of PARENT class
    }
    @Override
    public void addInterest(){
        balance += balance * 0.05;
    }
}
class SalaryAccount extends BankAccount{
    SalaryAccount(double balance){
        super(balance);
    }
    @Override
    public void addInterest() {
        balance += balance * 0.02;
    }
}
// Runtime Polymorphism
// INTERFACE (just an structure that says you must implement these classes)
interface Transaction {
    void pay(double amount);
}

class CreditCardPayment implements Transaction {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " Paid using Credit Card");
    }
}
class UpiPayment implements Transaction{
    @Override
    public void pay(double amount) {
        System.out.println(amount + " Paid using UPI");
    }
}
public class OOPS {
    public static void main(String[] args){
        BankAccount sa = new SavingsAccount(10000);
        BankAccount sla = new SalaryAccount(10000);

        sa.addInterest();
        System.out.println(sa.getBalance());

        sla.addInterest();
        System.out.println(sla.getBalance());

        Transaction payment;

        payment = new CreditCardPayment();
        payment.pay(2000);

        payment = new UpiPayment();
        payment.pay(1500);

    }
}
