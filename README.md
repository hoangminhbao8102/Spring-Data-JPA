# Spring-Data-JPA

## 📌 Giới thiệu
**SpringJpaDemo** là một ứng dụng web mẫu được xây dựng bằng **Java Spring Boot** với mục tiêu minh họa các tính năng **Spring Data JPA cơ bản và nâng cao**.  
Ứng dụng cho phép quản lý sản phẩm (CRUD) và áp dụng các kỹ thuật như:
- Repository Pattern.
- Truy vấn tùy chỉnh với `@Query`.
- Sử dụng DTO để tối ưu dữ liệu trả về.
- Phân trang (`Pageable`) và sắp xếp (`Sort`).
- Mapping quan hệ giữa các entity.

---

## 🚀 Yêu cầu hệ thống
- **Java**: 17 trở lên
- **Maven**: 3.9.x
- **SQL Server**: 2019 hoặc mới hơn
- **IDE**: IntelliJ IDEA / NetBeans / Eclipse (khuyến nghị IntelliJ hoặc NetBeans)
- **Spring Boot**: 3.3.2

---

## 🛠 Công nghệ sử dụng
- **Spring Boot** (Web, Thymeleaf, Data JPA)
- **Hibernate ORM**
- **Microsoft SQL Server JDBC Driver**
- **Thymeleaf** cho View
- **Maven** để quản lý dependency

---

## 📂 Cấu trúc thư mục

```css
src/
├── main/
│ ├── java/
│ │ └── com.mycompany.springjpademo
│ │ ├── controller/ # Controller xử lý request
│ │ ├── dto/ # Data Transfer Objects
│ │ ├── model/ # Các Entity (JPA)
│ │ ├── repository/ # Repository interfaces
│ │ ├── service/ # Service interfaces & implementations
│ │ └── SpringJpaDemoApplication.java
│ └── resources/
│ ├── templates/ # Giao diện Thymeleaf
│ │ └── product/ # list.html, form.html
│ ├── application.properties
│ └── static/ # (nếu có file CSS/JS)
└── test/ # Unit tests (nếu có)
```

---

## ⚙️ Cấu hình `application.properties`
```properties
spring.application.name=SpringJpaDemo
server.port=8080
# server.servlet.context-path=/SpringJpaDemo  # Bỏ nếu muốn truy cập trực tiếp /products

spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=SpringJpaDemo;encrypt=true;trustServerCertificate=true
spring.datasource.username=sa
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.SQLServerDialect

spring.thymeleaf.encoding=UTF-8
spring.thymeleaf.cache=false
spring.web.encoding.charset=UTF-8
spring.web.encoding.force=true
```

---

## 📦 Cài đặt & Chạy ứng dụng
1. Clone repository
```bash
git clone https://github.com/your-username/SpringJpaDemo.git
cd SpringJpaDemo
```

2. Cấu hình cơ sở dữ liệu
- Tạo database mới trong SQL Server:

```sql
CREATE DATABASE SpringJpaDemo;
```

- Cập nhật thông tin kết nối trong `application.properties`.

3. Chạy ứng dụng
Cách 1 – JAR (khuyến nghị)

```bash
mvn clean spring-boot:run
```

Truy cập: http://localhost:8080/products

Cách 2 – WAR trên Tomcat 10.1

- Đóng gói WAR:

```bash
mvn clean package
```

- Copy file WAR trong target/ vào thư mục webapps/ của Tomcat 10.1.

- Truy cập: http://localhost:8080/SpringJpaDemo/products

## 🖥 Các tính năng chính
- Quản lý sản phẩm (CRUD): thêm, sửa, xóa, xem danh sách.

- Tìm kiếm sản phẩm theo tên.

- Truy vấn nâng cao với @Query và DTO.

- Phân trang và sắp xếp danh sách sản phẩm.

- Giao diện web với Thymeleaf.

## 📜 License
Dự án được phát hành theo giấy phép MIT License.

---
