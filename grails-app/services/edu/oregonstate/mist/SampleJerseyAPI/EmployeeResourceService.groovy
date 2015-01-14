package edu.oregonstate.mist.SampleJerseyAPI

import org.grails.jaxrs.provider.DomainObjectNotFoundException

class EmployeeResourceService {

    def create(Employee dto) {
        dto.save()
    }

    def read(id) {
        def obj = Employee.get(id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Employee.class, id)
        }
        obj
    }

    def readAll() {
        Employee.findAll()
    }

    def update(Employee dto) {
        def obj = Employee.get(dto.id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Employee.class, dto.id)
        }
        obj.properties = dto.properties
        obj
    }

    void delete(id) {
        def obj = Employee.get(id)
        if (obj) {
            obj.delete()
        }
    }
}
