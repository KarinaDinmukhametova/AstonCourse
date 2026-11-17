
import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;


public class RequestTest {

    @Test
    void getRequest() {
    given()
    .when()
         .get("https://postman-echo.com/get?foo1=bar1&foo2=bar2")

    .then()
            .statusCode(200)
            .body("args.foo1", equalTo("bar1"))
            .body("args.foo2", equalTo("bar2"))
            .body("headers.host", equalTo("postman-echo.com"))
            .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
}




@Test
    void postRequest(){
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                     .contentType("text/plain")
                    .body( "{\"raw\":\"This is expected to be sent back as part of response body.\",\"form\":{\"foo1\":\"bar1\",\"foo2\":\"bar2\"},\"json\":\"{\"test\":\"value\"}\"}")
                .when()
                     .post("https://postman-echo.com/post")
                .then()
                      .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("data",  equalTo("{\"raw\":\"This is expected to be sent back as part of response body.\",\"form\":{\"foo1\":\"bar1\",\"foo2\":\"bar2\"},\"json\":\"{\"test\":\"value\"}\"}"))
                .body("files", equalTo(Map.of()))
                .body("form", equalTo(Map.of()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/post?foo1=bar1&foo2=bar2"));
}


@Test
    void putRequest(){
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .queryParam("hand", "wave")
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .put("https://postman-echo.com/put")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("args.hand", equalTo("wave"))
                .body("data",  equalTo("This is expected to be sent back as part of response body."))
                .body("files", equalTo(Map.of()))
                .body("form", equalTo(Map.of()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("json", nullValue())
            .body("url", equalTo( "https://postman-echo.com/put?foo1=bar1&foo2=bar2&hand=wave"));
}


    @Test
    void patchRequest(){
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .queryParam("hand", "wave")
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .patch("https://postman-echo.com/patch")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("args.hand", equalTo("wave"))
                .body("data",  equalTo("This is expected to be sent back as part of response body."))
                .body("files", equalTo(Map.of()))
                .body("form", equalTo(Map.of()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("json", nullValue())
                .body("url", equalTo( "https://postman-echo.com/patch?foo1=bar1&foo2=bar2&hand=wave"));
    }


    @Test
    void deleteRequest(){
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .queryParam("hand", "wave")
                .contentType("text/plain")
                .body("This is expected to be sent back as part of response body.")
                .when()
                .delete("https://postman-echo.com/delete")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .body("args.hand", equalTo("wave"))
                .body("data",  equalTo("This is expected to be sent back as part of response body."))
                .body("files", equalTo(Map.of()))
                .body("form", equalTo(Map.of()))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("json", nullValue())
                .body("url", equalTo( "https://postman-echo.com/delete?foo1=bar1&foo2=bar2&hand=wave"));
    }



    }





