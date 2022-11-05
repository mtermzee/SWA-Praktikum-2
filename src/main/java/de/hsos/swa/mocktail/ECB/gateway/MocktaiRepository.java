package de.hsos.swa.mocktail.ECB.gateway;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import de.hsos.swa.mocktail.ECB.control.IngredientService;
import de.hsos.swa.mocktail.ECB.control.MocktialService;
import de.hsos.swa.mocktail.ECB.entity.Ingredient;
import de.hsos.swa.mocktail.ECB.entity.Mocktail;

// @Singleton to inject the mocktails in ApiController
// ApplicationScoped to inject the mocktails in ApiController
@ApplicationScoped
public class MocktaiRepository implements MocktialService, IngredientService {
    Map<Integer, Mocktail> mocktails = new HashMap<>();
    Map<Integer, Ingredient> ingredients = new HashMap<>();

    @Override
    public boolean createIngredient(String name) {
        Ingredient ingredient = new Ingredient(ingredients.size(), name);
        ingredients.put(ingredient.getId(), ingredient);
        return true;
    }

    @Override
    public boolean addIngredientToMocktail(int ingredientID, int mocktailID) {
        Mocktail mocktail = getMocktailById(mocktailID);
        Ingredient ingredient = getIngredientById(ingredientID);
        if (mocktail != null && ingredient != null) {
            mocktail.addIngredient(ingredient);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteIngredient(int id) {
        if (ingredients.containsKey(id)) {
            ingredients.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeIngredientFromMocktail(int ingredientID, int mocktailID) {
        Mocktail mocktail = getMocktailById(mocktailID);
        Ingredient ingredient = getIngredientById(ingredientID);
        if (mocktail != null && ingredient != null) {
            return mocktail.removeIngredient(ingredientID);
        }
        return false;
    }

    @Override
    public boolean updateIngredient(int id, String name) {
        // check refrecne
        if (ingredients.containsKey(id)) {
            Ingredient ingredient = ingredients.get(id);
            ingredient.setName(name);
            return true;
        }
        return false;
    }

    @Override
    public Ingredient getIngredientById(int id) {
        if (ingredients.containsKey(id)) {
            return ingredients.get(id);
        }
        return null;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return List.copyOf(ingredients.values());
    }

    @Override
    public boolean addMocktail(String name) {
        for (Mocktail mocktail : mocktails.values()) {
            if (mocktail.getName().equals(name)) {
                return false;
            }
        }
        Mocktail mocktail = new Mocktail(mocktails.size(), name);
        mocktails.put(mocktail.getId(), mocktail);
        return true;
    }

    @Override
    public boolean deleteMocktail(int id) {
        if (mocktails.containsKey(id)) {
            mocktails.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateMocktail(int id, String name) {
        if (mocktails.containsKey(id)) {
            // check refrence
            Mocktail mocktail = mocktails.get(id);
            mocktail.setName(name);
            return true;
        }
        return false;
    }

    @Override
    public Mocktail getMocktailById(int id) {
        if (mocktails.containsKey(id)) {
            return mocktails.get(id);
        }
        return null;
    }

    @Override
    public List<Mocktail> getMocktails() {
        return List.copyOf(mocktails.values());
    }

}
