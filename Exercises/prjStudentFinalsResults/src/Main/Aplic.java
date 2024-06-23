package Main;

import fatec.poo.model.Student;
import java.util.ArrayList;
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
        double[] list = new double[4];
        
        System.out.println("Student ID number: ");
        int id = Integer.valueOf(scanner.nextLine());
             
        System.out.println("Type the student's scores: exam 1, exam 2, project 1 and project 2 SEPARATED BY COMMA");
        String g = scanner.nextLine();
        String [] pieces = g.split(",");
            
        Student objStudent = new Student(id, Double.valueOf(pieces[0]), Double.valueOf(pieces[1]), Double.valueOf(pieces[2]), Double.valueOf(pieces[3]));  
        while(true) {
            System.out.println("Choose an option");
            System.out.println("________________");
            System.out.println("1 - Show the scores of the exams and the projects");
            System.out.println("2 - Show avg of exams and projects");
            System.out.println("3 - Show final results");
            System.out.println("4 - Exit");
            String op = scanner.nextLine();
            
            if(op.equals("4")) {
                break;
            }
            
            if(op.equals("1")) {
                System.out.println("ID: " + objStudent.getID());
                System.out.println("First Exam: " + objStudent.getScoreExam1());
                System.out.println("Second Exam: " + objStudent.getScoreExam2());
                System.out.println("First Project: " + objStudent.getScoreProject1());
                System.out.println("Second project: " + objStudent.getScoreProject2());
            }else if(op.equals("2")) {
                System.out.println("ID: " + objStudent.getID());
                System.out.println("Avarage of exams: " + objStudent.avgExamsScore());
                System.out.println("Avarage of projects: " + objStudent.avgProjectsScore());
            }else {
                System.out.println("Student's final score average: " + objStudent.avgFinalScore());
            }   
        }    
    }    
}
