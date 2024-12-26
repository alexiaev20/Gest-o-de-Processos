# Gestão de Processos

## Descrição
Este projeto é uma aplicação Java baseada em Spring Boot para gestão de processos. Ele implementa funcionalidades para organização de categorias, tarefas e usuários, utilizando padrões RESTful para a comunicação e acesso aos dados. O projeto fornece documentação interativa da API utilizando Swagger.

## Tecnologias Utilizadas
- **Java 11+**
- **Spring Boot**
- **Maven** (para gerenciamento de dependências)
- **Banco de Dados** (configurado via `application.properties`)
- **Swagger** (para documentação da API)

## Estrutura do Projeto

- `src/main/java/gestao/deprocessos`:
  - **DeprocessosApplication.java**: Classe principal para execução da aplicação.
  - **controller**:
    - **CategoryController.java**: Endpoints para gerenciamento de categorias.
    - **TaskController.java**: Endpoints para gerenciamento de tarefas.
    - **UserController.java**: Endpoints para gerenciamento de usuários.
  - **modal**:
    - **Category.java**: Modelo representando categorias.
    - **Task.java**: Modelo representando tarefas.
    - **TaskCategory.java**: Modelo associando tarefas a categorias.
    - **User.java**: Modelo representando usuários.
  - **service**:
    - **TaskService.java**: Lógica de negócio para tarefas.
  - **repository**:
    - **CategoryRepository.java**: Interface para operações no banco de dados relacionadas a categorias.
    - **TaskRepository.java**: Interface para operações no banco de dados relacionadas a tarefas.
    - **UserRepository.java**: Interface para operações no banco de dados relacionadas a usuários.
  - **config**:
    - **CorsConfig.java**: Configurações de CORS.
    - **SecurityConfig.java**: Configurações de segurança.
    - **SwaggerConfig.java**: Configuração para integração com Swagger.

- `src/main/resources`:
  - **application.properties**: Configuração do banco de dados e outras propriedades do projeto.

- `pom.xml`: Arquivo para gerenciamento de dependências e configuração do Maven.

## Funcionalidades
1. **Gerenciamento de Categorias:** Criação, consulta, atualização e exclusão de categorias.
2. **Gerenciamento de Tarefas:** Controle total de tarefas com suporte a categorização.
3. **Gerenciamento de Usuários:** Criação e administração de perfis de usuários.
4. **Integração com Swagger:** Exploração dos endpoints da API.

## Como Executar

### Pré-requisitos
1. **Java 11+** instalado.
2. **Maven** instalado ou uso do wrapper (`mvnw` ou `mvnw.cmd`).

### Passos
1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd deprocessos
   ```
2. Compile o projeto:
   ```bash
   ./mvnw clean install
   ```
3. Execute a aplicação localmente:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Acesse a aplicação em:
   ```
   http://localhost:8080
   ```
5. Acesse a documentação Swagger em:
   ```
   http://localhost:8080/swagger-ui.html
   ```

## Configuração do Banco de Dados
Atualize o arquivo `application.properties` com as informações do seu banco de dados. Exemplo:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/deprocessos
spring.datasource.username=usuario
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
```

## Testes
Execute os testes para validar o funcionamento da aplicação:
```bash
./mvnw test
```

## Contribuições
Contribuições são bem-vindas! Siga os passos abaixo:
1. Faça um fork do repositório.
2. Crie um branch para sua feature ou correção:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça suas alterações e commit:
   ```bash
   git commit -m "Minha nova feature"
   ```
4. Envie o branch para o repositório remoto:
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request.



