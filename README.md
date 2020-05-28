# Spring Boot with Flyway

##Introduction
This is an example written in Kotlin that shows how you can set up Spring Boot with Flyway

## Build project
````mvn clean install````

## Run The application
### From terminal
````mvn spring-boot:run````
### From IntelliJ
Run the main method in [KotlinSpringFlywayApplication](src/main/kotlin/com/example/code/KotlinSpringFlywayApplication.kt)

## Configuration
    spring.datasource.url Database URL
    spring.datasource.username Database username 
    spring.datasource.password Database username
        
## Flyway 
### Create new versions
The migration sql files are located under [resources](src/main/resources) in the migration folder. The syntax for the 
migration files is V<Version number>__<description>.sql. 

### Reset migration 
To rerun a full or partial migration, delete the necessary rows from *flyway_schema_history* table that is created by
Flyway. 

### Migration file location
By default Spring Boot searches for Flyway migration files in classpath:db/migration. If you want to change the location
of the migration files, add the following line in the application.yaml ``spring.flyway.locations:<location>``

## Additional information 
More information on how to set up Flyway with Spring Boot ca be found [here](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#howto-execute-flyway-database-migrations-on-startup)