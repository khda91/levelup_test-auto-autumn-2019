package ru.level.qa.test.auto.autumn.api.rest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.level.qa.test.auto.autumn.api.rest.request.CompanyRequest;
import ru.level.qa.test.auto.autumn.api.rest.request.UserRequest;
import ru.level.qa.test.auto.autumn.api.rest.response.CompanyResponse;
import ru.level.qa.test.auto.autumn.api.rest.response.UserResponse;
import ru.level.qa.test.auto.autumn.api.rest.response.UserResponseJackson;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SimpleTest {

    @DataProvider
    public Object[][] registrationTestDataProvider() {
        return new Object[][]{
                {RandomStringUtils.randomAlphabetic(7) + "@" + RandomStringUtils.randomAlphabetic(5) + ".ru",
                        RandomStringUtils.randomAlphabetic(10)},
                {RandomStringUtils.randomAlphabetic(7) + "@" + RandomStringUtils.randomAlphabetic(5) + ".ru",
                        RandomStringUtils.randomAlphabetic(10)},
                {RandomStringUtils.randomAlphabetic(7) + "@" + RandomStringUtils.randomAlphabetic(5) + ".ru",
                        RandomStringUtils.randomAlphabetic(10)},
                {RandomStringUtils.randomAlphabetic(7) + "@" + RandomStringUtils.randomAlphabetic(5) + ".ru",
                        RandomStringUtils.randomAlphabetic(10)},
                {RandomStringUtils.randomAlphabetic(7) + "@" + RandomStringUtils.randomAlphabetic(5) + ".ru",
                        RandomStringUtils.randomAlphabetic(10)}
        };
    }

    @Test(dataProvider = "registrationTestDataProvider")
    public void registrationTest(String email, String username) {
        given()
                .baseUri("http://users.bugred.ru/tasks/rest")
                .body("{\n" +
                        "    \"email\": \"" + email + "\",\n" +
                        "    \"name\": \"" + username + "\",\n" +
                        "    \"password\": \"1\"\n" +
                        "}")
                .when()
                .post("/doregister")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("email", equalTo(email))
                .body("name", equalTo(username));
    }

    @Test
    public void registration1Test() {
        final String email = RandomStringUtils.randomAlphabetic(5) + "@" + RandomStringUtils.randomAlphabetic(5) + ".lll";
        final String username = RandomStringUtils.randomAlphabetic(7);
        UserRequest ur = new UserRequest(
                email, username, RandomStringUtils.randomAlphabetic(8)
        );

        given()
                .baseUri("http://users.bugred.ru/tasks/rest")
                .body(ur)
                .when()
                .post("/doregister")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("email", equalTo(email))
                .body("name", equalTo(username));
    }

    @Test
    public void registration2Test() {
        final String email = RandomStringUtils.randomAlphabetic(5) + "@" + RandomStringUtils.randomAlphabetic(5) + ".lll";
        final String username = RandomStringUtils.randomAlphabetic(7);
        UserRequest ur = new UserRequest(
                email, username, RandomStringUtils.randomAlphabetic(8)
        );

        UserResponse uResp = given()
                .baseUri("http://users.bugred.ru/tasks/rest")
                .body(ur)
        .when()
                .post("/doregister")
                .as(UserResponse.class);

        System.out.println(uResp);
        assertThat(uResp.getEmail(), equalTo(email));
        assertThat(uResp.getName(), equalTo(username));

//        .then()
//                .statusCode(200)
//                .contentType(ContentType.JSON)

    }

    @Test
    public void registrationJacksonMapperTest() {
        final String email = RandomStringUtils.randomAlphabetic(5) + "@" + RandomStringUtils.randomAlphabetic(5) + ".lll";
        final String username = RandomStringUtils.randomAlphabetic(7);
        UserRequest ur = new UserRequest(
                email, username, RandomStringUtils.randomAlphabetic(8)
        );

        UserResponseJackson uResp = given()
                .baseUri("http://users.bugred.ru/tasks/rest")
                .body(ur)
                .when()
                .post("/doregister")
                .as(UserResponseJackson.class);

        System.out.println(uResp);
        assertThat(uResp.getEmail(), equalTo(email));
        assertThat(uResp.getName(), equalTo(username));

//        .then()
//                .statusCode(200)
//                .contentType(ContentType.JSON)

    }

    @Test
    public void createCompanyJacksonMapperTest() {
        final String companyName = RandomStringUtils.randomAlphabetic(12);
        List<String> users = Arrays.asList("test_anna@gmail.com", "mrak20@list.ru");
        CompanyRequest cr = new CompanyRequest(companyName, "ООО", users, "test.user@email.com");

        RequestSpecification rs = new RequestSpecBuilder()
                .log(LogDetail.ALL)
                .build();

        CompanyResponse uResp = given()
                .spec(rs)
                .baseUri("http://users.bugred.ru/tasks/rest")
                .body(cr)
                .when()
                .post("/createcompany")
                .as(CompanyResponse.class);

        System.out.println(uResp);
    }
}
