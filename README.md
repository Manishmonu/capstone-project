# 🚀 Capstone Project

A full-stack web application built using **Spring Boot**, **Angular**, and **MySQL**. This project demonstrates modern web development practices including secure authentication, RESTful APIs, role-based authorization, and responsive UI design.

---

## 📌 Overview

The Capstone Project is designed to showcase end-to-end software development skills by implementing a scalable and secure web application. The application follows industry best practices with a layered architecture and clean code principles.

---

## ✨ Features

- 🔐 JWT Authentication & Authorization
- 👥 Role-Based Access Control (Admin/User)
- 📝 CRUD Operations
- 📊 Dashboard
- 🔍 Search & Filter Functionality
- 📱 Responsive UI
- ⚡ RESTful APIs
- ✅ Input Validation
- 📂 File Upload Support (Optional)
- 📈 Pagination & Sorting
- 🛡️ Spring Security Integration
- 📧 Email Notifications (Optional)

---

## 🛠️ Tech Stack

### Frontend
- Angular
- TypeScript
- HTML5
- CSS3
- Bootstrap / Angular Material

### Backend
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- REST API

### Database
- MySQL

### Tools
- Maven
- Git
- GitHub
- Postman
- IntelliJ IDEA / VS Code

---

## 🏗️ Project Architecture

```
Angular Frontend
        │
        ▼
REST API (Spring Boot)
        │
        ▼
Service Layer
        │
        ▼
Repository Layer (JPA)
        │
        ▼
MySQL Database
```

---

## 📂 Project Structure

### Backend

```
src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── config
 ├── security
 ├── exception
 └── util
```

### Frontend

```
src
 ├── app
 │    ├── components
 │    ├── services
 │    ├── models
 │    ├── guards
 │    ├── interceptors
 │    └── shared
 ├── assets
 └── environments
```

---

## 🔑 Authentication Flow

1. User Registration
2. User Login
3. JWT Token Generation
4. Token Validation
5. Access Protected APIs

---

## ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/yourusername/capstone-project.git
```

### Backend

```bash
cd backend

mvn clean install

mvn spring-boot:run
```

Backend runs on

```
http://localhost:8080
```

---

### Frontend

```bash
cd frontend

npm install

ng serve
```

Frontend runs on

```
http://localhost:4200
```

---

## 🗄️ Database Configuration

Update your `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/capstone
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

---

## 📸 Screenshots

Add screenshots here.

```
Login Page

Dashboard

Admin Panel

Profile

Reports
```

---

## 📌 API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | /auth/register | Register User |
| POST | /auth/login | Login |
| GET | /users | Get All Users |
| GET | /users/{id} | Get User |
| POST | /users | Create User |
| PUT | /users/{id} | Update User |
| DELETE | /users/{id} | Delete User |

---

## 🔒 Security

- JWT Authentication
- Password Encryption using BCrypt
- Spring Security
- Role-Based Authorization
- Exception Handling
- CORS Configuration

---

## 🧪 Testing

- Postman API Testing
- Unit Testing (JUnit)
- Integration Testing

---

## 🚀 Future Enhancements

- Docker Deployment
- Kubernetes Support
- CI/CD Pipeline
- AWS Deployment
- Email Verification
- Two-Factor Authentication
- Audit Logging
- Real-Time Notifications
- Report Generation
- Payment Integration

---

## 👨‍💻 Author

**Manish Halder**

- Full Stack Java Developer
- Spring Boot | Angular | Java | MySQL

---

## ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub.

---

## 📄 License

This project is licensed under the MIT License.
