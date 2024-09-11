package hw_14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Class<Student> studentClass = Student.class;

            Constructor<Student> constructor = studentClass.getConstructor(String.class, int.class, String.class);

            Student student = constructor.newInstance("Andrii", 20, "Ivanov");

            Field nameField = studentClass.getDeclaredField("name");
            Field ageField = studentClass.getDeclaredField("age");
            Field surnameField = studentClass.getDeclaredField("surname");

            nameField.setAccessible(true);
            ageField.setAccessible(true);
            surnameField.setAccessible(true);

            System.out.println("Name: " + nameField.get(student));
            System.out.println("Age: " + ageField.get(student));
            System.out.println("Surname: " + surnameField.get(student));

            Method infoMethod = studentClass.getMethod("info");
            infoMethod.invoke(student);

            Method privateMethod = studentClass.getDeclaredMethod("privateDisplayMethod", String.class);
            privateMethod.setAccessible(true);
            privateMethod.invoke(student, "Hello Reflection!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}