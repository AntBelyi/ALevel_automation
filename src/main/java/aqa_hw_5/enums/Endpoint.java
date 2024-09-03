package aqa_hw_5.enums;

public enum Endpoint {

    BASE_URL("https://petstore.swagger.io/v2/pet/");

    Endpoint(String url) {
        this.url = url;
    }

    private final String url;

    public String getUrl() {
        return url;
    }
}
