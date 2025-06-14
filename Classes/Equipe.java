import java.util.List;

public class Equipe {

    private String nome;
    private List<Estudante> membros;


    public Equipe(String nome,List<Estudante> membros) {
        this.nome = nome;
        this.membros = membros;
    }


    public String getNome() {
        return nome;
    }

    public List<Estudante> getMembros() {
        return membros;
    }

    


    
    
}
