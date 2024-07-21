package hw_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cities = {"Харків", "Алушта", "Бахмут", "Галич", "Глухів", "Дніпро", "Чигирин", "Луцьк", "Київ", "Богодухів", "Валки", "Дніпро", "Ніжин", "Житомир", "Ірпінь", "Ізюм", "Лиман", "Миколаїв", "Носівка", "Обухів", "Пологи", "Рівне", "Одеса", "Славутич", "Тернопіль", "Умань", "Феодосія", "Чигирин", "Щастя", "Яремче", "Ямпіль"};

        List<String> availableCities = new ArrayList<>();
        for (String city : cities) {
            availableCities.add(city.toLowerCase());
        }

        System.out.println("Let's play in game \"The cities\". You are the first to say it in Ukrainian!");

        while (true) {
            System.out.println("Name the city:");
            String userCity = scanner.nextLine().trim().toLowerCase();

            availableCities.remove(userCity);

            char lastChar = userCity.charAt(userCity.length() - 1);

            String computerCity = null;
            for (String city : availableCities) {
                if (city.charAt(0) == lastChar) {
                    computerCity = city;
                    break;
                }
            }

            if (computerCity == null) {
                System.out.println("I lost, you know more city names.");
                break;
            }

            System.out.println("My city: " + capitalize(computerCity));

            availableCities.remove(computerCity);

            System.out.println("Now it's your turn to name the city by letter " + computerCity.charAt(computerCity.length() - 1) + ":");
        }
    }
        private static String capitalize(String city) {
        if (city == null || city.isEmpty()) {
            return city;
        }
        return Character.toUpperCase(city.charAt(0)) + city.substring(1);

    }
}
