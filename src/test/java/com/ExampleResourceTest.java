package com;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.ExampleResource;

@QuarkusTest
class ExampleResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello from Quarkus REST"));
    }

    @Test
    void test_avgs(){
        assertEquals(ExampleResource.hello(),"Hello from Quarkus REST");
        assertEquals(ExampleResource.hello().split(",").length,1);
        String msg = ExampleResource.hello();
        assertTrue(msg.matches("[A-Za-z]"));

    }







}