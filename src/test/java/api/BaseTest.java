package api;

import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected static final String URL = "https://postman-echo.com";
    protected PostmanEcho postmanEcho = new PostmanEcho();

    @BeforeEach
    public void setup() {
        Specifications.installSpecification(Specifications.requestSpec(URL),
                Specifications.responseSpecOK200());
    }
}
