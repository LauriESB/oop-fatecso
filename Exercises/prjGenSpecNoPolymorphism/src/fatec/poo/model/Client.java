package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class Client extends Person{
    private String ssn;
    private double weight;
    private double height;
    
    public Client(String name, String phoneNumber, String ssn) {
        super(name, phoneNumber);
        this.ssn = ssn;
    }
    public void setWeight(double value) {
        weight = value;
    }
    public void setHeight(double value) {
        height = value;
    }
    public String getSSN() {
        return ssn;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
}
