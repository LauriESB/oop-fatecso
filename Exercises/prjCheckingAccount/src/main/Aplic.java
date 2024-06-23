package main;

import fatec.poo.model.CheckingAccount;
import java.util.Scanner;

/**
 *
 * @author ichla
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please type your account number: ");
        int acc = Integer.valueOf(scanner.nextLine());
        System.out.print("Please type your balance: ");
        double balance = Double.valueOf(scanner.nextLine());
        
        CheckingAccount ca = new CheckingAccount(acc, balance);
        
        while(true) {
            System.out.println("\nSelect one of the options below");
            System.out.println("_______________________________");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Verify balance");
            System.out.println("4 - Exit");
            String op = scanner.nextLine();
            
            if(op.equals("4")) {
                break;
            }
            
            if(op.equals("1")) {
                System.out.print("How much would you like to deposit? ");
                double depValue = Double.valueOf(scanner.nextLine());
                
                System.out.println("\nAccount number: " + ca.getAccNumber());
                ca.deposit(depValue);
                System.out.println("Deposit complete! Current balance: $" + ca.getBalance());
                
            }else if(op.equals("2")) {
                System.out.println("How much would you like to withdraw? ");
                double withValue = Double.valueOf(scanner.nextLine());
                
                System.out.println("\nAccount number: " + ca.getAccNumber());
                ca.withdraw(withValue);
                System.out.println("Withdraw complete! Current balance: $" + ca.getBalance());
            }else {
                System.out.print("\nAccount number: " + ca.getAccNumber());
                System.out.println(" You current balance is: $" + ca.getBalance());
            }
        }
    }
    
}
