package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class Person {
    private String name;
    private String phoneNumber;
    
    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phoneNumber;
    }
}
