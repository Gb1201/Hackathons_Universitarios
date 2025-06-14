public class Profissional extends Pessoa {

    private String cargo;
    private String departamento;

    public Profissional(String nome, String cpf, String email, String telefone, Instituicao instituicao,
                        String cargo, String departamento) {
        super(nome, cpf, email, telefone, instituicao);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    

}
