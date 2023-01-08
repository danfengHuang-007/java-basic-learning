package practice;

public class OverdraftException extends Exception{
    private double deficit; // 透支额
    public OverdraftException(String msg, double deficit)  {
       super(msg);
       this.deficit = deficit;
    }

    public OverdraftException() {
    }
    public double getDeficit(){
        return deficit;
    }

}
