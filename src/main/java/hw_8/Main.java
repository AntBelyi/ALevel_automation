package hw_8;

public class Main {
    public static void main(String[] args) {
        MyBrowser browser = new MyBrowser();
        MyFile file = new MyFile();

        Lecture30.finishWork(browser);
        Lecture30.finishWork(file);

        Session items = points -> {
            for (CanBeClosed point : points) {
                point.close();
            }
        };
        CanBeClosed[] points = {browser, file};
        items.closeSession(points);
    }

}
