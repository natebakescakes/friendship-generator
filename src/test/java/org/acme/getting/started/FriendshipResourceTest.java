package org.acme.getting.started;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class FriendshipResourceTest {

    @Test
    public void testFriendshipEndpoint() {
        given()
            .when().get("/api/friend/friend")
            .then()
            .statusCode(200)
            .body("name", equalTo("friend"))
            .body("address", equalTo("123 Imagination Road"));
    }
}
