public class Jurado extends Profissional implements Avaliavel{

    private String especialidade;

    public Jurado(String nome, String cpf, String email, String telefone, Instituicao instituicao, String cargo,
            String departamento, String especialidade) {
        super(nome, cpf, email, telefone, instituicao, cargo, departamento);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public void avaliar(Projeto projeto, int nota) {
        System.out.println("Jurado avaliando projeto: " + projeto.getTema());
        projeto.setNotaFinal(nota); // define nota no projeto
    }

    

    
    
}
