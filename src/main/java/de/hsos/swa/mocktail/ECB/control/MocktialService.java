package de.hsos.swa.mocktail.ECB.control;

import java.util.List;

import de.hsos.swa.mocktail.ECB.entity.Mocktail;

public interface MocktialService {
    boolean addMocktail(String name);

    boolean deleteMocktail(int id);

    boolean updateMocktail(int id, String name);

    Mocktail getMocktailById(int id);

    List<Mocktail> getMocktails();
}
