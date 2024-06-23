package main;

import fatec.poo.model.Client;
import fatec.poo.model.Instructor;

/**
 *
 * @author ichla
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client = new Client("Laura", "10292091", "83290820");
        client.setHeight(1.62);
        client.setWeight(50);
        
        System.out.println("Information about the client");
        System.out.println("Name " + client.getName());
        System.out.println("Phone Number " + client.getPhone());
        System.out.println("SSN " + client.getSSN());
        System.out.println("Weight " + client.getWeight() + " kg");
        System.out.println("Height " + client.getHeight()+ " meters");
        
        
        Instructor instructor = new Instructor("Marcela", "2802303", 001);
        instructor.setExpertise("Bodybuilder");
        
        System.out.println("\n\nInformation about the instructor");
        System.out.println("Name " + instructor.getName());
        System.out.println("Phone Number " + instructor.getPhone());
        System.out.println("ID number " + instructor.getID());
        System.out.println("Expertise " + instructor.getExpertise());
        
    }
    
}
