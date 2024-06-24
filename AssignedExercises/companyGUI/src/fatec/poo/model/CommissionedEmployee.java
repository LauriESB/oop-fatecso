package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class CommissionedEmployee extends Employee{
    private double baseSalary;
    private double commissionRate;
    private double totalSalesValue;

    public CommissionedEmployee(int id, String name, String hiredDate, double commissionRate) {
        super(id, name, hiredDate);
        this.commissionRate = commissionRate; 
    }
    
    public double getBaseSal() {
        return baseSalary;
    }

    public void setBaseSal(double bs) {
        baseSalary = bs;
    }

    public double getCommissionRate() {
        return commissionRate; 
    }

    public double getTotalSales() {
        return totalSalesValue;
    }
    
    public void addSales(double sales){
        totalSalesValue += sales;
    }
    
    public double calcGrossPay(){
        return baseSalary + (commissionRate / 100 * totalSalesValue); 
    }
    
    public double calcBonus(){
        if(totalSalesValue <= 5000) {
            return 0;
        }else 
           if(totalSalesValue > 5000 && totalSalesValue <= 10000){
             return calcGrossPay() * 0.03;
           } 
           else {             
             return calcGrossPay() * 0.05;
           }  
    }
    
    public double calcNetPay(){
        return super.calcNetPay() + calcBonus();
    }
}
