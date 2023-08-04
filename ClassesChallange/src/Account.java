// Quentin Peterich
// enum
enum TransactionStatus {
    PENDING,
    COMPLETED,
    FAILED,
    CANCELLED
}
// the private fields for the bank account for a user.
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private TransactionStatus status;

// the getter for TransactionStatus
    public TransactionStatus getStatus(){
        return status;
    }
// setting the status for Transaction Status
    public void setStatus(TransactionStatus status)
    {
        this.status = status;
    }
// depositing money into the account
    public void depositFunds(double depositAmount)
    { // letting the user know the deposit is complete and the udated balance
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" +
                balance);
    }
    // make a method for the user to withdraw money from their account.
    public void withdrawFunds(double withdrawAmount)
    { // if they are trying to withdraw money that will make them go into the negative, it will give them an error
        if(balance - withdrawAmount < 0){
            System.out.println("Insufficient Funds! You only have $ " + balance + " in your account.");
        } else
        { // if they have enough money it will let them withdraw
            balance -= withdrawAmount;
            System.out.println("Withdraw of $" + withdrawAmount + " processed, Remaining balance = $" + balance);
        }
    }



// below are the getters and setters for all of the private fields.
    public String getNumber() {
        return number;
    }
// setter
    public void setNumber(String number) {
        this.number = number;
    }
//getter
    public double getBalance() {
        return balance;
    }
// setter
    public void setBalance(double balance) {
        this.balance = balance;
    }
// getter
    public String getCustomerName() {
        return customerName;
    }
// setter
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
// getter
    public String getCustomerEmail() {
        return customerEmail;
    }
// setter
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
// getter
    public String getCustomerPhone() {
        return customerPhone;
    }
// setter
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}


