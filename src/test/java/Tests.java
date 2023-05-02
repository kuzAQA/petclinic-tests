import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

public class Tests extends BaseTest {

  @Test
  public void test() {
    given()
        .when()
        .get("/api/pettypes")
        .then()
        .statusCode(200)
        .log().all()
        .extract()
        .response();
  }
}
