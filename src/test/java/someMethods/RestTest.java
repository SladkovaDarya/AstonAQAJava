package api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

public class RestTest {
    private static final String URL = "https://postman-echo.com";
    private PostmanEcho postmanEcho = new PostmanEcho();

    @Test
    void echoPutTest() {
        given()
                .when().put("/put")
                .then()
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", equalTo("application/json"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", notNullValue())
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .statusCode(200);
    }

    @Test
    void echoPatchTest() {
        given()
                .when().patch("/patch")
                .then()
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", equalTo("application/json"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", notNullValue())
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .statusCode(200);
    }

    @Test
    void echoDeleteTest() {
        given()
                .when().delete("/delete")
                .then()
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.content-type", equalTo("application/json"))
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", notNullValue())
                .body("headers.accept-encoding", equalTo("gzip,deflate"));


    }
}