package venjava.spring.vkspetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import venjava.spring.vkspetclinic.model.Owner;
import venjava.spring.vkspetclinic.model.Vet;
import venjava.spring.vkspetclinic.services.OwnerService;
import venjava.spring.vkspetclinic.services.VetService;


@Component
public class DataLoader implements CommandLineRunner {
    private final VetService vetService;
    private final OwnerService ownerService;

    public DataLoader(VetService vetService, OwnerService ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {

        var owner1= new Owner();
        owner1.setFirstName("Venkatesh");
        owner1.setLastName("ks");
        ownerService.save(owner1);

        var owner2= new Owner();
        owner2.setFirstName("raveesh");
        owner2.setLastName("ks");
        ownerService.save(owner2);

        System.out.println("loaded owners");
        System.out.println(ownerService.findAll());

        var vet1= new Vet();
        vet1.setFirstName("naresh");
        vet1.setLastName("fg");
        vetService.save(vet1);

        var vet2= new Vet();
        vet2.setFirstName("ramesh");
        vet2.setLastName("q");
        vetService.save(vet2);

        System.out.println("loaded vets");
        System.out.println(vetService.findAll());
    }
}
