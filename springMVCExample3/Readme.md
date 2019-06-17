Spring MVC application
- Maven for build management
- Tomcat server 
   * as tomcat maven plugin , (run by mvn tomcat7:run)
   * as external running tomcat server , deployed war just by pasting in /Users/pjain/Downloads/apache-tomcat-9.0.20/webapps folder
- instead of Xml configuration used java class based configuration (web.xml replaced with MyWebInitializer.java and Dispatcher-servlet.xml with SpringWebConfig.java)