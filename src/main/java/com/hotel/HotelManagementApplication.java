package com.hotel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Application Class for Hotel Management System
 * 
 * This application demonstrates the implementation of structural design patterns:
 * 1. Adapter - Payment gateway integration
 * 2. Bridge - Room types and implementations
 * 3. Composite - Hotel hierarchy (Hotel > Floor > Room)
 * 4. Decorator - Room amenities and features
 * 5. Facade - Simplified booking operations
 * 6. Proxy - Lazy loading and access control for rooms
 * 
 * @author Software Architecture Course
 * @version 1.0
 */
@Slf4j
@SpringBootApplication
public class HotelManagementApplication {

    public static void main(String[] args) {
        log.info("╔════════════════════════════════════════════════════════════╗");
        log.info("║   Hotel Management System Starting...                     ║");
        log.info("╚════════════════════════════════════════════════════════════╝");
        
        SpringApplication.run(HotelManagementApplication.class, args);
        
        log.info("");
        log.info("✅ Application started successfully!");
        log.info("📄 Swagger UI: http://localhost:8080/swagger-ui.html");
        log.info("🗄️  H2 Console: http://localhost:8080/h2-console");
        log.info("   JDBC URL: jdbc:h2:mem:hoteldb");
        log.info("   Username: sa");
        log.info("   Password: password");
        log.info("");
    }
}

