# 💰 Projeto Conta Corrente

Este repositório abriga o projeto **Conta Corrente**, desenvolvido como parte das disciplinas de **Técnicas de Programação I e II** do curso de **Desenvolvimento de Software Multiplataforma (DSM)** na **Fatec Votorantim**.

O projeto simula um sistema bancário de conta corrente com funcionalidades essenciais, como movimentações financeiras, gerenciamento de clientes e agências, e controle de usuários, integrando-se a um banco de dados relacional.

---

## 📚 Tecnologias Utilizadas

- **Linguagem:** Java  
- **Interface Gráfica:** Swing  
- **Banco de Dados:** SQL Server / MySQL  
- **IDE Recomendada:** NetBeans (com Ant como sistema de build)

---

## 📦 Bibliotecas Necessárias

Para o correto funcionamento da aplicação, é necessário adicionar as seguintes bibliotecas ao projeto:

| Biblioteca           | Versão            |
|----------------------|-------------------|
| `mssql-jdbc`         | 12.8.1.jre11       |
| `mysql-connector-j`  | 8.4.0              |
| `rs2xml`             | latest (mais recente) |

---

## ⚙️ Execução do Projeto

1. Clone este repositório:
   ```bash
   git clone https://github.com/RyanCNP/ProjetoContaCorrente.git
Abra o projeto no NetBeans.

Adicione os JARs mencionados acima à biblioteca do projeto.

Configure a conexão com o banco de dados no código, conforme o tipo de banco escolhido (MySQL ou SQL Server).

Execute o script Script da DataBase.sql para criar as tabelas e estrutura inicial.

Para testes, utilize o script Dados de Teste.sql.

# 🗃️ Estrutura do Projeto
src/ – Código-fonte Java da aplicação

build.xml – Script de build (Ant)

Script da DataBase.sql – Estrutura do banco de dados

Dados de Teste.sql – Dados para teste da aplicação

README.md – Este documento

LICENSE – MIT

# 📜 Licença
Este projeto está licenciado sob os termos da licença MIT.

# 🤝 Agradecimentos
A todos os docentes envolvidos na disciplina e aos colegas que contribuíram para o desenvolvimento deste projeto.
