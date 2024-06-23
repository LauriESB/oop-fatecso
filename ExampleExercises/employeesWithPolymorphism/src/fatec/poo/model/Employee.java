package fatec.poo.model;

/**
 *
 * @author ichla
 */
public abstract class Employee {
    private int id;
    private String name;
    private String hireDate;
    
    public Employee(int id, String name, String hireDate) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
    }
    abstract public double calcGrossPay();
    
    public double calcDeduction() {
        return 0.10 * calcGrossPay();
    }
    public double calcNetPay() {
        return calcGrossPay() - calcDeduction();
    }    
}
