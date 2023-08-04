// Quentin Peterich

public class Main {
    public static void main(String[] args) {
        Account quentinAccount = new Account();
        // creating the quentin account with all of the assignments for the account
        quentinAccount.setNumber("12345");
        quentinAccount.setBalance(1000.00);
        quentinAccount.setCustomerName("Quentin Peterich");
        quentinAccount.setCustomerEmail("Quentin.Peterich@gmail.com");
        quentinAccount.setCustomerPhone("(850) 242-9877");

        // creating the two variables within the enum and giving them values
        TransactionStatus status1 = TransactionStatus.PENDING;
        TransactionStatus status2 = TransactionStatus.COMPLETED;

        // printing out the status before the deposit, during, and after. Then updating the balance
        System.out.println("Your account deposit is " + status1);
        quentinAccount.depositFunds(300);
        System.out.println("Your account deposit is " + status2);



    }
}
