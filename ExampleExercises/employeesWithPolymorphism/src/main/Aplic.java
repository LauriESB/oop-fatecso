package main;

import fatec.poo.model.CommissionedEmployee;
import fatec.poo.model.HourlyEmployee;
import fatec.poo.model.SalariedEmployee;

/**
 *
 * @author ichla
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee he = new HourlyEmployee(001, "Vanessa Maria", "11/04/2020", 15);
        he.setWorkedHours(50);
        he.setPosition("QA");
        
        System.out.println("Hourly employee info");
        System.out.println("____________________");
        System.out.println("ID: " + he.getID());
        System.out.println("Name: " + he.getName());
        System.out.println("Hired date: " + he.getHireDate());
        System.out.println("Position: " + he.getPosition());
        System.out.println("Gross pay value: $" + he.calcGrossPay());
        System.out.println("Net pay value: $" + he.calcNetPay());
        System.out.println("Deduction: $" + he.calcDeduction());
        System.out.println("Bonus: $" + he.calcBonus());
       
        
        
        SalariedEmployee se = new SalariedEmployee(011, "Lauri Santinelli", "10/07/2024", 1200);
        se.setNumMinimumWage(2.5);
        se.setPosition("Java Backend Developer");
        
        System.out.println("\n\nSalaried employee info");
        System.out.println("____________________");
        System.out.println("ID: " + se.getID());
        System.out.println("Name: " + se.getName());
        System.out.println("Hired date: " + se.getHireDate());
        System.out.println("Position: " + se.getPosition());
        System.out.println("Minimum wage: $" + se.getMinimumWage());
        System.out.println("Gross pay value: $" + se.calcGrossPay());
        System.out.println("Net pay value: $" + se.calcGrossPay());
        System.out.println("Deduction: $" + se.calcDeduction());  
        
        
        
        CommissionedEmployee ce = new CommissionedEmployee(1000, "Felipe Bento", "12/07/2024", 20);
        ce.setBaseSal(5000);
        ce.setPosition("Ruby Developer");
        ce.addSales(70000);
        
        System.out.println("\n\nCommissioned employee info");
        System.out.println("______________________________");
        System.out.println("ID: " + ce.getID());
        System.out.println("Name: " + ce.getName());
        System.out.println("Hire date: " + ce.getHireDate());
        System.out.println("Position: " + ce.getPosition());
        System.out.println("Base salary: $" + ce.getBaseSal());
        System.out.println("Total sales: " + ce.getTotalSales());
        System.out.println("Comission Rate: " + ce.getCommissionRate() + "%");
        System.out.println("Gross pay value: $" + ce.calcGrossPay());
        System.out.println("Net pay value: $" + ce.calcNetPay());
        System.out.println("Deduction: " + ce.calcDeduction());
        System.out.println("Bonus: $" + ce.calcBonus());
        
    }  
}
