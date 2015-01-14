# Sample Jersey API

Sample Grails application to evaluate the implementation of a RESTful Web service using [Jersey][1].


## Installation

* Download `ojdbc6_g.jar` from [Oracle Database 11g Release 2 JDBC Drivers][2] page and save it in `lib/`

* Set database configuration in `grails-app/conf/DataSource.groovy`

        dataSource {              // see http://grails.org/doc/latest/guide/conf.html#dataSource
             username = ""         // database user
             password = ""         // database password
             url = ""              // jdbc url
             driverClassName = "oracle.jdbc.driver.OracleDriver"
             dialect = "org.hibernate.dialect.Oracle10gDialect"
         }

* Run application

         $ grails run-app


## Usage

* Get request

         $ curl -X GET -H "Accept:application/json" http://SERVER:PORT/SampleJerseyAPI/api/employee/ID


[1]: https://jersey.java.net
[2]: http://www.oracle.com/technetwork/database/enterprise-edition/jdbc-112010-090769.html
