set DB_URL=jdbc:postgresql://localhost/postgres
set DB_USERNAME=mypg
set DB_PASSWD=mypwd
#spring.datasource.username=
#spring.datasource.password=
spring.datasource.driver-class-name=org.postgresql.Driver

java -jar target\spring-boot-jdbc-conn-test-0.0.1.jar --spring.datasource.url=${DB_URL} --spring.datasource.username=${DB_USERNAME} --spring.datasource.password=${DB_PASSWD}