public class Universidade extends Instituicao {

    private String reitoria;
    private int numeroDeCursos;
    private Tipo tipo_universidade;


    public Universidade(String nome, String endereco, String telefone, String email, String cnpj, String reitoria,
            int numeroDeCursos, Tipo tipo_univerisidade) {
        super(nome, endereco, telefone, email, cnpj);
        this.reitoria = reitoria;
        this.numeroDeCursos = numeroDeCursos;
        this.tipo_universidade= tipo_univerisidade;
    }


    public String getReitoria() {
        return reitoria;
    }


    public int getNumeroDeCursos() {
        return numeroDeCursos;
    }


    public Tipo getTipo_universidade() {
        return tipo_universidade;
    }

}
