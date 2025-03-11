#EMS(Employee Management System)

#HOW TO RUN THIS PROJECT?# ###FROM THE IDE:###

Open the project in an IDE like STS.

You can run the DBScript provided in MySQL to create database and tables with basic values. (Creating database is necessary since hibernate- update option is used : "spring.jpa.hibernate.ddl-auto = update")

In case you do not want to run file, you can change the line "spring.jpa.hibernate.ddl-auto = update" to "spring.jpa.hibernate.ddl-auto = create-drop" in src/main/resources/application.properties file.

Check your database connection in src/main/resources/application.properties file and change if needed.

Go to com.emp.manage

Right Click on class EmsApplication.

Hit "Run As Java Application" in the IDE.

Check if localhost server has started.

Open Postman client

Hit url : "http://localhost:8080/employees" and url : "http://localhost:8080/departments"

Accordingly select the request method and the url as follows: Department: GET - "http://localhost:8080/departments" - gets list of all departments GET - "http://localhost:8080/departments/{id}" - gets department with selected id POST - "http://localhost:8080/departments" - inserts into department PUT - "http://localhost:8080/departments/{id}" - updates departments with selected id DELETE - "http://localhost:8080/departments" - deletes all departments DELETE - "http://localhost:8080/departments/{id}" - deletes departments with selected id PATCH - "http://localhost:8080/departments/{id}" - patches/updates departments with selected id

Employee: GET - "http://localhost:8080/employees" - gets list of all employees GET - "http://localhost:8080/employees/{id}" - gets employees with selected id POST - "http://localhost:8080/employees" - inserts into employees PUT - "http://localhost:8080/employees/{id}" - updates employees with selected id DELETE - "http://localhost:8080/employees" - deletes all employees DELETE - "http://localhost:8080/employees/{id}" - deletes employees with selected id PATCH - "http://localhost:8080/employees/{id}" - patches/updates employees with selected id

#ASSUMPTIONS#

DATABASE and TABLES are created in MySQL
DepartmentID is a foreign key in Employee table.
Make sure department table is populated with the department you refer for in employee.
While inserting employee detail through postman service: give a department id for department. Eg: { "employeeID": 2, "firstName": "Ronak", "lastName": "Gupta", "department": 4 }
#TECHNOLOGY STACK#

Java 17
STS 4.4.28.1 Release
MySQL Cammand
Postman Client 
#DESIGN DISCUSSION#

The employee table has a department id foreign key.
Department table needs to have a value existing to be referred by the employee table.
Get mapping will fetch the results, Post mapping will insert results, Put mapping and Patch mapping will update results, Delete mapping will delete results.
You will need to create database if not, change in the application.properties file.
Ease of extending the program
You can add useraccount table and assign username and password details for the employee.
You can also create a system account who handles all the creation and deleting of employee and department.

