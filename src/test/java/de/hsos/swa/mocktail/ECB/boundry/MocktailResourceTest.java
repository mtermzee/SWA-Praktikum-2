package de.hsos.swa.mocktail.ECB.boundry;

import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.common.http.TestHTTPEndpoint;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import static io.restassured.RestAssured.given;

@QuarkusTest
@TestHTTPEndpoint(MocktailResource.class)
public class MocktailResourceTest {
    @Test
    void testAddMocktail() {
        /*
         * String mocktail = "Oreoshake";
         * given()
         * .pathParam("mocktail", mocktail)
         * .when().post("/mocktails/{mocktail}")
         * .then()
         * .statusCode(200);
         */

    }

    @Test
    void testDeleteMocktail() {

    }

    @Test
    void testGetMocktailById() {

    }

    @Test
    void testGetMocktails() {

    }

    @Test
    void testUpdateMocktail() {

    }
}
