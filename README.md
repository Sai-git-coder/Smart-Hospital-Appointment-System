🏥 Smart Hospital Appointment System



A web-based hospital appointment management system developed using Java

Servlets, JDBC, MySQL, HTML, and Apache Tomcat. The application provides

a simple platform for managing patient registration, hospital

appointments, and searching appointment-related records.



\------------------------------------------------------------------------



📌 Project Overview



The Smart Hospital Appointment System is designed to simplify hospital

appointment management through a web-based application.



The system uses Java Servlets for server-side request processing, JDBC

for database connectivity, and MySQL for persistent data storage.



This project demonstrates practical implementation of:



\-   Java Servlet development

\-   HTTP request and response handling

\-   JDBC database connectivity

\-   MySQL integration

\-   HTML-based web interfaces

\-   Form data processing

\-   SQL database operations

\-   Apache Tomcat deployment



\------------------------------------------------------------------------



✨ Key Features



👤 Patient Registration



\-   Allows patients to submit their registration details.

\-   Processes registration data using Java Servlets.

\-   Stores patient information in MySQL.



📅 Appointment Management



\-   Provides an interface for submitting appointment details.

\-   Processes appointment requests using Java Servlets.

\-   Stores appointment-related information in the database.



🔎 Search Functionality



\-   Provides a search interface for retrieving relevant records.

\-   Uses database queries to find matching information.

\-   Displays retrieved results through the web interface.



🗄️ Database Integration



\-   Uses MySQL as the relational database.

\-   Establishes database connections using JDBC.

\-   Centralizes database connection functionality.



🌐 Web Application



\-   Browser-based user interface.

\-   HTML pages for registration, appointments, and search.

\-   Deployed using Apache Tomcat.



\------------------------------------------------------------------------



🛠️ Technologies Used



&#x20; Technology         Purpose

&#x20; ------------------ --------------------------------

&#x20; Java               Application development

&#x20; Jakarta Servlets   Server-side request processing

&#x20; JDBC               Database connectivity

&#x20; MySQL              Data storage

&#x20; HTML5              User interface

&#x20; Apache Tomcat      Web application server

&#x20; Eclipse IDE        Development environment

&#x20; Git \& GitHub       Version control



\------------------------------------------------------------------------



🏗️ Application Architecture



&#x20;                ┌──────────────────────┐

&#x20;                │      Web Browser     │

&#x20;                │    HTML Interface    │

&#x20;                └──────────┬───────────┘

&#x20;                           │

&#x20;                      HTTP Request

&#x20;                           │

&#x20;                           ▼

&#x20;                ┌──────────────────────┐

&#x20;                │    Java Servlets     │

&#x20;                │                      │

&#x20;                │ AppointmentServlet   │

&#x20;                │ PatientRegServlet    │

&#x20;                │ SearchServlet        │

&#x20;                │ DatabaseServlet      │

&#x20;                └──────────┬───────────┘

&#x20;                           │

&#x20;                          JDBC

&#x20;                           │

&#x20;                           ▼

&#x20;                ┌──────────────────────┐

&#x20;                │        MySQL         │

&#x20;                │     hospital\_db      │

&#x20;                └──────────────────────┘



\------------------------------------------------------------------------



📂 Project Structure



&#x20;   Smart-Hospital-Appointment-System/

&#x20;   │

&#x20;   ├── .gitignore

&#x20;   ├── README.md

&#x20;   │

&#x20;   └── src/

&#x20;       │

&#x20;       ├── lib/

&#x20;       │   └── servlet-api.jar

&#x20;       │

&#x20;       └── main/

&#x20;           │

&#x20;           ├── java/

&#x20;           │   └── com/

&#x20;           │       ├── AppointmentServlet.java

&#x20;           │       ├── DatabaseServlet.java

&#x20;           │       ├── PatientRegServlet.java

&#x20;           │       └── SearchServlet.java

&#x20;           │

&#x20;           └── webapp/

&#x20;               │

&#x20;               ├── META-INF/

&#x20;               │   └── MANIFEST.MF

&#x20;               │

&#x20;               ├── WEB-INF/

&#x20;               │   ├── lib/

&#x20;               │   │   └── mysql-connector-j-8.4.0.jar

&#x20;               │   │

&#x20;               │   └── web.xml

&#x20;               │

&#x20;               ├── appointment.html

&#x20;               ├── reg.html

&#x20;               └── search.html



\------------------------------------------------------------------------



🔄 Application Workflow



Patient Registration



&#x20;   Patient

&#x20;      ↓

&#x20;   Registration Form

&#x20;      ↓

&#x20;   PatientRegServlet

&#x20;      ↓

&#x20;   JDBC

&#x20;      ↓

&#x20;   MySQL Database



Appointment Booking



&#x20;   Patient

&#x20;      ↓

&#x20;   Appointment Form

&#x20;      ↓

&#x20;   AppointmentServlet

&#x20;      ↓

&#x20;   JDBC

&#x20;      ↓

&#x20;   MySQL Database



Search



&#x20;   User

&#x20;      ↓

&#x20;   Search Form

&#x20;      ↓

&#x20;   SearchServlet

&#x20;      ↓

&#x20;   SQL Query

&#x20;      ↓

&#x20;   MySQL Database

&#x20;      ↓

&#x20;   Search Results



\------------------------------------------------------------------------



🗄️ Database Configuration



The application uses a MySQL database named:



&#x20;   hospital\_db



Default local database configuration:



&#x20;   Driver : com.mysql.cj.jdbc.Driver

&#x20;   Host   : localhost

&#x20;   Port   : 3306

&#x20;   Database: hospital\_db



Create the database using:



&#x20;   CREATE DATABASE hospital\_db;



Then select it:



&#x20;   USE hospital\_db;



Create the required tables according to the SQL schema used by the

application.



\------------------------------------------------------------------------



🔐 Security Note



Database credentials should not be stored directly in the source code or

committed to a public GitHub repository.



Use environment variables for local credentials:



&#x20;   DB\_USERNAME=root

&#x20;   DB\_PASSWORD=your\_mysql\_password



Never upload your actual database password to GitHub.



\------------------------------------------------------------------------



⚙️ Prerequisites



Install the following before running the project:



\-   Java JDK

\-   Eclipse IDE

\-   Apache Tomcat

\-   MySQL Server

\-   Git



Optional:



\-   MySQL Workbench



\------------------------------------------------------------------------



🚀 How to Run the Project



1\. Clone the Repository



&#x20;   git clone https://github.com/Sai-git-coder/Smart-Hospital-Appointment-System.git



Navigate to the project:



&#x20;   cd Smart-Hospital-Appointment-System



2\. Import into Eclipse



1\.  Open Eclipse IDE.

2\.  Select File → Import.

3\.  Select General → Existing Projects into Workspace.

4\.  Select the cloned project folder.

5\.  Click Finish.



3\. Configure Apache Tomcat



Configure your Apache Tomcat server in Eclipse and associate the project

with the server.



4\. Configure MySQL



Create the database:



&#x20;   CREATE DATABASE hospital\_db;



Create/import the required tables and configure your local database

credentials.



5\. Configure Required Libraries



Make sure the following libraries are available:



\-   Jakarta Servlet API

\-   MySQL Connector/J



The project currently includes:



&#x20;   mysql-connector-j-8.4.0.jar



6\. Run the Application



Start the application using Apache Tomcat from Eclipse.



Open:



&#x20;   http://localhost:8080/Smart\_Hospital\_Appointment\_System/



The registration page is configured as the welcome page.



\------------------------------------------------------------------------



🌐 Application Pages



&#x20; Page               Purpose

&#x20; ------------------ ------------------------

&#x20; reg.html           Patient registration

&#x20; appointment.html   Appointment management

&#x20; search.html        Search functionality



\------------------------------------------------------------------------



🔌 Servlet Components



PatientRegServlet



Processes patient registration requests and performs database

operations.



AppointmentServlet



Handles appointment-related requests submitted through the web

interface.



SearchServlet



Processes search requests and retrieves matching records from MySQL.



DatabaseServlet



Provides database connection functionality using JDBC.



\------------------------------------------------------------------------



💡 Technical Concepts Demonstrated



\-   Core Java

\-   Java Servlets

\-   Jakarta Servlet API

\-   HTTP GET/POST requests

\-   Servlet lifecycle

\-   JDBC

\-   MySQL

\-   SQL queries

\-   Database connectivity

\-   Exception handling

\-   HTML forms

\-   Apache Tomcat

\-   Git

\-   GitHub



\------------------------------------------------------------------------



🧩 Learning Outcomes



Through this project, I gained practical experience in:



\-   Developing Java-based web applications.

\-   Connecting Java applications with MySQL using JDBC.

\-   Processing HTML form data using Servlets.

\-   Executing database operations through SQL and JDBC.

\-   Deploying web applications on Apache Tomcat.

\-   Managing external JAR dependencies.

\-   Debugging servlet and database connectivity issues.

\-   Using Git and GitHub for source-code management.

\------------------------------------------------------------------------

📚 Key Takeaways



This project helped strengthen my understanding of Java web development,

database integration, server-side programming, and version control. It

provided hands-on experience in building and deploying a database-driven

web application using Java technologies.



\------------------------------------------------------------------------



👤 Author



Sai Smruthi A P



B.E. – Electronics and Communication Engineering



Aspiring Software Engineer



Technical Skills



&#x20;   Java • Spring Boot • JDBC • Hibernate • MySQL

&#x20;   HTML • CSS • JavaScript • Git • GitHub



\------------------------------------------------------------------------



🔗 GitHub Repository



https://github.com/Sai-git-coder/Smart-Hospital-Appointment-System



\------------------------------------------------------------------------



⭐ If you find this project useful, consider giving the repository a

star!



