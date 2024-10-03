package AT_final_project_yapiko.data_provider;

import org.testng.annotations.DataProvider;

public class SearchWordsData {
    @DataProvider
    public Object[][] getSearchWords() {
        return new Object[][] {
                {"сет", "сет"},
                {"піца", "піца"},
                {"суші", "суші"}
        };
    }
}
