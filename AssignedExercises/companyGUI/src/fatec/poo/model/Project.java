package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author ichla
 */
public class Project {
    private int code;
    private String description;
    private String beginDate;
    private String finishDate;
    private ArrayList<Employee> employee;
    
    public Project(int code, String description) {
        this.code = code;
        this.description = description;
        employee = new ArrayList<Employee>();
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
        employee.add(e);
        e.setProject(this);
    }
}
