package api_tests;

import aqa_hw_5.dto.CategoryDto;
import aqa_hw_5.dto.PetDto;
import aqa_hw_5.dto.TagDto;
import aqa_hw_5.enums.Status;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static aqa_hw_5.enums.Endpoint.BASE_URL;
import static io.restassured.RestAssured.given;

public class PutPetTests {

    @Test
    public void verifyPetCanBeUpdated(){

        int petId = 874;

        String petName = "Rokki";
        String petCategory = "Dog";
        String petUrl = "www.url";

        PetDto petDto = new PetDto();

        petDto.setId(petId);
        petDto.setName(petName);
        petDto.setPhotoUrls(List.of(petUrl));

        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(955);
        categoryDto.setName(petCategory);
        petDto.setCategory(categoryDto);

        TagDto tagDto = new TagDto();
        tagDto.setId(366);
        tagDto.setName("puppy");
        petDto.setTags(List.of(tagDto));
        petDto.setStatus(Status.AVAILABLE.getStatus());

        PetDto petDtoPostResponse = given()
                .header("Content-Type", "application/json")
                .body(petDto)
                .post(BASE_URL.getUrl()).as(PetDto.class);

        Assert.assertEquals(petDtoPostResponse.getName(), petName);

        String newURL = "new.url";

        petDto.setName("Rikki Tikki");
        categoryDto.setName("Mangust");
        petDto.setPhotoUrls(List.of(petUrl, newURL));
        petDto.setStatus(Status.SOLD.getStatus());

        PetDto petDtoPutResponse = given()
                .header("Content-Type", "application/json")
                .body(petDto)
                .put(BASE_URL.getUrl()).as(PetDto.class);

        Assert.assertEquals(petDtoPutResponse.getId(), petDto.getId());
        Assert.assertEquals(petDtoPutResponse.getName(), petDto.getName());
        Assert.assertEquals(petDtoPutResponse.getCategory().getName(), categoryDto.getName());
        Assert.assertTrue(petDtoPutResponse.getPhotoUrls().contains(newURL));
        Assert.assertEquals(petDtoPutResponse.getStatus(), Status.SOLD.getStatus());

    }
}
