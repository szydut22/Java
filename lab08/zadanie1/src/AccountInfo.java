public class AccountInfo {
    private int bankAccountNumber;
    private String lastName;
    private float balance;

    public AccountInfo(int bankAccountNumber, String lastName, float balance){
        this.bankAccountNumber = bankAccountNumber;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String toString(){
        return String.format("%d   %s   %.2f", bankAccountNumber, lastName, balance);
    }
}
