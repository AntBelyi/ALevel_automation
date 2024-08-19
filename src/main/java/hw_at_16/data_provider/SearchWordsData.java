package hw_at_16.data_provider;

import org.testng.annotations.DataProvider;

public class SearchWordsData {

    @DataProvider
    public Object [][] getSearchWords(){

        return new Object[][] {
                {"порцеляна", "порцелян"}
        };
    }
}
