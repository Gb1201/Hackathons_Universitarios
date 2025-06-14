import java.util.*;

public class Equipes {
    private static final Equipes INSTANCE = new Equipes();   // única instância
    private final List<Equipe> lista = new ArrayList<>();    // coleção interna

    private Equipes() {}                                     // construtor privado

    public static Equipes getInstance() {                    // ponto de acesso global
        return INSTANCE;
    }

    public void adicionar(Equipe equipe) {                   // operação de escrita
        lista.add(equipe);
    }

    public List<Equipe> todas() {                            // leitura somente
        return Collections.unmodifiableList(lista);
    }
}
