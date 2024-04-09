package api;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTest extends BaseTest {
    protected Map<String, String> headers = postmanEcho.getMapHeaders();
    protected Map<String, String> args = postmanEcho.getArgs();
    protected Response response = postmanEcho.getResponse(headers, args, "/get");

    @Test
    public void getArgs() {
        assertEquals(200, response.getStatusCode());
        assertEquals("bar1", response.jsonPath().getString("args.foo1"));
        assertEquals("bar2", response.jsonPath().getString("args.foo2"));
    }

    @Test
    public void getHeaders() {
        assertEquals("https", response.jsonPath().getString("headers.x-forwarded-proto"));
        assertEquals("postman-echo.com", response.jsonPath().getString("headers.host"));
        assertEquals("*/*", response.jsonPath().getString("headers.accept"));
        assertEquals("gzip, deflate", response.jsonPath().getString("headers.accept-encoding"));
        assertEquals("no-cache", response.jsonPath().getString("headers.cache-control"));
        assertEquals("5c27cd7d-6b16-4e5a-a0ef-191c9a3a275f", response.jsonPath().getString("headers.postman-token"));
        assertEquals("PostmanRuntime/7.37.3", response.jsonPath().getString("headers.user-agent"));
        assertEquals("443", response.jsonPath().getString("headers.x-forwarded-port"));
        assertEquals("https://postman-echo.com/get?foo1=bar1&foo2=bar2", response.jsonPath().getString("url"));
    }
}
