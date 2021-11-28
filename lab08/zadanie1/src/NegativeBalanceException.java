public class NegativeBalanceException extends Throwable {
    public float balance;
    public NegativeBalanceException(float balance) {
        this.balance = balance;
    }

    public void print(){
        System.out.println("Negative balance :" + balance);
    };


}