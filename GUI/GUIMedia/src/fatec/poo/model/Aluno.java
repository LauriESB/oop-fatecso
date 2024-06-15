package fatec.poo.model;

/**
 *
 * @author ichla
 */
public class Aluno {
    private String nome;
    private int ra;
    private double notaP1;
    private double notaP2;
    
    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }
    
    
    public String getNome() {
        return nome;
    }
    public int getRA() {
        return ra;
    }
    
    
    public void setNotaP1(double notaP1) {
        this.notaP1 = notaP1;
    }
    public double getNotaP1() {
        return notaP1;
    }
    
    
    public void setNota2(double notaP2 ) {
        this.notaP2 = notaP2;
    }
    public double getNotaP2() {
        return notaP2;
    }
    
    
    public double getMedia() {
        return (notaP1 + notaP2)/2;
    }
    public boolean getSituacao() {
        boolean resultado = false;
        if (getMedia() >=6) {
            resultado = true;
        } 
        return(resultado);
    }
}
