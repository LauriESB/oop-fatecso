package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author ichla
 */
public class Department {
    private String abbreviation;
    private String name;
    private ArrayList<Employee> employee;
    
    public Department(String abbreviation, String name) {
        this.abbreviation = abbreviation;
        this.name = name;
        employee = new ArrayList<Employee>();
    }
    public String getAbbreviation() {
        return abbreviation;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addEmployee(Employee e) {
        employee.add(e);
        e.setDepartment(this);
    }
    public void removeEmployee(Employee e) {
        employee.remove(e);
        e.setDepartment(null);
    }
}
