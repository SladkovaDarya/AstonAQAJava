package api;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PostmanEcho {
    public Map<String, String> getMapHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("x-forwarded-proto", "https");
        headers.put("host", "postman-echo.com");
        headers.put("accept", "*/*");
        headers.put("accept-encoding", "gzip, deflate");
        headers.put("cache-control", "no-cache");
        headers.put("postman-token", "5c27cd7d-6b16-4e5a-a0ef-191c9a3a275f");
        headers.put("user-agent", "PostmanRuntime/7.6.1");
        headers.put("x-forwarded-port", "443");
        return headers;
    }

    public Map<String, String> getArgs() {
        Map<String, String> args = new HashMap<>();
        args.put("foo1", "bar1");
        args.put("foo2", "bar2");
        return args;
    }

    public Map<String, String> postMapHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("x-forwarded-proto", "https");
        headers.put("x-forwarded-port", "443");
        headers.put("host", "postman-echo.com");
        headers.put("x-amzn-trace-id", "Root=1-63e0c942-584c7dab4a1c52d34d581b03");
        headers.put("content-type", "application/x-www-form-urlencoded; charset=UTF-8");
        headers.put("user-agent", "PostmanRuntime/7.30.1");
        headers.put("accept", "*/*");
        headers.put("cache-control", "no-cache");
        headers.put("postman-token", "159c6495-8e5f-4ce0-bacd-ac399a86ec03");
        headers.put("accept-encoding", "gzip, deflate, br");
        return headers;
    }

    public Map<String, String> postArgs() {
        Map<String, String> args = new HashMap<>();
        args.put("foo1", "bar1");
        args.put("foo2", "bar2");
        return args;
    }

    public Response getResponse(Map<String, String> headers, Map<String, String> args, String methodHttp) {
        Response response = given()
                .baseUri("https://postman-echo.com")
                .headers(headers)
                .queryParams(args)
                .when()
                .log().all()
                .get(methodHttp);
        return response;
    }

    public Response postResponse(Map<String, String> headers, Map<String, String> args, String methodHttp) {
        Response response = given()
                .baseUri("https://postman-echo.com")
                .headers(headers)
                .formParams(args)
                .when()
                .log().all()
                .post(methodHttp);
        return response;
    }
}
