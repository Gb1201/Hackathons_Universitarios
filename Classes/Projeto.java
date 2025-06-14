public class Projeto {


    private String tema;
    private Profissional orientador; // quem orienta a equipe
    private Equipe equipe;           // equipe responsável pelo projeto
    private double notaFinal;


    public Projeto(String tema, Profissional orientador, Equipe equipe, double notaFinal) {
        this.tema = tema;
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaFinal = notaFinal;
    }


    public String getTema() {
        return tema;
    }


    public Profissional getOrientador() {
        return orientador;
    }


    public Equipe getEquipe() {
        return equipe;
    }


    public double getNotaFinal() {
        return notaFinal;
    }


    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    



    
}
