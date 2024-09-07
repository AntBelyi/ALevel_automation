package api_tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static aqa_hw_9.enums.Endpoint.BASE_URL;
import static io.restassured.RestAssured.given;

public class DeletePetRequest {

    @Test
    public void verifyPetCanBeDeletedById() {

        int petIdToFind = 874;

        Response response = given().delete(BASE_URL.getUrl() + petIdToFind);

        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test
    public void verifyPetNotExistsDeleteById() {

        int petIdToFind = 874;

        Response response = given().delete(BASE_URL.getUrl() + petIdToFind);

        Assert.assertEquals(response.getStatusCode(), 404);

    }

}
