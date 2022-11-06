package de.hsos.swa.mocktail.ECB.control.ingredient;

import java.util.List;

public interface IngredientPost {
    int createIngredient(String name);

    boolean addIngredientToMocktail(int ingredientID, int mocktailID);

    boolean addIngredientToMocktail(List<Integer> ingredientIDs, int mocktailID);
}
