package edu.oregonstate.mist.SampleJerseyAPI

class Employee {

    Integer id
    String osuId
    String lastName
    String firstName
    String middleInitial
    String onidLoginId
    String emailAddress
    String employeeStatus

    static mapping = {

        // associate Employee class with PYVPASE table
        table "PYVPASE"

        // custom column definitions
        id column: "PYVPASE_PIDM",
           sqlType: "NUMBER",
           length: 8

        osuId column: "PYVPASE_ID",
              sqlType: "VARCHAR2",
              length: 9

        lastName column: "PYVPASE_LAST_NAME",
                 sqlType: "VARCHAR2",
                 length: 60

        firstName column: "PYVPASE_FIRST_NAME",
                  sqlType: "VARCHAR2",
                  length: 60

        middleInitial column: "PYVPASE_MI",
                      sqlType: "VARCHAR2",
                      length: 60

        onidLoginId column: "PYVPASE_ONID_LOGIN",
                    sqlType: "VARCHAR2",
                    length: 8

        emailAddress column: "PYVPASE_EMAIL",
                     sqlType: "VARCHAR2",
                     length: 4000

        employeeStatus column: "PYVPASE_EMPL_STATUS",
                       sqlType: "VARCHAR2",
                       length: 1
    }
}
