# Konserin BE
# 🎟️ Konserin - Concert Ticketing Application
Konserin – Concert &amp; Event Ticketing Platform Konserin is a full-featured web application that enables users to browse, purchase, and manage tickets for concerts and live events. Designed with a flexible payment system (top-up balance or pay directly via Midtrans), Konserin provides a seamless and secure ticketing experience.

**Konserin** is a modern web-based platform for discovering, managing, and purchasing concert tickets. Designed with a multi-role system (Admin, Event Organizer, and User), Konserin aims to deliver a seamless and secure experience for both organizers and attendees.

## 🚀 Features

- 🔐 **Authentication & Authorization**
  - User registration, login, and role-based access control
- 🗓️ **Event Management**
  - Create, edit, delete events
  - Support for various event categories
- 🎫 **Multiple Ticket Types**
  - Presale, Regular, VIP, etc.
- 💳 **Flexible Payment System**
  - Pay directly or via top-up balance
- 📊 **Admin & Organizer Dashboards**
  - Sales statistics, user management
- 📱 **Responsive Design**
  - Optimized for both desktop and mobile

## 🧱 Tech Stack

| Backend       | Frontend        | Database   | Tools                    |
|---------------|-----------------|------------|--------------------------|
| Spring Boot   | React.js        | PostgreSQL | Docker, Postman, Git     |

## 🗂️ Project Structure
```
src/
 └── main/
     └── java/
         └── com.ticket.konserin/
             ├── config/        # Configuration files (CORS, Web, etc.)
             ├── controller/    # REST Controllers (User, Event, Ticket)
             ├── exception/     # Custom exceptions & handlers
             ├── model/         # Entity & DTO classes
             ├── repository/    # Spring Data JPA Repositories
             ├── security/      # JWT, Auth filters, and security config
             ├── service/       # Service interfaces
             │   └── implement/ # Service implementations
             ├── utils/         # Utility/helper classes
             └── KonserinApplication.java # Main Spring Boot application
     └── resources/
         └── application.properties # App configuration
```

---

## 🚀 Features

- 🧑‍💼 **Multi-role system**: Admin, Event Organizer, and User
- 🗓️ Event creation and ticket type management (VIP, Presale, etc.)
- 🔐 Secure authentication & authorization (JWT-based)
- 📈 Dashboard with ticket statistics and sales overview
- 💳 Payment-ready architecture (can integrate with Midtrans or similar)
- ⚙️ Clean separation between layers (Controller - Service - Repository)

---

## 🛠️ Tech Stack

| Layer        | Technology               |
|--------------|---------------------------|
| Backend      | Java Spring Boot          |
| Database     | PostgreSQL                |
| Security     | Spring Security + JWT     |
| Build Tool   | Maven                     |
| IDE          | IntelliJ IDEA             |

---

## ⚙️ Running the Project

### Prerequisites
- Java 17+
- Maven
- PostgreSQL

### Backend
```bash
# Navigate to backend folder (if separated)
./mvnw spring-boot:run

👨‍💻 Authors
@saydova
