package api_tests;

import aqa_hw_9.dto.CategoryDto;
import aqa_hw_9.dto.PetDto;
import aqa_hw_9.dto.TagDto;
import aqa_hw_9.enums.Status;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static aqa_hw_9.enums.Endpoint.BASE_URL;
import static io.restassured.RestAssured.given;

public class PostPetTests {

    @Test
    public void verifyPetCanBePosted() {

        int petId = 874;
        int expectedStatusCode = 200;
        String petName = "Rex";
        String petCategory = "Dog";
        String petStatus = Status.AVAILABLE.getStatus();

        PetDto pet = new PetDto();

        pet.setId(petId);
        pet.setName(petName);
        pet.setPhotoUrls(List.of("www.url"));

        CategoryDto category = new CategoryDto();
        category.setId(956);
        category.setName(petCategory);
        pet.setCategory(category);

        TagDto tag = new TagDto();
        tag.setId(398);
        tag.setName("puppy");
        pet.setTags(List.of(tag));

        pet.setStatus(petStatus);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(pet)
                .post(BASE_URL.getUrl());

        Assert.assertEquals(response.getStatusCode(), expectedStatusCode);

        PetDto obtainedPetDto = given().get(BASE_URL.getUrl() + petId).as(PetDto.class);

        Assert.assertEquals(obtainedPetDto.getId(), petId);
        Assert.assertEquals(obtainedPetDto.getName(), petName);
        Assert.assertEquals(obtainedPetDto.getCategory().getName(), petCategory);
        Assert.assertEquals(obtainedPetDto.getStatus(), petStatus);

    }
}
