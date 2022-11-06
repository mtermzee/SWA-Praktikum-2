package de.hsos.swa.mocktail.ECB.control.mocktail;

import java.util.List;

import de.hsos.swa.mocktail.ECB.entity.Mocktail;

public interface MocktailGet {
    Mocktail getMocktailById(int id);

    List<Mocktail> getMocktails();
}
