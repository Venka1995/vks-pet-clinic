package venjava.spring.vkspetclinic.services;

import venjava.spring.vkspetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
