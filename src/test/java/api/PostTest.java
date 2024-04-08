package api;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostTest extends BaseTest {
    protected Map<String, String> headers = postmanEcho.postMapHeaders();
    protected Map<String, String> args = postmanEcho.postArgs();
    protected Response response = postmanEcho.postResponse(headers, args, "/post");

    @Test
    public void postArgs() {
        assertEquals(200, response.getStatusCode());
        assertEquals("bar1", response.jsonPath().getString("form.foo1"));
        assertEquals("bar2", response.jsonPath().getString("form.foo2"));
    }

    @Test
    public void postHeaders() {
        assertEquals("https", response.jsonPath().getString("headers.x-forwarded-proto"));
        assertEquals("443", response.jsonPath().getString("headers.x-forwarded-port"));
        assertEquals("postman-echo.com", response.jsonPath().getString("headers.host"));
        assertEquals("application/x-www-form-urlencoded; charset=UTF-8", response.jsonPath().getString("headers.content-type"));
        assertEquals("PostmanRuntime/7.30.1", response.jsonPath().getString("headers.user-agent"));
        assertEquals("*/*", response.jsonPath().getString("headers.accept"));
        assertEquals("no-cache", response.jsonPath().getString("headers.cache-control"));
        assertEquals("159c6495-8e5f-4ce0-bacd-ac399a86ec03", response.jsonPath().getString("headers.postman-token"));
        assertEquals("gzip, deflate, br", response.jsonPath().getString("headers.accept-encoding"));
        assertEquals("https://postman-echo.com/post", response.jsonPath().getString("url"));
    }
}
