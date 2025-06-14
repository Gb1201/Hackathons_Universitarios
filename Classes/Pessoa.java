public class Pessoa {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Instituicao instituicao; // relação com a classe Instituicao

    public Pessoa(String nome, String cpf, String email, String telefone, Instituicao instituicao) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.instituicao = instituicao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    
    
}
