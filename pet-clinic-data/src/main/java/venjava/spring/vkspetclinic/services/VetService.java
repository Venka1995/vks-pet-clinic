package venjava.spring.vkspetclinic.services;

import venjava.spring.vkspetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
