package de.hsos.swa.mocktail.ECB.control.ingredient;

import java.util.List;

import de.hsos.swa.mocktail.ECB.entity.Ingredient;

public interface IngredientGet {
    Ingredient getIngredientById(int id);

    List<Ingredient> getIngredients();
}
