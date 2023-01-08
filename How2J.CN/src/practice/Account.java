package practice;

public class Account {
    protected double balance;
    // constructor
    public Account(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void  deposit(double money){
        this.balance= balance + money;
    }
    public void withdraw(double money) throws OverdraftException{
        if (this.balance<money){
            throw new OverdraftException("余额不足", money-this.balance);
        }
        this.balance= balance - money;
    }

    public static void main(String[] args) {
        Account account = new Account(1000); // 开一个1000刀的账户
        account.deposit(1000);
        try {
            account.withdraw(2100);
        }catch (OverdraftException e ){
            System.out.println("账户透支金额"+e.getDeficit());
            e.printStackTrace();
        }
    }
}
