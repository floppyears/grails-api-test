package edu.oregonstate.mist.SampleJerseyAPI

import javax.ws.rs.Produces
import javax.ws.rs.ext.Provider
import org.grails.jaxrs.support.DomainObjectWriterSupport

@Provider
@Produces(["application/json"])
class EmployeeWriter extends DomainObjectWriterSupport {

    protected Object writeToJson(Employee employee, OutputStream entityStream, String charset) {

        def writer = new OutputStreamWriter(entityStream, charset)

        def converter = employee.toJSON()

        converter.render(writer)

    }

}