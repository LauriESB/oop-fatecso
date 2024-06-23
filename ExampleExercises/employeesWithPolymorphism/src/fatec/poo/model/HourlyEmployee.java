package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class HourlyEmployee extends Employee{
    private double hourlyValue;
    private int workedHours;
    
    public HourlyEmployee(int id, String name, String hireDate, int workedHours) {
        super(id, name, hireDate);
        this.workedHours = workedHours;
    }
    public void setWorkedHours(int hours) {
        workedHours = hours;
    }
    public double calcGrossPay() {
        return hourlyValue * workedHours;
    }
    public double calcBonus() {
        return 0.75 * calcGrossPay();
    }
}
