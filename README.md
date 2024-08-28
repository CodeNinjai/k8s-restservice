
# k8s-restservice

k8s-restservice is a simple Kotlin-based Spring Boot application that provides a REST API endpoint returning "Hello World" as a response. This project is designed to demonstrate basic Spring Boot functionality and Docker integration.

## Table of Contents

- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Building and Running Locally](#building-and-running-locally)
- [Running with Docker](#running-with-docker)
- [API Endpoints](#api-endpoints)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

These instructions will help you set up and run the HelloWorldService on your local machine for development and testing purposes.

### Prerequisites

- [JDK 17](https://www.oracle.com/java/technologies/javase-jdk22-downloads.html) or later
- [Gradle](https://gradle.org/install/) (or use the Gradle wrapper provided)
- [Docker](https://www.docker.com/get-started) (if running with Docker)

### Building and Running Locally

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/helloworldservice.git
   cd helloworldservice
   ```

2. **Build the project:**

   ```bash
   ./gradlew build
   ```

3. **Run the application:**

   ```bash
   ./gradlew bootRun
   ```

4. **Access the application:**

   Visit `http://localhost:8080/api/hello` in your browser or use a tool like `curl`:

   ```bash
   curl http://localhost:8080/api/hello
   ```

   You should see the response: `Hello World`

### Running with Docker

1. **Build the Docker image:**

   ```bash
   docker build -t helloworldservice:latest .
   ```

2. **Run the Docker container:**

   ```bash
   docker run -p 8080:8080 helloworldservice:latest
   ```

3. **Access the application:**

   Visit `http://localhost:8080/api/hello` in your browser or use a tool like `curl`:

   ```bash
   curl http://localhost:8080/api/hello
   ```

### API Endpoints

The HelloWorldService provides the following endpoint:

- `GET /api/hello` - Returns "Hello World".

### Configuration

The application can be configured via the `application.properties` or `application.yml` file located in the `src/main/resources` directory.

#### Example `application.properties`:

```properties
server.port=8080
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

### Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature-name`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature/your-feature-name`).
5. Create a new Pull Request.

### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
