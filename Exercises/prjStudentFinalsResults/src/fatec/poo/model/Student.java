package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class Student {
    private int studentID;
    private double scoreExam1;
    private double scoreExam2;
    private double scoreProject1;
    private double scoreProject2;
    
    public Student(int studentID, double scoreExam1, double scoreExam2, double scoreProject1, double scoreProject2) {
        this.studentID = studentID;
        this.scoreExam1 = scoreExam1;
        this.scoreExam2 = scoreExam2;
        this.scoreProject1 = scoreProject1;
        this.scoreProject2 = scoreProject2;
    }
    public int getID() {
        return studentID;
    }
    
    public double getScoreExam1() {
        return scoreExam1;
    }
    
    public double getScoreExam2() {
        return scoreExam2;
    }
    
    public double getScoreProject1() {
        return scoreProject1;
    }
    
    public double getScoreProject2() {
        return scoreProject2;
    }
    
    public double avgExamsScore() {
        return 0.75 * (scoreExam1 + (2 * scoreExam2)) / 3;
    }
    
    public double avgProjectsScore() {
        return 0.25 * (scoreProject1 + scoreProject2) / 2;
    }
    
    public double avgFinalScore() {
        return avgExamsScore() + avgProjectsScore();
    }
}
