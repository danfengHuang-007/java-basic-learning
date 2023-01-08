package practice;

public class CheckingAccount extends Account{
    protected double balance;
    protected double overdraftProtection;

    public CheckingAccount(double balance) {
       super(balance);

    }
    public CheckingAccount(double balance, double overdraftProtection){
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public double getBalance(){
        return balance;
    }
    public void withdraw(double money) throws OverdraftException{
        if (this.balance + overdraftProtection <money){
            double deficit = money -(this.balance+overdraftProtection);
            throw new OverdraftException("透支额度超标", deficit);
        }
         this.balance-=money;
    }

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(500, 1000);
       // checkingAccount.deposit(100);
        System.out.println(checkingAccount.balance);
    }


}
