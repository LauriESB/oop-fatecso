package main;

import fatec.poo.model.Circle;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ichla
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        
        System.out.println("What is the radius of the circle? ");
        double r = Double.valueOf(scanner.nextLine());
        Circle objCircle = new Circle(r);
        String con;
        
        do {
            System.out.println("Select below what information you would like to know about this circle");
            System.out.println("_______________________________________________________________________");
            System.out.println("1 - Area");
            System.out.println("2 - Perimeter");
            System.out.println("3 - Diameter");
            System.out.println("4 - Exit");
            String op = scanner.nextLine();

            if(op.equals("1")) {
                System.out.println("The area of the circle is: " + df.format(objCircle.calcArea()));
            }else if(op.equals("2")) {
                System.out.println("The perimeter of the circle is: " + df.format(objCircle.calcPerimeter()));
            }else {
                System.out.println("The diameter of the circle is: " + df.format(objCircle.calcDiameter()));
            }
            
            System.out.println("Continue? y/n");
            con = scanner.nextLine();
        } while(con.equals("y"));
        
    }
}
