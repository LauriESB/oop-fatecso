package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class SalariedEmployee extends Employee{
    private double minimumWage;
    private double numMinimumWage;
    
    public SalariedEmployee(int id, String name, String hireDate, double minimumWage) {
        super(id, name, hireDate);
        this.minimumWage = minimumWage;
    }
    public void setNumMinimumWage(double value) {
        numMinimumWage = value;
    }
    public double getMinimumWage() {
        return minimumWage;
    }
    public double calcGrossPay() {
        return minimumWage * numMinimumWage;
    }
}
