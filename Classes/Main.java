import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {

        //criando o objeto Univerisdade
        Instituicao pucMinas= new Instituicao("PUCMINAS", "Dom José Gaspar, 500", "(31) 3319-4225", "pucminas.com.br", "17.178.195/0001-67");

        //criando orientadores
        Profissional orientador1 = new Profissional("Ana", "111", "ana@puc.com", "9999-9991", pucMinas, "Professora", "ICEI");
        Profissional orientador2 = new Profissional("Carlos", "222", "carlos@puc.com", "9999-9992", pucMinas, "Professor", "Engenharia");

        //criando 5 estudantes pra cada 2 equipe
        List<Estudante> estudantes_da_equipe1 = new ArrayList<>();
        estudantes_da_equipe1.add(new Estudante("Gabriel", "111.111.111-11", "gabriel@pucminas.br", "(22) 99738-4221", pucMinas, "Engenharia de Software", 1, "147852"));
        estudantes_da_equipe1.add(new Estudante("João", "222.222.222-22", "joao@pucminas.br", "(22) 99738-4222", pucMinas, "Engenharia de Software", 1, "147853"));
        estudantes_da_equipe1.add(new Estudante("Lucas", "333.333.333-33", "lucas@pucminas.br", "(22) 99738-4223", pucMinas, "Engenharia de Software", 2, "147854"));
        estudantes_da_equipe1.add(new Estudante("Felipe", "444.444.444-44", "felipe@pucminas.br", "(22) 99738-4224", pucMinas, "Engenharia de Software", 2, "147855"));
        estudantes_da_equipe1.add(new Estudante("Thiago", "555.555.555-55", "thiago@pucminas.br", "(22) 99738-4225", pucMinas, "Engenharia de Software", 3, "147856"));

        Equipe equipe1 = new Equipe("Equipe 1", estudantes_da_equipe1);

        List<Estudante> estudantes_da_equipe2 = new ArrayList<>();
        estudantes_da_equipe2.add(new Estudante("Pedro", "666.666.666-66", "pedro@pucminas.br", "(22) 99738-4226", pucMinas, "Engenharia de Software", 1, "258961"));
        estudantes_da_equipe2.add(new Estudante("Rafael", "777.777.777-77", "rafael@pucminas.br", "(22) 99738-4227", pucMinas, "Engenharia de Software", 1, "258962"));
        estudantes_da_equipe2.add(new Estudante("Vinícius", "888.888.888-88", "vinicius@pucminas.br", "(22) 99738-4228", pucMinas, "Engenharia de Software", 2, "258963"));
        estudantes_da_equipe2.add(new Estudante("Eduardo", "999.999.999-99", "eduardo@pucminas.br", "(22) 99738-4229", pucMinas, "Engenharia de Software", 2, "258964"));
        estudantes_da_equipe2.add(new Estudante("André", "000.000.000-00", "andre@pucminas.br", "(22) 99738-4230", pucMinas, "Engenharia de Software", 3, "258965"));
        Equipe equipe2 = new Equipe("Equipe 2", estudantes_da_equipe2);


        // CRIAÇÃO DOS PROJETOS
        Projeto projeto1 = new Projeto("Sistema de Gestão Acadêmica", orientador1, equipe1, 79.00);
        Projeto projeto2 = new Projeto("Aplicativo de Saúde", orientador2, equipe2, 59.00);


        //criação dos jurados

        // CRIAÇÃO DOS JURADOS
        Jurado jurado1 = new Jurado("Carlos", "111.222.333-44", "carlos@empresa.com", "(31) 99999-0001", pucMinas, "Desenvolvedor Sênior", "TI", "Java");
        Jurado jurado2 = new Jurado("Marina", "222.333.444-55", "marina@empresa.com", "(31) 99999-0002", pucMinas, "Analista de Sistemas", "TI", "Banco de Dados");
        Jurado jurado3 = new Jurado("Andréia", "333.444.555-66", "andreia@empresa.com", "(31) 99999-0003", pucMinas, "Arquiteta de Software", "Engenharia", "Microserviços");
        Jurado jurado4 = new Jurado("Bruno", "444.555.666-77", "bruno@empresa.com", "(31) 99999-0004", pucMinas, "Líder Técnico", "TI", "DevOps");



        // MAPA DE JURADOS E NOTAS
        Map<Jurado, Integer> notasBanca1 = new HashMap<>();
        notasBanca1.put(jurado1, 8);
        notasBanca1.put(jurado2, 7);
        notasBanca1.put(jurado3, 9);
        notasBanca1.put(jurado4, 8);

        Banca banca1 = new Banca(projeto1, notasBanca1);


        // CRIAÇÃO DAS APRESENTAÇÕES
        Apresentacao apresentacao1 = new Apresentacao(projeto1, banca1, new Sala("Lab 01", 20), LocalDateTime.of(2025, 6, 20, 10, 0));

        // AVALIAR PROJETOS ATRAVÉS DA APRESENTAÇÃO 
        apresentacao1.avaliar(0); // nota será ignorada pela banca

        // LISTAR PROJETOS COM NOTA FINAL >= 7
        List<Projeto> todosProjetos = Arrays.asList(projeto1, projeto2);

        System.out.println("\nProjetos com nota final >= 7:");
        todosProjetos.stream()
                .filter(p -> p.getNotaFinal() >= 7)
                .forEach(p -> System.out.println("- " + p.getTema() + ": Nota " + p.getNotaFinal()));
        
    }
}
