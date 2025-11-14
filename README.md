# 🛍️ Produtos API

API RESTful simples feita com Spring Boot para gerenciar produtos.  
Inclui operações de CRUD completas e uso do banco em memória H2.

---

## 🚀 Tecnologias

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database

---

## ▶️ Como rodar o projeto

```
git clone https://github.com/seuusuario/produtosapi.git
./mvnw spring-boot:run
```

O servidor iniciará em:  
**http://localhost:8080**

---

## 📡 Endpoints

**GET /produtos**  
Lista todos os produtos

**GET /produtos/{id}**  
Retorna um produto pelo ID

**POST /produtos**  
Cria um novo produto  
Exemplo de JSON:

```
{
  "nome": "Mouse Gamer",
  "descricao": "RGB",
  "preco": 199.90
}
```

**PUT /produtos/{id}**  
Atualiza um produto existente

**DELETE /produtos/{id}**  
Remove um produto

---

## 🗄️ Como acessar o H2 Database

1. Inicie o projeto
2. Acesse: `http://localhost:8080/h2-console`
3. Insira os dados:
    - JDBC URL: `jdbc:h2:mem:testdb`
    - User: `sa`
    - Password: `password`
4. Clique em **Connect**

---

## 🔄 Descrição do fluxo

- O controller recebe as requisições REST
- O ProdutoRepository (Spring Data JPA) realiza operações no banco H2
- A criação de produto gera automaticamente um UUID como ID

---

## 📌 Status do projeto

- Em desenvolvimento
- Será expandido conforme avanço no aprendizado com Spring Boot
