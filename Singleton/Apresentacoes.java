import java.util.*;

public class Apresentacoes {
    private static final Apresentacoes INSTANCE = new Apresentacoes();
    private final List<Apresentacao> lista = new ArrayList<>();

    private Apresentacoes() {}

    public static Apresentacoes getInstance() {
        return INSTANCE;
    }

    public void adicionar(Apresentacao ap) {
        lista.add(ap);
    }

    public List<Apresentacao> todas() {
        return Collections.unmodifiableList(lista);
    }
}
