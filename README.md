# spring-boot-template-app
Spring Boot Template Application - This is a spring boot template application which performs CRUD operations on company details.

## Technologies used
1. Spring Boot Framework
2. Tomcat (embedded)
3. Java 8
4. Maven Build Framework
5. Java Persistence API and Apache Derby (for persistency)

## Configurations (Can be changed in src/main/resources/application.properties)
| Name | Description | Default |
|---|---|---|
| server.contextPath | The base URL to be allocated on deployment | /companies |
| server.port | The port on which the application needs to be deployed | 8080 |

## Default REST endpoints
- `` GET `` List all the companies and their details: `` http://<host>:<port>/<base-path> ``
- `` GET `` Details of a specific company: `` http://<host>:<port>/<base-path>/{companyId} ``
- `` POST `` Create new company details: `` http://<host>:<port>/<base-path> ``
  - Request Body:
    ```
    {
      "name": <string - name of the company>,
      "description": <string - description of the company>,
      "logo": <string - base64 encoded image>,
      "fundingDetails": [
        {
          "amount": <long - funding amount>,
          "date": <date - funding date>,
          "stage": <string - stage>,
          "investor": <string - investor>
        }
      ],
      "markets": [
        <string - markets>, ...
      ],
      "foundedOn": <date - founded on>,
      "website": <string - link to website>,
      "socialInformation": {
        "email": <email>,
        "phoneNumber": <phone>,
        "linkedIn": <linkedIn profile>,
        "twitter": <twitter handle>,
        ...
        <additional-key-value-pairs>
      }
    }
    ```
- `` PUT `` Update existing company details: `` http://<host>:<port>/<base-path>/{companyId} ``
  - Request Body:
    ```
    {
      "id": <string - companyId as in the url>,
      "name": <string - name of the company>,
      "description": <string - description of the company>,
      "logo": <string - base64 encoded image>,
      "fundingDetails": [
        {
          "id": <int - funding id (if any)>,
          "amount": <long - funding amount>,
          "date": <date - funding date>,
          "stage": <string - stage>,
          "investor": <string - investor>
        }
      ],
      "markets": [
        <string - markets>, ...
      ],
      "foundedOn": <date - founded on>,
      "website": <string - link to website>,
      "socialInformation": {
        "email": <email>,
        "phoneNumber": <phone>,
        "linkedIn": <linkedIn profile>,
        "twitter": <twitter handle>,
        ...
        <additional-key-value-pairs>
      }
    }
    ```
- `` DELETE `` Delete existing company details: `` http://<host>:<port>/<base-path>/{companyId} ``

## How to run
1. Clone the repository: `` git clone https://github.com/agrawal93/spring-template-app.git && cd spring-template-app ``
2. Build the project: `` mvn clean install ``
3. Run the project: `` java -jar target/spring-template-app-1.0.0.jar ``
4. Access the REST APIs at `` http://localhost:8080 ``
