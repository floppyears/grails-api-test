package edu.oregonstate.mist.SampleJerseyAPI

import org.apache.commons.lang.builder.HashCodeBuilder

class Job implements Serializable {

    String positionNumber
    String suffix
    String status
    String jobTitle
    String eclsCode
    String appointmentType
    Date beginDate
    Date endDate
    String pclsCode
    String salGrade
    Number salStep
    String orgnCodeTs
    String orgnDesc
    String bctrTitle
    Number supervisorPidm
    String supervisorPosn
    String supervisorSuff
    Number trialInd
    Number annualInd
    Date evalDate
    Number low
    Number midpoint
    Number high
    Number salary
    Number sgrpCode

    static belongsTo = [employee: Employee]

    static mapping = {

        // associate Job class with PYVPASJ table
        table "PYVPASJ"

        // composite id
        id composite: [ "employee", "positionNumber", "suffix" ]

        // custom column definitions
        employee column: "PYVPASJ_PIDM",
                 sqlType: "NUMBER",
                 length: 8

        positionNumber column: "PYVPASJ_POSN",
                       sqlType: "VARCHAR2",
                       length: 6

        suffix column: "PYVPASJ_SUFF",
               sqlType: "VARCHAR2",
               length: 2

        status column: "PYVPASJ_STATUS",
               sqlType: "VARCHAR2",
               length: 1

        jobTitle column: "PYVPASJ_DESC",
                 sqlType: "VARCHAR2",
                 length: 30

        eclsCode column: "PYVPASJ_ECLS_CODE",
                 sqlType: "VARCHAR2",
                 length: 2

        appointmentType column: "PYVPASJ_APPOINTMENT_TYPE",
                        sqlType: "VARCHAR2",
                        length: 4000

        beginDate column: "PYVPASJ_BEGIN_DATE",
                  sqlType: "DATE"

        endDate column: "PYVPASJ_END_DATE",
                sqlType: "DATE"

        pclsCode column: "PYVPASJ_PCLS_CODE",
                 sqlType: "VARCHAR2",
                 length: 5

        salGrade column: "PYVPASJ_SAL_GRADE",
                 sqlType: "VARCHAR2",
                 length: 5

        salStep column: "PYVPASJ_SAL_STEP",
                sqlType: "NUMBER",
                length: 3

        orgnCodeTs column: "PYVPASJ_ORGN_CODE_TS",
                   sqlType: "VARCHAR2",
                   length: 6

        orgnDesc column: "PYVPASJ_ORGN_DESC",
                 sqlType: "VARCHAR2",
                 length: 30

        bctrTitle column: "PYVPASJ_BCTR_TITLE",
                  sqlType: "VARCHAR2",
                  length: 4

        supervisorPidm column: "PYVPASJ_SUPERVISOR_PIDM",
                       sqlType: "NUMBER",
                       length: 8

        supervisorPosn column: "PYVPASJ_SUPERVISOR_POSN",
                       sqlType: "VARCHAR2",
                       length: 6

        supervisorSuff column: "PYVPASJ_SUPERVISOR_SUFF",
                       sqlType: "VARCHAR2",
                       length: 2

        trialInd column: "PYVPASJ_TRIAL_IND",
                sqlType: "NUMBER"

        annualInd column: "PYVPASJ_ANNUAL_IND",
                  sqlType: "NUMBER"

        evalDate column: "PYVPASJ_EVAL_DATE",
                 sqlType: "DATE"

        low column: "PYVPASJ_LOW",
            sqlType: "NUMBER",
            length: 13,
            scale: 4

        midpoint column: "PYVPASJ_MIDPOINT",
                 sqlType: "NUMBER",
                 length: 13,
                 scale: 4

        high column: "PYVPASJ_HIGH",
             sqlType: "NUMBER",
             length: 13,
             scale: 4

        salary column: "PYVPASJ_SALARY",
               sqlType: "NUMBER",
               length: 11,
               scale: 2

        sgrpCode column: "PYVPASJ_SGRP_CODE",
                 sqlType: "VARCHAR2",
                 length: 6

    }

    boolean equals(other) {
        if (!(other instanceof Job)) {
            return false
        }

        return ( other.employee == employee &&
                 other.positionNumber == positionNumber &&
                 other.suffix == suffix )
    }

    int hashCode() {
        def builder = new HashCodeBuilder()
        builder.append employee.id
        builder.append positionNumber
        builder.append suffix
        builder.toHashCode()
    }
}
