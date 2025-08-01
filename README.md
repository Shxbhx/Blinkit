# 🛒 Blinkit Backend – Spring Boot CRUD API

A simple Spring Boot-based Java project simulating core backend operations of a Blinkit-like application (grocery delivery service). This project performs full **CRUD operations** on categories such as **Groceries, Electronics, and Clothes**, without any frontend. API testing is done via **Postman**.

---

## 📌 Features

- ✅ RESTful APIs built with Spring Boot  
- ✅ CRUD operations for each product category  
- ✅ In-memory or MySQL DB (based on config)  
- ✅ Data access with Spring Data JPA  
- ✅ Easy testing with Postman (POST/GET/PUT/DELETE)

---

---

## 🔧 Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- MySQL / H2 Database (selectable)
- Lombok
- Postman

---

## 🧪 Sample Endpoints (Test via Postman)

### ✅ Add New Product (POST)
**URL:** `http://localhost:8080/api/cloths`  
**Method:** `POST`  
**Body (JSON):**
```json
{
  "id" : "1"
  "name": "T-Shirt",
  "description": "Cotton t-shirt",
  "price": 499.99,
  "quantity": 10
}
