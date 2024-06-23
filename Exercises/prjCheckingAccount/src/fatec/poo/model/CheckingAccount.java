package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class CheckingAccount {
    private int accNumber;
    private double accBalance;
    
    public CheckingAccount(int accNumber, double accBalance) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }
    public int getAccNumber() {
        return accNumber;
    }
    public double getBalance() {
        return accBalance;
    }
    public void withdraw(double withdrawValue) {
        accBalance -= withdrawValue;
    }
    public void deposit(double depositValue) {
        accBalance += depositValue;
    }
}
