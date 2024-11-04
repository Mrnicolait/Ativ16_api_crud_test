Atividade 16 - Praticando Testes Unitários

Objetivo: Desenvolver uma API REST simples em Spring Boot com funcionalidades CRUD (Create, Read, Update, Delete) e implementar testes unitários para garantir 
a confiabilidade e a integridade das operações.
Descrição da Atividade:
Crie uma API RESTful para gerenciar uma lista de produtos. Cada produto deverá ter os seguintes atributos:

    ID
    Nome
    Descrição
    Preço
    Quantidade em Estoque

A API deverá ter endpoints para as operações CRUD:

    Create: Adicionar um novo produto.
    Read: Recuperar a lista de produtos e buscar um produto específico por ID.
    Update: Atualizar as informações de um produto existente.
    Delete: Remover um produto do sistema.

Requisitos Técnicos:

    Utilize Spring Boot e as anotações do Spring (ex: @RestController, @Service, @Repository).
    A API deverá se conectar a um banco de dados em memória (ex: H2 Database) para persistir os dados durante a execução.
    Crie testes unitários para cada operação usando JUnit e Mockito, garantindo que todos os métodos sejam testados de forma isolada.
    Implemente boas práticas de arquitetura em camadas: controller, service e repository.
    A API deverá retornar respostas JSON.

Critérios de Avaliação:

    Funcionalidade: Todos os endpoints CRUD estão funcionando conforme esperado.
    Qualidade dos Testes: Os testes unitários cobrem todas as operações CRUD, com validações de sucesso e cenários de erro.
    Organização e Boas Práticas: O código segue uma estrutura organizada e é documentado.
