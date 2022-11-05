package de.hsos.swa.mocktail.ECB.boundry;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.hsos.swa.mocktail.ECB.control.MocktialService;
import de.hsos.swa.mocktail.ECB.gateway.MocktaiRepository;

@Path("/mocktails")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class MocktailResource {
    // Inject - for dependency injection Initialize the MocktailRepository
    @Inject
    MocktialService mocktialService = new MocktaiRepository();

    @PostConstruct
    public void init() {
        // add data
    }
}