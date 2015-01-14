package edu.oregonstate.mist.SampleJerseyAPI

import static org.grails.jaxrs.response.Responses.*

import javax.ws.rs.Consumes
import javax.ws.rs.DELETE
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.PUT
import javax.ws.rs.core.Response

import org.grails.jaxrs.provider.DomainObjectNotFoundException

@Consumes(['application/json'])
@Produces(['application/json'])
class EmployeeResource {

    def employeeResourceService
    def id

    @GET
    Response read() {
        ok employeeResourceService.read(id)
    }

    @PUT
    Response update(Employee dto) {
        dto.id = id
        ok employeeResourceService.update(dto)
    }

    @DELETE
    void delete() {
        employeeResourceService.delete(id)
    }
}
