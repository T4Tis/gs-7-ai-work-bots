# Global Solution — API

**Nome:** Isaac Maranho Destro
**RM:** 97847

## Descrição do tema
> Explora a implementação de agentes IA que atuam como 'copilotos' no meio corporativo. Sendo o objetivo automatizar tarefas repetitivas e fornecendo feedback em tempo real, permitindo que os humanos foquem em outras coisas mais importantes.

## finalidade da API
API desenvolvida como parte da avaliação Global Solution. A aplicação foca no tema "Bots e agentes de IA como parceiros no dia a dia de trabalho", fornecendo um endpoint público (/info) que retorna os dados do grupo responsável e a descrição do tema escolhido.

## Instruções de execução local
Baixe e execute a imagem diretamente do Docker Hub Executar no terminal:
```bash
docker run -p 8081:8081 t4tsi/gs-7-ai-work-bots:latest
```

## Acessar a aplicação:
Endpoint JSON: http://localhost:8081/info
Documentação Swagger: http://localhost:8081/swagger-ui.html

## URL da imagem no Docker Hub
https://hub.docker.com/r/t4tsi/gs-7-ai-work-bots

## Descrição dos workflows CI/CD

### 1. Versioning (Release Please)
- Arquivo: .github/workflows/versioning.yml 

- Gatilho: Push na branch main.

- Função: Utiliza a action googleapis/release-please-action. O workflow analisa as mensagens de commit, cria automaticamente um Pull Request de Release, atualiza a versão no pom.xml, gera o CHANGELOG.md e cria as Tags de versão (ex: v1.0.0) no GitHub.

### 2. Continuous Integration (CI)
- Arquivo: .github/workflows/ci.yml

- Gatilho: Push nas branches feature/**, release e hotfix.

- Função: Garante a integridade do código.

- Configura o ambiente Java 17.

- Executa o build da aplicação com Maven.

- Roda todos os testes unitários (mvn test).

- Verifica se a imagem Docker pode ser construída sem erros.

### 3. Continuous Delivery (CD)
- Arquivo: .github/workflows/cd.yml

- Gatilho: Pull Request aberto para a branch develop.

- Função: Automatiza a entrega da aplicação.

- Realiza o login seguro no Docker Hub usando Secrets.

- Constrói a imagem Docker final.

- Faz o push da imagem atualizada para o repositório público no Docker Hub com a tag latest.