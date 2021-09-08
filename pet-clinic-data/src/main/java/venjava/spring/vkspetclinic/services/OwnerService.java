package venjava.spring.vkspetclinic.services;

import venjava.spring.vkspetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
