## API REST para Cadastro de Clientes com Endereço

Este projeto consiste em uma API REST desenvolvida com Spring Framework para cadastro de clientes com seus respectivos endereços. A aplicação utiliza a API do ViaCEP para buscar informações de CEPs que não estejam presentes no banco de dados.

**Funcionalidades:**

* Cadastro de clientes com nome, CPF e endereço.
* Validação de CPF para garantir a unicidade.
* Integração com a API do ViaCEP para preenchimento automático de endereço a partir do CEP.
* Persistência de dados em banco de dados (especifique qual banco de dados você utilizou).

**Padrões de Projeto:**

* **Singleton:** Utilizado para garantir uma única instância de classes de serviço, como a classe de integração com a API do ViaCEP.
* **Strategy:** Implementado para permitir diferentes estratégias de busca de CEP (local e via API externa).
* **Facade:** Simplifica a interface de acesso às funcionalidades de cadastro de clientes e endereços.

**Tecnologias:**

* ☕ Java
*🍃 Spring Framework (Spring Boot, Spring Data JPA, Spring Web)
* 💾 Banco de dados (H2 em memória)
* 📫 API ViaCEP
* 🔨 Maven

**Como executar o projeto:**

1. Clone o repositório: `git clone https://github.com/greglixandrao/design-patterns-spring.git`
2. Configure as propriedades do banco de dados no arquivo `application.properties`.
3. Execute o projeto através da sua IDE ou via linha de comando.

**Endpoints da API:**

* **POST /clientes:** Cadastra um novo cliente.
* **GET /clientes/{id}:** Busca um cliente pelo ID.
* **PUT /clientes/{id}:** Atualiza os dados de um cliente.
* **DELETE /clientes/{id}:** Exclui um cliente.

**Observações:**

* Este projeto foi desenvolvido durante o Bootcamp da DIO em parceria com a Claro.


**Autor:**

* Greg Lixandrão
* [LinkedIn](https://www.linkedin.com/in/gregorio-lixandrao/)
* [GitHub](https://github.com/greglixandrao)
