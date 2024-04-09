package api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

public class RestTest extends BaseTest {
    @Test
    public void putTest() {
        String requestBody = "Test text";
        given()
                .body(requestBody)
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
                .statusCode(200)
                .body("data", equalTo(requestBody));
    }

    @Test
    public void patchTest() {
        String requestBody = "{\"student\": \"Ivanov\", \"course\": 1}";
        given()
                .body(requestBody)
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
                .assertThat()
                .statusCode(200)
                .body("json.student", equalTo("Ivanov"))
                .body("json.course", equalTo(1));
    }

    @Test
    public void deleteTest() {
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
                .body("headers.accept-encoding", equalTo("gzip,deflate"))
                .statusCode(200);
    }
}