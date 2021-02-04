# TaskApp
Web were you regist tasks.

In this application you can log in or register an account. In case you register an account, you can create your first task and that information will be stored in a mysql database. 

Once you log in, you should be able to see your lists of tasks. Where you could create more, edit or delete a task.

This application make use of the following dependencies:
  - org.springframework.boot
      -->  spring-boot-starter-data-jpa
      -->  spring-boot-starter-thymeleaf
      -->  spring-boot-starter-web
      -->  spring-boot-starter-web-services
      --> spring-boot-devtools
      --> spring-boot-starter-test
 
  - mysql
      -->  mysql-connector-java

You can watch this info with more detail in the pom.xml

To add your own database you should access to the folder src\main\resources\application.properties. There you should introduce yout own username and password.
* In the folowing field: spring.datasource.url=jdbc:mysql://localhost:3306/task_application?serverTimezone=UTC, where you see task_application you should put the name             of the schema you want to use.

You must run the application as 'Spring Boot App'
Make sure that your database is connected before run the application.


