package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class Instructor extends Person{
    private int idNumber;
    private String expertise;
    
    public Instructor(String name, String phoneNumber, int idNumber) {
        super(name, phoneNumber);
        this.idNumber = idNumber;
    }
    public void setExpertise(String area) {
        expertise = area;
    }
    public int getID() {
        return idNumber;
    }
    public String getExpertise() {
        return expertise;
    }
}
