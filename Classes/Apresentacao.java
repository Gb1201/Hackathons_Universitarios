import java.time.LocalDateTime;

public class Apresentacao {

    private Projeto projeto;          // projeto apresentado
    private Avaliavel banca;          // banca/jurado(s) que avaliam
    private Sala local;               // sala onde ocorre
    private LocalDateTime dataHora; // data e hora 


    public Apresentacao(Projeto projeto, Avaliavel banca, Sala local, LocalDateTime dataHora) {
        this.projeto = projeto;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }


    public Projeto getProjeto() {
        return projeto;
    }


    public Avaliavel getBanca() {
        return banca;
    }


    public Sala getLocal() {
        return local;
    }


    public LocalDateTime getDataHora() {
        return dataHora;
    }

    
    public void avaliar (int nota){
        banca.avaliar(projeto, nota);
        projeto.setNotaFinal(nota);

    }

}
