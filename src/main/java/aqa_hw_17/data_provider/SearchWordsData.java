package aqa_hw_17.data_provider;

import org.testng.annotations.DataProvider;

public class SearchWordsData {

    @DataProvider
    public Object [][] getSearchWords(){

        return new Object[][] {
                {"порцеляна", "порцелян"}
        };
    }
}
