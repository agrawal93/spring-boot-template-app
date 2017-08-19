# spring-template-app
Spring Boot Template Application - This is a spring boot template application which performs CRUD operations on company details.

## Technologies used
1. Spring Boot Framework
2. Tomcat (embedded)
3. Java 8
4. Maven Build Framework

## Configurations (Can be changed in src/main/resources/application.properties)
| Name | Description | Default |
|---|---|---|
| server.contextPath | The base URL to be allocated on deployment | /companies |
| server.port | The port on which the application needs to be deployed | 8080 |

## Default REST endpoints
- `` GET `` List all the companies and their details: `` http://<host>:<port>/<base-path> ``
- `` GET `` Details of a specific company: `` http://<host>:<port>/<base-path>/{companyId} ``
- `` POST `` Create new company details: `` http://<host>:<port>/<base-path> ``
- `` PUT `` Update existing company details: `` http://<host>:<port>/<base-path>/{companyId} ``
- `` DELETE `` Delete existing company details: `` http://<host>:<port>/<base-path>/{companyId} ``

## How to run
1. Clone the repository: `` git clone https://github.com/agrawal93/spring-template-app.git && cd spring-template-app ``
2. Build the project: `` mvn clean install ``
3. Run the project: `` java -jar target/spring-template-app-1.0.0.jar ``
4. Access the REST APIs at `` http://localhost:8080 ``
