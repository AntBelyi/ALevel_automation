package tb_olx_project.olx_data_provider;

import org.testng.annotations.DataProvider;

public class OLXDataProvider {

    @DataProvider
    public Object[][] getSocialMedia() {
        return new Object[][]{
                {"https://www.facebook.com/olx.ua", "[data-testid='facebook']"},
                {"https://www.youtube.com/user/olxua", "[data-testid='youtube']"},
                {"https://x.com/olx_ua", "[data-testid='twitter']"}
        };
    }

    @DataProvider
    public Object [][] getSearchWords(){

        return new Object[][] {
                {"порцеляна", "порцелян"}
        };
    }
}