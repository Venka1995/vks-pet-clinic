package venjava.spring.vkspetclinic.services.map;

import org.springframework.stereotype.Service;
import venjava.spring.vkspetclinic.model.Pet;
import venjava.spring.vkspetclinic.services.PetService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Pet object) {

    }

    @Override
    public Pet save(Pet object) {
        return null;
    }

    @Override
    public Pet findById(Long id) {
        return null;
    }
}
