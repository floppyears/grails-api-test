package edu.oregonstate.mist.SampleJerseyAPI

import static org.grails.jaxrs.response.Responses.*

import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Produces
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.POST
import javax.ws.rs.core.Response

@Path('/api/employee')
@Consumes(['application/xml','application/json'])
@Produces(['application/xml','application/json'])
class EmployeeCollectionResource {

    def employeeResourceService

    @POST
    Response create(Employee dto) {
        created employeeResourceService.create(dto)
    }

    @GET
    Response readAll() {
        ok employeeResourceService.readAll()
    }

    @Path('/{id}')
    EmployeeResource getResource(@PathParam('id') Long id) {
        new EmployeeResource(employeeResourceService: employeeResourceService, id:id)
    }
}
