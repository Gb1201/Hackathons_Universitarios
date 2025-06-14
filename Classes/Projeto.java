public class Projeto {


    private String tema;
    private Profissional orientador; // quem orienta a equipe
    private Equipe equipe;           // equipe responsável pelo projeto
    private double notaInicial;

    public Projeto(String tema, Profissional orientador, Equipe equipe, double notaInicial) {
        this.tema = tema;
        this.orientador = orientador;
        this.equipe = equipe;
        this.notaInicial = notaInicial;
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
        return notaInicial;
    }


    public void setNotaFinal(int notaFinal) {
        this.notaInicial = notaFinal;
    }

    



    
}
