# GradeFlow

GradeFlow est une API RESTful développée avec Spring Boot pour la gestion des notes étudiantes.  
Elle permet de gérer les étudiants, les cours, les notes et de générer des rapports de moyennes.

## 🚀 Fonctionnalités

- 🔹 CRUD Étudiants
- 🔹 CRUD Cours
- 🔹 CRUD Notes
- 📊 Moyenne des notes par étudiant
- 📊 Moyenne des notes par cours

## 📦 Technologies

- Java 17
- Spring Boot 3
- Spring Data JPA
- MySQL
- Lombok

## 🔌 Endpoints principaux

### Étudiants
- `POST /students`
- `GET /students`
- `GET /students/{id}`
- `PUT /students/{id}`
- `DELETE /students/{id}`

### Cours
- `POST /courses`
- `GET /courses`
- `GET /courses/{id}`
- `PUT /courses/{id}`
- `DELETE /courses/{id}`

### Notes
- `POST /grades`
- `GET /grades/student/{studentId}`
- `GET /grades/course/{courseId}`
- `PUT /grades/{id}`
- `DELETE /grades/{id}`

### Rapports
- `GET /reports/student/{studentId}`
- `GET /reports/course/{courseId}`

## 🛠 Configuration

Configurez votre `application.properties` avec vos identifiants MySQL :
```
spring.datasource.url=jdbc:mysql://localhost:3306/gradeflow_db
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

## 🧰 Lancer le projet

```bash
./mvnw spring-boot:run
```

## 📫 Déploiement

Une fois le projet terminé, poussez-le sur GitHub ou GitLab et envoyez le lien à :  
**paillard.pierre@gmail.com**
