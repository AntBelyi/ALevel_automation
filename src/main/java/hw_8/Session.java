package hw_8;

@FunctionalInterface

public interface Session {
    void closeSession(CanBeClosed[] points);

}
