public class Main {
    public static void main(String [] args) {
        int deposit_amount = 1100;
        int bonus =  deposit_amount>1000? deposit_amount/100 : 0;
        int account_before = 100;
        int account = deposit_amount + account_before + bonus;
        System.out.println("Bonus:" + bonus);
        System.out.println("account_amount:" + account);
    }
}
