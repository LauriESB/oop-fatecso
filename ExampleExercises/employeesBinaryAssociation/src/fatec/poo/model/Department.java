package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class Department {
    private String abbreviation;
    private String name;
    private Employee[] employee;
    private int numEmploy;
    
    public Department(String abbreviation, String name) {
        this.abbreviation = abbreviation;
        this.name = name;
        numEmploy = 0;
        employee = new Employee[5];
    }
    public String getAbbreviation() {
        return abbreviation;
    }
    public String getName() {
        return name;
    }
    public void addEmployee(Employee e) {
        employee[numEmploy] = e;
        numEmploy++;
        e.setDepartment(this);
    }
    public void listEmployees() {
        System.out.println("Department info");
        System.out.println("Abbreviation: " + abbreviation);
        System.out.println("Name: " + name);
        System.out.println("Number of employees: " + numEmploy);
        System.out.println("\nID\t\tName\t\tPosition\t\tProject");
        
        for(int i = 0; i < numEmploy; i++) {
            System.out.print(employee[i].getID() + "\t\t");
            System.out.print(employee[i].getName() + "\t\t");
            System.out.print(employee[i].getPosition() + "\t\t");
            System.out.println(employee[i].getProject().getDescription());
        }
    }
}
