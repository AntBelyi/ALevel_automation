package api_tests;

import aqa_hw_9.dto.PetDto;
import aqa_hw_9.dto.NotFoundPetEntityDto;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static aqa_hw_9.enums.Endpoint.BASE_URL;
import static io.restassured.RestAssured.given;

public class GetPetTests {

    @Test
    public void verifyPetCanBeObtainedById() {

        int petIdToFind = 11;

        Response response = given().get(BASE_URL.getUrl() + petIdToFind);

        PetDto pet = response.as(PetDto.class);

        System.out.println(pet);
        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(pet.getId(), petIdToFind);

    }

    @Test
    public void verifyPetNotExistsById() {

        int petIdToFind = 777958474;

        Response response = given().get(BASE_URL.getUrl() + petIdToFind);

        Assert.assertEquals(response.getStatusCode(), 404);

        NotFoundPetEntityDto petNotFound = response.as(NotFoundPetEntityDto.class);

        Assert.assertEquals(petNotFound.getCode(), 1);
        Assert.assertEquals(petNotFound.getType(), "error");
        Assert.assertEquals(petNotFound.getMessage(), "Pet not found");

    }
}

