package edu.oregonstate.mist.SampleJerseyAPI

import org.grails.jaxrs.provider.DomainObjectNotFoundException

class JobResourceService {

    def create(Job dto) {
        dto.save()
    }

    def read(id) {
        def obj = Job.get(id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Job.class, id)
        }
        obj
    }

    def readAll() {
        Job.findAll()
    }

    def update(Job dto) {
        def obj = Job.get(dto.id)
        if (!obj) {
            throw new DomainObjectNotFoundException(Job.class, dto.id)
        }
        obj.properties = dto.properties
        obj
    }

    void delete(id) {
        def obj = Job.get(id)
        if (obj) {
            obj.delete()
        }
    }
}
