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
    public String getName() {
        return name;
    }
    public void addEmployee(Employee e) {
        employee.add(e);
        e.setDepartment(this);
    }
    public void listEmployees() {
        System.out.println("Department info");
        System.out.println("Abbreviation: " + abbreviation);
        System.out.println("Name: " + name);
        System.out.println("Number of employees: " + employee.size());
        System.out.println("\nID\t\tName\t\tPosition\t\tProject");
        
        for(int i = 0; i < employee.size(); i++) {
            System.out.print(employee.get(i).getID() + "\t\t");
            System.out.print(employee.get(i).getName() + "\t\t");
            System.out.print(employee.get(i).getPosition() + "\t\t");
            System.out.println(employee.get(i).getProject().getDescription());
        }
    }
}
