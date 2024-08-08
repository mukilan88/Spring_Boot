Spring Boot Module
------------------
- It is a Spring Module which provides Rapid Application Development (RAD) feature
  to Spring framework
- It is used to avoid writing spring bean XML configuration file
- Automatically configure spring by adding the project dependencies in pom.xml file
- Embedded tomcat server


Spring Boot IDE (Spring Tool Suite - STS)
-----------------------------------------
Google : sts download
url: https://spring.io/tools


Project Lombok tool
-------------------
Project Lombok is a Java Library tool that is used to minimize/remove the boiler plate code and save the time of developers during project development by just using some annotations

Ex:
	@NoArgsConstructor
	@AllArgsConstructor
	@Setter
	@Getter
	@ToString
	@Data //@Setter, @Getter and @ToString
	public class Employee
	{
	   private int empId;
	   private String empName;
	   private double empSalary;
	  //no need constructors
	 //no need setters & getters
	//no need toString()
	}

Download Lombok
---------------
url: https://projectlombok.org/download

After download run the application a pop up will come select the ide and also select the springToolsuite.exe file(sts folder)

Note
After installing Lombok tool, if the IDEs are open, close the IDEs and reopen


Developing a Spring Boot Application in STS
-------------------------------------------
- Create a table "Product" in MySQL
	mysql>create table Product (pid int(3), pname varchar(10), price int(4));

- Create a Spring Starter Project (Spring Boot) in STS

	
	Click on File -> New -> Spring Starter Project

	Name : SpringBootProj
	Type : Maven
	Java Version : 17
	Group : springboot
	Artifact : SpringBootProj
	Package : com.spring.boot

	Click Next

	In Avaiable, search for the following project dependencies and add
		- Spring Web
		- JDBC API
		- MySQL Driver
		- Lombok

	and click Finish


- Add the following dependency in between <dependencies> element of pom.xml file of SpringBootProj
