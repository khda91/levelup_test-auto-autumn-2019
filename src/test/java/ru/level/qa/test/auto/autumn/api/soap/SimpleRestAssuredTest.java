package ru.level.qa.test.auto.autumn.api.soap;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.XML;
import static org.hamcrest.Matchers.equalTo;

public class SimpleRestAssuredTest {

    @Test
    public void doRegisterSoapTest() {
        RequestSpecification rs = new RequestSpecBuilder()
                .log(LogDetail.ALL)
                .build();

        Response soapAction = given()
                .spec(rs)
                .baseUri("http://users.bugred.ru/tasks/soap/WrapperSoapServer.php")
                .contentType(XML)
                .header(new Header("SOAPAction", "http://foo.bar/wrappersoapserver/#doRegister"))
                .body("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" " +
                        "xmlns:wrap=\"http://foo.bar/wrappersoapserver\">\n" +
                        "   <soapenv:Header/>\n" +
                        "   <soapenv:Body>\n" +
                        "      <wrap:doRegister>\n" +
                        "         <email>hbdvksdvbahdvn1123432e111@email.com</email>\n" +
                        "         <name>djndjvdv adlsviaev dsfsadasd11111</name>\n" +
                        "         <password>56789</password>\n" +
                        "      </wrap:doRegister>\n" +
                        "   </soapenv:Body>\n" +
                        "</soapenv:Envelope>")
                .when()
                .post();

        soapAction.then()
                .statusCode(200)
                .contentType(XML)
                .body("doRegisterResponse.email", equalTo("hbdvksdvbahdvn1123432e@email.com"))
                .body("doRegisterResponse.name", equalTo("djndjvdv adlsviaev dsfsadasd11"));
    }
}
