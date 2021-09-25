package venjava.spring.vkspetclinic.services.map;

import venjava.spring.vkspetclinic.model.Vet;
import venjava.spring.vkspetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Vet object) {

    }

    @Override
    public Vet save(Vet object) {
        return null;
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }
}
