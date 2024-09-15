package aqa_hw_9.enums;

public enum Status {
    AVAILABLE("available"),
    SOLD("sold");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
