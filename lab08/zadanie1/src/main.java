import java.util.Random;

public class main {

    public static void main(String[] args){
        Random rand = new Random();
        float max = 10000;
        float min = -10000;
        float[] balanceTab = new float[10];

        System.out.println("ACCNO  CUSTOMER  BALANCE");
        for(int i = 0; i < 5; i++){
            int bankNumber = 1000 + i;
            String surname = "Owner " + i;
            float balance = max + rand.nextFloat() * (min - max);
            balanceTab[i] = balance;

            AccountInfo accInfo = new AccountInfo(bankNumber, surname, balance);

            System.out.println(accInfo.toString());
        }
        for(int i = 0; i < 5; i++){
            try{
                isNegative(balanceTab[i]);
            }catch(NegativeBalanceException e){
                e.print();
            }
        }
    }
    public static void isNegative(float balance) throws NegativeBalanceException {
        if (balance < 0) {
            throw new NegativeBalanceException(balance);
        }
    }
}
