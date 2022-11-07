package de.hsos.swa.mocktail.ECB.boundry;

import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.common.http.TestHTTPEndpoint;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import static io.restassured.RestAssured.given;

@QuarkusTest
@TestHTTPEndpoint(IngredientResource.class)
public class IngredientResourceTest {
    @Test
    void testAddIngredientToMocktail() {

    }

    @Test
    void testCreateIngredient() {

    }

    @Test
    void testDeleteIngredient() {

    }

    @Test
    void testGetIngredientById() {

    }

    @Test
    void testGetIngredients() {

    }

    @Test
    void testUpdateIngredient() {

    }
}
