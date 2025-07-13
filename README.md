# Blog App - Basic Backend (Spring Boot)

A simple yet robust RESTful API backend for a blog application built with Spring Boot. This project provides essential blogging functionality including user authentication, blog post management, and social features like comments and likes.

## 🚀 Features

- **User Authentication**: Secure user registration and login
- **Blog Management**: Create, read, update, and delete blog posts
- **Comments System**: Add and manage comments on blog posts
- **Likes System**: Like/unlike functionality for blog posts
- **RESTful API**: Clean and well-structured API endpoints
- **Data Validation**: Input validation and error handling
- **Security**: JWT-based authentication and authorization

## 🛠️ Tech Stack

- **Framework**: Spring Boot 3.x
- **Database**: MongoDB
- **Security**: Spring Security with JWT
- **ODM**: Spring Data MongoDB
- **Build Tool**: Maven
- **Java Version**: 17+

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+
- MongoDB database
- IDE (IntelliJ IDEA, Eclipse, VS Code)

## 🔧 Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/Lavish-code/BLOG_APP-BASIC-BACKEND-SPRINGBOO.git
   cd BLOG_APP-BASIC-BACKEND-SPRINGBOO
   ```

2. **Configure Database**
   - Update `application.properties` with your MongoDB connection:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/blog_app
   # OR if using MongoDB Atlas
   spring.data.mongodb.uri=mongodb+srv://username:password@cluster.mongodb.net/blog_app
   ```

3. **Install Dependencies**
   ```bash
   mvn clean install
   ```

4. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`

## 📚 API Endpoints

### Authentication
- `POST /api/auth/register` - Register a new user
- `POST /api/auth/login` - User login

### Blog Posts
- `GET /api/posts` - Get all blog posts
- `GET /api/posts/{id}` - Get a specific blog post
- `POST /api/posts` - Create a new blog post
- `PUT /api/posts/{id}` - Update a blog post
- `DELETE /api/posts/{id}` - Delete a blog post

### Comments
- `GET /api/posts/{postId}/comments` - Get comments for a post
- `POST /api/posts/{postId}/comments` - Add a comment to a post
- `DELETE /api/comments/{id}` - Delete a comment

### Likes
- `POST /api/posts/{postId}/like` - Like/unlike a post
- `GET /api/posts/{postId}/likes` - Get likes count for a post

## 🗂️ Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── blogapp/
│   │           ├── controller/     # REST Controllers
│   │           ├── service/        # Business Logic
│   │           ├── repository/     # Data Access Layer (MongoDB)
│   │           ├── model/          # MongoDB Documents
│   │           ├── dto/            # Data Transfer Objects
│   │           ├── config/         # Configuration Classes
│   │           └── security/       # Security Configuration
│   └── resources/
│       ├── application.properties
│       └── static/
└── test/
    └── java/                       # Unit Tests
```

## 🔐 Security Features

- JWT token-based authentication
- Password encryption using BCrypt
- Role-based authorization
- CORS configuration
- Input validation and sanitization

## 📝 Sample Request/Response

### Create a Blog Post
```json
POST /api/posts
{
  "title": "My First Blog Post",
  "content": "This is the content of my blog post...",
  "author": "John Doe"
}
```

### Response
```json
{
  "id": 1,
  "title": "My First Blog Post",
  "content": "This is the content of my blog post...",
  "author": "John Doe",
  "createdAt": "2024-01-15T10:30:00",
  "likesCount": 0,
  "commentsCount": 0
}
```

## 🧪 Testing

Run the test suite:
```bash
mvn test
```

## 📄 Configuration

Key configuration properties in `application.properties`:

```properties
# MongoDB Configuration
spring.data.mongodb.uri=mongodb://localhost:27017/blog_app
# OR for MongoDB Atlas
spring.data.mongodb.uri=mongodb+srv://username:password@cluster.mongodb.net/blog_app

# Application Configuration
server.port=8080
logging.level.org.springframework.data.mongodb=DEBUG

# JWT Configuration
jwt.secret=mySecretKey
jwt.expiration=86400000
```

## 🚀 Deployment

The application can be deployed on:
- Local server
- Cloud platforms (AWS, Azure, GCP)
- Docker containers
- Heroku

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📧 Contact

Lavish - [GitHub Profile](https://github.com/Lavish-code)

Project Link: [https://github.com/Lavish-code/BLOG_APP-BASIC-BACKEND-SPRINGBOO](https://github.com/Lavish-code/BLOG_APP-BASIC-BACKEND-SPRINGBOO)

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

⭐ If you found this project helpful, please give it a star on GitHub!
