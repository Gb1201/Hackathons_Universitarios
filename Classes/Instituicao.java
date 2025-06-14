public class Instituicao { // classe pai

    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cnpj;


    public Instituicao(String nome, String endereco, String telefone, String email, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cnpj = cnpj;
    }


    public String getNome() {
        return nome;
    }


    public String getEndereco() {
        return endereco;
    }


    public String getTelefone() {
        return telefone;
    }


    public String getEmail() {
        return email;
    }


    public String getCnpj() {
        return cnpj;
    }
}
