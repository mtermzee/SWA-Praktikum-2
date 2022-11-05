package de.hsos.swa.mocktail.ECB.boundry;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.hsos.swa.mocktail.ECB.control.IngredientService;
import de.hsos.swa.mocktail.ECB.gateway.MocktaiRepository;

@Path("/ingredients")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class IngredientResource {
    // Inject - for dependency injection Initialize the MocktailRepository
    @Inject
    IngredientService ingredientService = new MocktaiRepository();

    @PostConstruct
    public void init() {
        // add data
    }
}
