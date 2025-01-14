
# Auth user com Spring Security

> Nesse projeto backend foi feita a autenticação de usuário e controle de permissões para que um admin possa cadastrar um produto. Feito com Java e seus frameworks, como o Spring Security, para garantir segurança na aplicação.

### Ajustes e melhorias

O projeto ainda está em desenvolvimento e as próximas atualizações serão voltadas para as seguintes tarefas:

- [x] Adicionar entidades, interfaces e DTOs do produto
- [x] Configurar a criação das tabelas no banco de dados
- [x] Configurar os repositórios
- [x] Terminar a criação do usuário
- [x] Comitar o projeto

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

- Você instalou a versão mais recente de Java (11 ou superior) e Maven.
- Você tem uma máquina com **Linux**, **Windows** ou **Mac**. (Compatível com todos os sistemas operacionais mais populares).
- Você leu a [documentação oficial do Spring Security](https://spring.io/projects/spring-security) para entender a configuração do projeto.

## 🚀 Instalando Auth User com Spring Security

Para instalar o projeto, siga estas etapas:

### Linux e macOS:

1. Clone o repositório:  
   ```
   git clone https://github.com/seu_usuario/nome_do_repositorio.git
   ```
2. Navegue até a pasta do projeto:
   ```
   cd nome_do_repositorio
   ```
3. Compile e execute o projeto:
   ```
   mvn clean install
   mvn spring-boot:run
   ```

### Windows:

1. Clone o repositório:
   ```
   git clone https://github.com/seu_usuario/nome_do_repositorio.git
   ```
2. Navegue até a pasta do projeto:
   ```
   cd nome_do_repositorio
   ```
3. Compile e execute o projeto:
   ```
   mvn clean install
   mvn spring-boot:run
   ```

## ☕ Usando Auth User com Spring Security

Para utilizar o projeto, siga estas etapas:

1. Inicie o servidor Spring Boot utilizando o Maven, conforme descrito acima.
2. Acesse a aplicação na URL: `http://localhost:8080`.
3. Para autenticar um usuário, faça uma requisição POST para o endpoint `/login` com as credenciais de um usuário registrado.
4. Após autenticar, se o usuário for um administrador, ele poderá cadastrar um produto utilizando o endpoint `/produto` (somente métodos POST, PUT, DELETE estão disponíveis para admins).

## 📫 Contribuindo para Auth User com Spring Security

Para contribuir com o projeto, siga estas etapas:

1. Bifurque este repositório.
2. Crie um branch: `git checkout -b <nome_branch>`.
3. Faça suas alterações e confirme-as: `git commit -m '<mensagem_commit>'`.
4. Envie para o branch original: `git push origin <nome_branch>`.
5. Crie a solicitação de pull.

Como alternativa, consulte a documentação do GitHub em [como criar uma solicitação pull](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).

## 📝 Feito por Pedro Souza.
