package de.jonashackt.springbootvuejs.controller;

import cacib.interview.demo.DemoApplication;
import cacib.interview.demo.application.request.CreateCounterRequest;
import cacib.interview.demo.application.response.CreateCounterResponse;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(
		classes = DemoApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
public class CounterControllerTest {

	@LocalServerPort
	private int port;

	@Before
    public void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

	@Test
    public void createCounter() {
        final String payload = "{\n" +
        "  \"key\": \"keytest\"\n" +
        "}";

        CreateCounterResponse countval = given()
            .contentType(ContentType.JSON)
            .body(payload)
            .post("/")
            .then()
            .statusCode(200)
            .extract()
            .response()
			.getBody().as(CreateCounterResponse.class);

        assertThat(countval.getCount(), is(0));
    }

}
