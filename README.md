# Hotel Management System

## Assignment 3: Structural Design Patterns

A comprehensive Spring Boot application demonstrating six structural design patterns in a real-world hotel management context.

---

## 🎯 Patterns Implemented

1. **Adapter** - Payment gateway integration (Stripe, PayPal, Square)
2. **Bridge** - Separate room abstraction from room types
3. **Composite** - Hotel hierarchy (Hotel > Floor > Room)
4. **Decorator** - Dynamic room amenities and features
5. **Facade** - Simplified booking operations
6. **Proxy** - Lazy loading and access control for room details

---

## 🚀 Quick Start

### Prerequisites
- Java 17+
- Maven 3.6+

### Run Application

```bash
cd Assignment3
mvn clean install
mvn spring-boot:run
```

### Access Points

- **Application**: http://localhost:8080
- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **H2 Console**: http://localhost:8080/h2-console
  - URL: `jdbc:h2:mem:hoteldb`
  - User: `sa`
  - Pass: `password`

---

## 📚 Documentation

See **[DOCUMENTATION.md](DOCUMENTATION.md)** for:
- Detailed pattern explanations
- Architecture diagrams
- API documentation
- Theoretical concepts
- Implementation details

---

## 🏗️ Project Structure

```
src/main/java/com/hotel/
├── HotelManagementApplication.java
├── entity/          # JPA Entities
├── dto/             # Data Transfer Objects
├── repository/      # Spring Data Repositories
├── service/         # Business Logic
├── controller/      # REST Controllers
├── pattern/         # Design Pattern Implementations
│   ├── adapter/     # Payment gateway adapters
│   ├── bridge/      # Room types bridge
│   ├── composite/   # Hotel hierarchy
│   ├── decorator/   # Room amenities decorators
│   ├── facade/      # Booking facade
│   └── proxy/       # Room detail proxy
├── util/            # Utilities
└── config/          # Configuration
```

---

## ✨ Features

- ✅ Multi-hotel management
- ✅ Room booking system
- ✅ Multiple payment gateways
- ✅ Dynamic room amenities
- ✅ Hotel hierarchy management
- ✅ Lazy loading of room details
- ✅ RESTful API
- ✅ Swagger documentation
- ✅ Database persistence

---

## 🎓 Learning Objectives

- Understand structural design patterns
- Apply patterns in real-world scenarios
- Integrate patterns with Spring Boot
- Implement clean architecture
- Use JPA/Hibernate for persistence
- Create RESTful APIs
- Apply SOLID principles

---

For detailed documentation, see [DOCUMENTATION.md](DOCUMENTATION.md)

