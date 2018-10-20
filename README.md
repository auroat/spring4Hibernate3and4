# spring4Hibernate3and4
A sample project which configures Spring 4 to be used together with Hibernate 3 or 4.

Currently configured for Hibernate 4 and Spring 4.

To alternate between Hibernate 3 and 4 versions, please change the Spring root configurations provided in SpringHibernateMain, at line:
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring4.xml");

Also, change the version of Hibernate in the pom.xml.

References:
https://www.journaldev.com/3524/spring-hibernate-integration-example-tutorial
