FROM openjdk:11
EXPOSE 8085
ADD target/spring_jpa_mysql.jar spring_jpa_mysql.jar
ENTRYPOINT ["java","-jar","/spring_jpa_mysql.jar"]