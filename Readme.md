# Sample Jersey API

Sample Grails application to evaluate the implementation of a RESTful Web service using [Jersey][1].


## Usage

* Download `ojdbc6_g.jar` from [Oracle Database 11g Release 2 JDBC Drivers][2] page and save it in `lib/`

* Set database configuration in `grails-app/conf/DataSource.groovy`

    dataSource {              // see http://grails.org/doc/latest/guide/conf.html#dataSource
        dbCreate = "validate" // compare configuration with schema without changing database
        readOnly = true       // make database connection read-only
        username = ""         // database user
        password = ""         // database password
        url = ""              // jdbc url
        driverClassName = "oracle.jdbc.driver.OracleDriver"
        dialect = "org.hibernate.dialect.Oracle10gDialect"
    }


[1]: https://jersey.java.net
[2]: http://www.oracle.com/technetwork/database/enterprise-edition/jdbc-112010-090769.html
