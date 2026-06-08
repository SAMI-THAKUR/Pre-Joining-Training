class InsufficientBalance extends RuntimeException {
    InsufficientBalance(String message) {
        super(message);
    }
}

// class from same pkg can be extended
class GoodBankAccount extends BankAccount{
    GoodBankAccount(double balance){
        super(balance);
    }
    public boolean withdraw (double amount) throws InsufficientBalance{
        if(amount>balance){
            throw new InsufficientBalance("not sufficient balance");
        }
        balance -= amount;
        System.out.println(amount + " withdrawn");
        return true;
    }
    @Override
    public void addInterest() {
        balance += balance*0.6;
    }


}
public class CustomException {
    public static void main(String[] args) {
        GoodBankAccount gba = new GoodBankAccount(10000);
        try {
            gba.deposit(2000);
            gba.withdraw(10000);
            gba.withdraw(3000);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of transaction");
        }
    }
}
