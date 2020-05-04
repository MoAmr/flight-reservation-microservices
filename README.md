--------------------------------------------------------------------------

# Spring Boot Microservices - A Flight Reservation Architecture

<h5>Flight Reservation System build using Spring Boot Microservices</h5>

--------------------------------------------------------------------------

# How to clean your project?

Navigate to Code Files directory and run the following command:

<h5>cd Code files</h5>

<h5>mvn clean</h5>

--------------------------------------------------------------------------

# How to build maven project using terminal and package it to either JAR or WAR file located in target folder?

<h5>mvn install</h5>

--------------------------------------------------------------------------

# How to clean and install all microservices to run one by one?

Navigate to Code Files directory and run the following command:

<h5>cd Code files</h5>

<h5>mvn clean install -Dmaven.test.skip=true</h5>

--------------------------------------------------------------------------

# How to run project using terminal?

<h5>mvn spring-boot:run</h5>

--------------------------------------------------------------------------

# How to run a a jar generated to target folder in spring application as a simple java application?

cd your terminal to the location of this jar “preferred to copy this jar to a new location and cd your terminal to that new location” then run the following:

<h5>java -jar <jar-name>.jar</h5>

--------------------------------------------------------------------------

# How to externalize a configuration properties "lookup to another property file outside your jar"?

Add the following to application.properties file inside config-server module,
after making sure to create a directory with the name config-repo inside
Documents directory on your pc. 

<h5>spring.cloud.config.server.git.uri=${HOME}/Documents/config-repo</h5>

<h5>Note: You will find all the needed application.properties files inside config-server module</h5>

--------------------------------------------------------------------------

# Setup Notes:

You have to initialize this directory as empty git repository using the command:

<h5>git init</h5>

Then add all the files using the command:

<h5>git add .</h5> 

Or if you prefer to add one file at once, then use the command:

<h5>git add -A .</h5>

Then you must commit the changes you have made to the repository through the command:

<h5>git commit -m "your message"</h5>

--------------------------------------------------------------------------

# RabbitMq Server Running Notes:

start rabbitmq-server after installing it on your machine

For more info on how to install rabbitmq server on Mac osx:

https://www.dyclassroom.com/howto-mac/how-to-install-rabbitmq-on-mac-using-homebrew

How to start rabbitmq-server on Mac terminal?

Navigate to the directory where your rabbitmq server is installed, for example:

<h5>cd  /usr/local/Cellar/rabbitmq/3.8.3/sbin/</h5>

<h5>./rabbitmq-server</h5>

How to stop rabbitmq-server on Mac terminal?

<h5>Ctrl + c</h5>

--------------------------------------------------------------------------

# Microservices (Modules) Build and Running Notes:

<h4>You have to build and run the microservices in the following order:</h4>
You can either run them using terminal or as spring boot application from your IDE.

<h5>config-server</h5>
<h5>java -jar target/config-server-0.0.1-SNAPSHOT.jar</h5>

<h5>eurekaserver</h5>
<h5>java -jar target/eurekaserver-0.0.1-SNAPSHOT.jar</h5>

<h5>search</h5>
<h5>java -jar target/search-0.0.1-SNAPSHOT.jar</h5>

<h5>search-apigateway</h5>
<h5>java -jar target/search-apigateway-0.0.1-SNAPSHOT.jar</h5>

<h5>fares</h5>
<h5>ava -jar target/fares-0.0.1-SNAPSHOT.jar</h5>

<h5>fares-apigateway</h5>
<h5>java -jar target/fares-apigateway-0.0.1-SNAPSHOT.jar</h5>

<h5>book</h5>
<h5>java -jar target/book-0.0.1-SNAPSHOT.jar</h5>

<h5>book-apigateway</h5>
<h5>java -jar target/book-apigateway-0.0.1-SNAPSHOT.jar</h5>

<h5>checkin</h5>
<h5>java -jar target/checkin-0.0.1-SNAPSHOT.jar</h5>

<h5>checkin-apigateway</h5>
<h5>java -jar target/checkin-apigateway-0.0.1-SNAPSHOT.jar</h5>

<h5>website</h5>
<h5>java -jar target/website-0.0.1-SNAPSHOT.jar</h5>

--------------------------------------------------------------------------

# Eureka Server Discovery's Port:

http://localhost:8761

--------------------------------------------------------------------------

# Elasticsearch running command

Navigate to elasticsearch directory after downloading 
and extracting it, then run the following command:
directory and run the following command:

<h5>./elasticsearch-7.6.2/bin/elasticsearch</h5>

--------------------------------------------------------------------------

# Kibana running command

Navigate to kibana directory after downloading 
and extracting it, then run the following command:

<h5>./kibana-7.6.2-darwin-x86_64/bin/kibana</h5>

Note: Kibana port: <h4>http://localhost:5601</h4>

--------------------------------------------------------------------------

# Logstash running command

Navigate to kibana directory after downloading 
and extracting it, then run the following command
and pointing to logstash.conf file's path on your pc

Example:

<h5>./logstash-7.6.2/bin/logstash -f /Users/mohammed/Desktop/logstash.conf</h5>