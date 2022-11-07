package de.hsos.swa.mocktail.ECB.boundry;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static org.hamcrest.CoreMatchers.*;
import static io.restassured.RestAssured.given;

@QuarkusTest
public class MocktailResourceTest {
    @Test
    void testAddMocktail() {

    }

    @Test
    void testDeleteMocktail() {

    }

    @Test
    void testGetMocktailById() {
        given()
                .when().get("/mocktails/{id}", 0)
                .then()
                .statusCode(200)
                .body("id", equalTo(0));
    }

    @Test
    void testGetMocktails() {
        given().when().get("/mocktails").then().statusCode(200);
    }

    @Test
    void testUpdateMocktail() {
    }
}
