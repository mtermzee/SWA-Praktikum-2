package de.hsos.swa.mocktail.ECB.boundry;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static org.hamcrest.CoreMatchers.*;
import static io.restassured.RestAssured.given;

@QuarkusTest
public class MocktailResourceTest {
    @Test
    @Order(1)
    void testAddMocktail() {

    }

    @Test
    @Order(2)
    void testGetMocktails() {
        given().when().get("/mocktails").then().statusCode(200);
    }

    @Test
    @Order(3)
    void testGetMocktailById() {
        given()
                .when().get("/mocktails/{id}", 0)
                .then()
                .statusCode(200)
                .body("id", equalTo(0));
    }

    @Test
    @Order(4)
    void testUpdateMocktail() {

    }

    /*
     * @Test
     * 
     * @Order(5)
     * void testDeleteMocktail() {
     * given()
     * .when().delete("/mocktails/0")
     * .then()
     * .statusCode(200);
     * }
     */

}
