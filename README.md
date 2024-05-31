# Estructura de Carpetas
    my-hexagonal-app
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── com
    │   │   │       └── example
    │   │   │           └── myhexagonalapp
    │   │   │               ├── application
    │   │   │               │   ├── service
    │   │   │               │   │   └── MyService.java
    │   │   │               │   ├── dto
    │   │   │               │   │   └── MyDto.java
    │   │   │               │   └── port
    │   │   │               │       └── in
    │   │   │               │           └── MyUseCase.java
    │   │   │               ├── domain
    │   │   │               │   ├── model
    │   │   │               │   │   └── MyEntity.java
    │   │   │               │   ├── port
    │   │   │               │   │   └── MyRepositoryPort.java
    │   │   │               │   └── service
    │   │   │               │       └── MyDomainService.java
    │   │   │               └── infrastructure
    │   │   │                   ├── adapter
    │   │   │                   │   ├── repository
    │   │   │                   │   │   └── MyRepository.java
    │   │   │                   │   ├── out
    │   │   │                   │   │   └── MyRepositoryAdapter.java
    │   │   │                   │   └── in
    │   │   │                   │       └── MyController.java
    │   │   │                   ├── config
    │   │   │                   │   └── MyAppConfig.java
    │   │   │                   └── deploy
    │   │   │                       └── deploymentConfig.yaml
    │   │   └── resources
    │   │       └── application.properties
    └── build.gradle

# Descripción de Archivos
## Capa de Aplicación (application)
- ***Service (MyService.java)***: Contiene la lógica de aplicación, orquesta los casos de uso y maneja los flujos de la aplicación.
- ***DTO (MyDto.java)***: Objetos de transferencia de datos utilizados para mover datos entre la capa de aplicación y otras capas.
- ***Port In (MyUseCase.java)***: Interfaces que definen los casos de uso de la aplicación. Son utilizados por la capa de infraestructura para interactuar con la lógica de aplicación.
## Capa de Dominio (domain)
- ***Model (MyEntity.java)***: Contiene las entidades del dominio, que representan los objetos y sus relaciones en el negocio.
- ***RepositoryPort (MyRepository.java)***: Interfaces para la persistencia de las entidades del dominio.
- ***Service (MyDomainService.java)***: Contiene la lógica de negocio pura, independiente de la infraestructura.
## Capa de Infraestructura (infrastructure)
- ***Adapter repository (MyRepository.java)***: Interfaces de repositorio con implementaciones concretas de la base de datos u otros sistemas externos.
- ***Adapter Out (MyRepositoryAdapter.java)***: Implementaciones de las interfaces de repositorio que interactúan con la base de datos u otros sistemas externos.
- ***Adapter In (MyController.java)***: Controladores REST que exponen la API de la aplicación.
- ***Config (MyAppConfig.java)***: Archivos de configuración, incluyendo configuraciones de Spring Boot.

### *Este ejemplo muestra una estructura básica de una aplicación con arquitectura hexagonal utilizando Spring Boot. Cada capa tiene una responsabilidad clara y está desacoplada de las demás, permitiendo flexibilidad y facilidad de mantenimiento.*
