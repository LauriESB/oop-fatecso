package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class Project {
    private int code;
    private String description;
    private String beginDate;
    private String finishDate;
    private Employee[] employee;
    private int numEmploy;
    
    public Project(int code, String description) {
        this.code = code;
        this.description = description;
        employee = new Employee[5];
        numEmploy = 0;
    }
    public void setBeginDate(String bDate) {
        beginDate = bDate;
    }
    
    public String getBeginDate() {
        return beginDate;
    }
    
    public void setFinishDate(String fDate) {
        finishDate = fDate;
    }
    
    public String getFinishDate() {
        return finishDate;
    }
    
    public int getCode() {
        return code;
    }
    public String getDescription() {
        return description;
    }
    
    public void addEmployee(Employee e) {
        employee[numEmploy] = e;
        numEmploy++;
    }
    
    public void listEmployees() {
        System.out.println("\n Project info");
        System.out.println("Code: " + code);
        System.out.println("Description: " + description);
        System.out.println("Begin date: " + beginDate);
        System.out.println("Finish date: " + finishDate);
        System.out.println("Number of employees: " + numEmploy);
        System.out.println("\nID\t\tName\t\t\tPosition\t\tDepartment");
        
        for(int i = 0; i < numEmploy; i++) {
            System.out.print(employee[i].getID() + "\t\t");
            System.out.print(employee[i].getName() + "\t\t");
            System.out.print(employee[i].getPosition() + "\t\t");
            System.out.println(employee[i].getDepartament().getName());
        }        
    }
}
