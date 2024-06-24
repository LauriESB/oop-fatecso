package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class HourlyEmployee extends Employee {

    private double hourlyValue;
    private int workedHours;

    public HourlyEmployee(int id, String name, String hireDate, double hourlyValue) {
        super(id, name, hireDate);
        this.hourlyValue = hourlyValue;
    }

    public void setWorkedHours(int hours) {
        workedHours = hours;
    }
  
    public double calcGrossPay() {
        return hourlyValue * workedHours;
    }

    public double calcBonus() {
        return 0.075 * calcGrossPay();
    }
    
    public double calcNetPay() {
        return super.calcNetPay() + calcBonus();
    }
}
