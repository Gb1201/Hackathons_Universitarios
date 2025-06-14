import java.util.Map;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados; // jurado + nota atribuída

    public Banca(Projeto projetoAvaliado, Map<Jurado, Integer> jurados) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = jurados;
    }

    public Projeto getProjetoAvaliado() {
        return projetoAvaliado;
    }

    public void setProjetoAvaliado(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
    }

    public Map<Jurado, Integer> getJurados() {
        return jurados;
    }

    public void setJurados(Map<Jurado, Integer> jurados) {
        this.jurados = jurados;
    }

    // Interface Avaliavel exige esse método
    @Override
    public void avaliar(Projeto projeto, int notaIgnorada) {
        calcularNotaFinal();
    }

    // Calcula a média das notas dos jurados e define no projeto
    public void calcularNotaFinal() {
        // verificação
        if (jurados == null || jurados.isEmpty()) {
            System.out.println("Nenhuma nota atribuída pelos jurados.");
            projetoAvaliado.setNotaFinal(0);
            return;
        }

        int soma = 0;
        for (Integer nota : jurados.values()) {
            soma += nota;
        }

        double media = (double) soma / jurados.size(); // média inteira
        projetoAvaliado.setNotaFinal((int) Math.round(media)); // atualiza a nota 
    }
    
}
