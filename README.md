# Sistema de Gerenciamento de Hackathon Universitário

Este repositório contém a **Trabalho Avaliativo** para um sistema que gerencia as equipes e projetos de um Hackathon Universitário anual, envolvendo universidades parceiras.  
O foco inicial está na modelagem de **Projetos**, **Equipes** e suas relações, além do cálculo das notas atribuídas pelos jurados.

---

## ✨ Funcionalidades Pedidas

| Funcionalidade | Descrição resumida |
|----------------|--------------------|
| **Gerenciar Equipes** | Cadastro de equipes e de seus alunos (5 por equipe, no cenário de exemplo). |
| **Gerenciar Projetos** | Vínculo “1:1” de cada equipe a um projeto. |
| **Gerenciar Apresentações** | Cada projeto é avaliado por uma banca de 4 jurados. |
| **Cálculo de Nota Final** | Média simples das 4 notas dadas pelos jurados. |
| **Listagem de Aprovados** | Exibe apenas projetos com **nota final ≥ 7**, usando _Streams_. |

---

## 🗂️ Organização de Classes

> O diagrama UML completo deve ser implementado seguindo esta estrutura básica:

- `Aluno`
- `Equipe`
- `Projeto`
- `Apresentacao`
- **Coleções Singleton**  
  - `Equipes` – mantém _uma única_ lista de `Equipe`  
  - `Apresentacoes` – mantém _uma única_ lista de `Apresentacao`

Cada classe de coleção **segue o padrão _Singleton_**, garantindo uma única instância acessível em todo o sistema e fornecendo métodos para.

