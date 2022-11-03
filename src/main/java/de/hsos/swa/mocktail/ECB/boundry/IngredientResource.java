package de.hsos.swa.mocktail.ECB.boundry;

import de.hsos.swa.mocktail.ECB.control.IngredientService;
import de.hsos.swa.mocktail.ECB.gateway.MocktaiRepository;

public class IngredientResource {
    IngredientService ingredientService = new MocktaiRepository();
}
