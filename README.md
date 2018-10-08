# Flyway-demo app
A sample project to demonstrate db migration using flyway library
## Getting started
Install necessary tools like Java, Gradle, Maven
### Running
```
gradlew clean bootrun
```
This should run the app migrating all the sql files found in the directory ```db/migration```

New database migrations should be added by creating new sql file with new version number.
Example, ```V4__new_table_created.sql```

Navigate to ```http://localhost:8080/console``` to visualize the h2 database.
Connection string is, ```jdbc:h2:file:<directory>/flyway-demo/db/books```
