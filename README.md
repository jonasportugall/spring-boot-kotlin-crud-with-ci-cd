# 🚀 Spring Boot com Kotlin – CRUD + CI/CD + Docker

> **SPRING BOOT SEM USAR DIRETAMENTE O JAVA.**  
Já trabalhei com Spring Boot em alguns projetos usando Java como linguagem, mas descobri que é possível utilizá-lo com Kotlin também.  
Por isso, desenvolvi esta API básica com apenas 4 endpoints para mostrar como fica estruturado e como integrar tudo de forma moderna e automatizada.

## ✅ Tecnologias e Ferramentas Utilizadas

- **Kotlin + Spring Boot**
- **CI/CD com GitHub Actions**
- **Banco de dados PostgreSQL** (via [Neon](https://neon.tech))
- **Deploy usando Docker e [Render](https://render.com)**
- **Documentação da API com Swagger**
- **Código aberto + API pública acessível**

## 📌 Links Importantes

- 🔗 **API Pública:** [https://spring-boot-kotlin-with-ci-cd.onrender.com](https://spring-boot-kotlin-with-ci-cd.onrender.com)  
- 📘 **Documentação Swagger:** [https://spring-boot-kotlin-with-ci-cd.onrender.com/docs](https://spring-boot-kotlin-with-ci-cd.onrender.com/docs)

## 🚀 Como Executar Localmente com Docker

> **Pré-requisitos:**  
> - Docker instalado
> - Variável de ambiente `DATABASE_URL` configurada corretamente

### Passos:

1. **Build do projeto**
./gradlew build


Executar com Docker

docker build -t spring-kotlin-api .
docker run -p 8081:8081 -e DATABASE_URL=jdbc:postgresql://<seu_host_neon>/<nome_db>?user=<usuario>&password=<senha> spring-kotlin-api

A aplicação estará disponível em http://localhost:8081, e a documentação em http://localhost:8081/docs.




