import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

  @BeforeEach
  public void beforeEach() {
    RestAssured.baseURI = "http://localhost/petclinic";
    RestAssured.port = 9966;
  }
}
