import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ----------------------- INSTÂNCIAS BÁSICAS -----------------------
        Instituicao pucMinas = new Instituicao(
                "PUC MINAS", "Dom José Gaspar, 500",
                "(31) 3319‑4225", "pucminas.com.br",
                "17.178.195/0001-67");

        Profissional orient1 = new Profissional("Ana",    "111","ana@puc.com",    "9999‑9991", pucMinas,"Professora","ICEI");
        Profissional orient2 = new Profissional("Carlos", "222","carlos@puc.com","9999‑9992", pucMinas,"Professor", "Engenharia");

        // ----------------------- EQUIPES (registradas no Singleton) -------
        Equipes eqRepo = Equipes.getInstance();

        Equipe equipe1 = new Equipe("Equipe 1", List.of(
                new Estudante("Gabriel","111.111.111‑11","gabriel@puc.br","(22)99738‑4221",pucMinas,"Eng. Software",1,"147852"),
                new Estudante("João",   "222.222.222‑22","joao@puc.br",   "(22)99738‑4222",pucMinas,"Eng. Software",1,"147853"),
                new Estudante("Lucas",  "333.333.333‑33","lucas@puc.br",  "(22)99738‑4223",pucMinas,"Eng. Software",2,"147854"),
                new Estudante("Felipe", "444.444.444‑44","felipe@puc.br", "(22)99738‑4224",pucMinas,"Eng. Software",2,"147855"),
                new Estudante("Thiago", "555.555.555‑55","thiago@puc.br", "(22)99738‑4225",pucMinas,"Eng. Software",3,"147856")
        ));
        eqRepo.adicionar(equipe1);

        Equipe equipe2 = new Equipe("Equipe 2", List.of(
                new Estudante("Pedro","666.666.666‑66","pedro@puc.br","(22)99738‑4226",pucMinas,"Eng. Software",1,"258961"),
                new Estudante("Rafael","777.777.777‑77","rafael@puc.br","(22)99738‑4227",pucMinas,"Eng. Software",1,"258962"),
                new Estudante("Vinícius","888.888.888‑88","vinicius@puc.br","(22)99738‑4228",pucMinas,"Eng. Software",2,"258963"),
                new Estudante("Eduardo","999.999.999‑99","eduardo@puc.br","(22)99738‑4229",pucMinas,"Eng. Software",2,"258964"),
                new Estudante("André","000.000.000‑00","andre@puc.br","(22)99738‑4230",pucMinas,"Eng. Software",3,"258965")
        ));
        eqRepo.adicionar(equipe2);

        // ----------------------- PROJETOS ---------------------------------
        Projeto proj1 = new Projeto("Sistema de Gestão Acadêmica",      orient1, equipe1, 0);
        Projeto proj2 = new Projeto("Aplicativo de Saúde",              orient2, equipe2, 0);
        Projeto proj3 = new Projeto("Plataforma de E-commerce",         orient1, equipe1, 0);
        Projeto proj4 = new Projeto("Sistema de Monitoramento Ambiental",orient2,equipe2,0);
        Projeto proj5 = new Projeto("Aplicativo de Educação",           orient1, equipe1, 0);

        // ----------------------- JURADOS ----------------------------------
        Jurado j1 = new Jurado("Carlos", "111.222.333‑44","carlos@emp.com","99999‑0001",pucMinas,"Dev Sênior","TI","Java");
        Jurado j2 = new Jurado("Marina", "222.333.444‑55","marina@emp.com","99999‑0002",pucMinas,"Analista","TI","Banco de Dados");
        Jurado j3 = new Jurado("Andréia","333.444.555‑66","andreia@emp.com","99999‑0003",pucMinas,"Arquiteta","Eng.","Microserviços");
        Jurado j4 = new Jurado("Bruno",  "444.555.666‑77","bruno@emp.com","99999‑0004",pucMinas,"Líder Técnico","TI","DevOps");

        // ----------------------- BANCAS -----------------------------------
        Banca b1 = new Banca(proj1, Map.of(j1,8,j2,7,j3,9,j4,8));
        Banca b2 = new Banca(proj2, Map.of(j1,6,j2,7,j3,8,j4,6));
        Banca b3 = new Banca(proj3, Map.of(j1,7,j2,8,j3,6,j4,7));
        Banca b4 = new Banca(proj4, Map.of(j1,5,j2,6,j3,5,j4,6));
        Banca b5 = new Banca(proj5, Map.of(j1,4,j2,5,j3,6,j4,6));

        // ----------------------- APRESENTAÇÕES (registradas no Singleton) -
        Apresentacoes apRepo = Apresentacoes.getInstance();

        apRepo.adicionar(new Apresentacao(proj1, b1, new Sala("Lab 01",20), LocalDateTime.of(2025,6,20,10,0)));
        apRepo.adicionar(new Apresentacao(proj2, b2, new Sala("Lab 02",15), LocalDateTime.of(2025,6,20,14,0)));
        apRepo.adicionar(new Apresentacao(proj3, b3, new Sala("Lab 03",25), LocalDateTime.of(2025,6,21,9,0)));
        apRepo.adicionar(new Apresentacao(proj4, b4, new Sala("Lab 04",30), LocalDateTime.of(2025,6,21,14,0)));
        apRepo.adicionar(new Apresentacao(proj5, b5, new Sala("Lab 05",20), LocalDateTime.of(2025,6,22,10,0)));

        // ----------------------- AVALIAR TODAS AS APRESENTAÇÕES -----------
        apRepo.todas().forEach(ap -> ap.avaliar(0));

        // ----------------------- LISTAR DETALHES ---------------------------
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("\n===== DETALHES DAS APRESENTAÇÕES =====\n");
        apRepo.todas().forEach(ap -> {
            Projeto p = ap.getProjeto();
            System.out.printf("Projeto: %s  (Nota Final: %.1f)%n", p.getTema(), p.getNotaFinal());
            System.out.printf("Equipe:  %s | Orientador: %s%n", p.getEquipe().getNome(), p.getOrientador().getNome());
            System.out.printf("Sala: %s | %s%n", ap.getLocal().getNome(), ap.getDataHora().format(fmt));
            System.out.println("=============================================================");
        });

        // ----------------------- FILTRAR PROJETOS APROVADOS ----------------
        System.out.println("PROJETOS APROVADOS");
        apRepo.todas().stream()
              .map(Apresentacao::getProjeto)
              .filter(p -> p.getNotaFinal() >= 7)
              .forEach(p -> System.out.printf("%s,  Nota: %.1f%n", p.getTema(), p.getNotaFinal()));
    }
}


