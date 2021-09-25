package venjava.spring.vkspetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import venjava.spring.vkspetclinic.model.Owner;
import venjava.spring.vkspetclinic.model.Vet;
import venjava.spring.vkspetclinic.services.OwnerService;
import venjava.spring.vkspetclinic.services.VetService;
import venjava.spring.vkspetclinic.services.map.OwnerServiceMap;
import venjava.spring.vkspetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {
    private final VetService vetService;
    private final OwnerService ownerService;

    public DataLoader() {
        vetService = new VetServiceMap();
        ownerService= new OwnerServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        var owner1= new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Venkatesh");
        owner1.setLastName("ks");

        var owner2= new Owner();
        owner2.setId(2L);
        owner2.setFirstName("raveesh");
        owner2.setLastName("ks");

        System.out.println("loaded owners");

        var vet1= new Vet();
        vet1.setId(1L);
        vet1.setFirstName("naresh");
        vet1.setLastName("fg");

        var vet2= new Owner();
        vet2.setId(2L);
        vet2.setFirstName("ramesh");
        vet2.setLastName("q");

        System.out.println("loaded vets");
    }
}
