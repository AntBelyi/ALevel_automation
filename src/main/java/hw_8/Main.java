package hw_8;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyBrowser myBrowser = new MyBrowser();
        MyFile myFile = new MyFile();

        Lecture30.finishWork(myBrowser);
        Lecture30.finishWork(myFile);

        @FunctionalInterface
        interface SessionCloser {
            void closeSession(List<CanBeClosed> entities);
        }

        SessionCloser closer = (entities) -> {
            for (CanBeClosed entity : entities) {
                entity.close();
            }
        };

        List<CanBeClosed> entities = Arrays.asList(myBrowser, myFile);
        closer.closeSession(entities);
    }
}
