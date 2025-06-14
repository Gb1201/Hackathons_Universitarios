public class Estudante extends Pessoa {

    private String curso;
    private int periodo;
    private String matricula;

    public Estudante(String nome, String cpf, String email, String telefone, Instituicao instituicao,
                     String curso, int periodo, String matricula) {
        super(nome, cpf, email, telefone, instituicao);
        this.curso = curso;
        this.periodo = periodo;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public String getMatricula() {
        return matricula;
    }
}
