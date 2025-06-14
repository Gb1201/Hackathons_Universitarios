public class Empresa extends Instituicao{

    private int numeroFuncionarios;
    private String representanteLegal;


    public Empresa(String nome, String endereco, String telefone, String email, String cnpj, int numeroFuncionarios,
            String representanteLegal) {
        super(nome, endereco, telefone, email, cnpj);
        this.numeroFuncionarios = numeroFuncionarios;
        this.representanteLegal = representanteLegal;
    }


    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }


    public String getRepresentanteLegal() {
        return representanteLegal;
    }
 
}
