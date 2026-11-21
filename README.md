# Eat Healthy App (Backend)

A backend application for managing recipes and shopping lists, built with Java and Spring Boot. Its main purpose is to simplify daily diet management. The application was developed for educational purposes and uses the [FoodData Central API](https://fdc.nal.usda.gov/api-guide) to retrieve up-to-date nutritional information about food products, such as calories, protein content, and other nutrients.

## Architecture

The application follows a hexagonal architecture and is organized into the following packages:

- **adapter** - Contains implementations of ports that connect the application's business logic to external systems and frameworks, such as JPA.
- **application** - Contains the business logic, organized into individual use cases.
- **domain** - Defines the core business domain, including domain models and ports.


### Dependency Management & CI/CD

The project uses GitHub Actions workflows to implement a simple CI/CD pipeline:

- **ci.yml** - Builds the application and runs automated tests.
- **cd.yml** - Automates versioning and release creation using `googleapis/release-please-action`. It also creates a Git tag and attaches the generated JAR file to the GitHub release.

The project also uses Dependabot to automatically manage dependency updates.
