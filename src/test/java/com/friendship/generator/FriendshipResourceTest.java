package com.friendship.generator;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import com.github.javafaker.Faker;
import io.quarkus.test.junit.QuarkusMock;
import io.quarkus.test.junit.QuarkusTest;
import javax.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

@QuarkusTest
public class FriendshipResourceTest {

    @Inject
    Faker faker;

    String mockedName = "Francois Badeaux";
    String mockedAddress = "Apt. 743 062 Donovan Park, Rolfsonton, AK 31783-0073";

    @BeforeEach
    void setUp() {

        Faker mock = Mockito.mock(Faker.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(mock.name().fullName()).thenReturn(mockedName);
        Mockito.when(mock.address().fullAddress()).thenReturn(mockedAddress);
        QuarkusMock.installMockForType(mock, Faker.class);
    }

    @Test
    public void testFriendshipEndpoint() {
        given()
            .when().get("/api/friend")
            .then()
            .statusCode(200)
            .body("name", equalTo(mockedName))
            .body("address", equalTo(mockedAddress));
    }
}
