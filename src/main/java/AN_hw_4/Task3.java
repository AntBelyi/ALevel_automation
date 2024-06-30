package AN_hw_4;

public class Task3 {
    public static void main(String[] args) {
        String text = "The forest sheds its crimson attire,\nSilver frost wilts the field,\nThe day peeks in as if by chance\nAnd hides behind the surrounding mountains.";
        System.out.println(text);
        text = text.toLowerCase();
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.equals("the")) {
                count++;
            }
        }
        System.out.println("The word 'the' occurs " + count + " times in the text.");
    }
}