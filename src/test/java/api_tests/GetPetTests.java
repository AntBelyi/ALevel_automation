package api_tests;

import aqa_hw_19.dto.PetDto;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static aqa_hw_19.enums.Endpoint.BASE_URL;
import static io.restassured.RestAssured.given;

public class GetPetTests {

    @Test
    public void verifyPetCanBeObtainedById() {

        int petIdToFind = 874;

        Response response = given().get(BASE_URL.getUrl() + petIdToFind);

        PetDto pet = response.as(PetDto.class);

        System.out.println(pet);

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(pet.getId(), petIdToFind);

    }

    @Test
    public void verifyPetNotExistsById() {

        int petIdToFind = 874;

        Response response = given().get(BASE_URL.getUrl() + petIdToFind);

        Assert.assertEquals(response.getStatusCode(), 404);

    }

}

