package de.hsos.swa.mocktail.ECB.control.ingredient;

public interface IngredientDelete {
    boolean deleteIngredient(int id);

    boolean removeIngredientFromMocktail(int ingredientID, int mocktailID);
}
