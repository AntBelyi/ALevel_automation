package hw_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        String[] arrCity = {
                "Київ", "Харків", "Львів", "Одеса", "Дніпро", "Запоріжжя", "Вінниця", "Полтава", "Чернігів", "Херсон",
                "Амстердам", "Варшава", "Лондон", "Берлін", "Париж", "Мадрид", "Рим", "Прага", "Будапешт", "Відень",
                "Токіо", "Сеул", "Пекін", "Сінгапур", "Гонконг", "Шанхай", "Тайбей", "Бангкок", "Куала-Лумпур", "Делі",
                "Москва", "Санкт-Петербург", "Мінськ", "Алмати", "Ташкент", "Баку", "Єреван", "Тбілісі", "Ашхабад", "Бішкек",
                "Нью-Йорк", "Лос-Анджелес", "Чикаго", "Х'юстон", "Фінікс", "Філадельфія", "Сан-Антоніо", "Сан-Дієго", "Даллас", "Сан-Хосе",
                "Мехіко", "Гвадалахара", "Монтеррей", "Пуебла", "Толука", "Тіхуана", "Леон", "Сьюдад-Хуарес", "Торреон", "Меріда",
                "Буенос-Айрес", "Ріо-де-Жанейро", "Сан-Паулу", "Сантьяго", "Ліма", "Богота", "Каракас", "Кіто", "Ла-Пас", "Монтевідео",
                "Кейптаун", "Йоганнесбург", "Каїр", "Лагос", "Найробі", "Аддис-Абеба", "Хартум", "Кампала", "Дар-ес-Салам", "Алжир",
                "Сідней", "Мельбурн", "Брисбен", "Перт", "Аделаїда", "Канберра", "Окленд", "Веллінгтон", "Крайстчерч", "Гамільтон",
                "Торонто", "Монреаль", "Ванкувер", "Калгарі", "Оттава", "Едмонтон", "Вінніпег", "Гамільтон", "Квебек", "Саскатун"
        };

        boolean foundCity = false;
        boolean isQuit = false;

        System.out.println("Давай пограємо у «Міста». Ти перший називай!");

        Scanner scanner = new Scanner(System.in);

        do {
            String userInput = scanner.nextLine();
            char firstLetterTiFindInArray = userInput.toLowerCase().charAt(userInput.length() - 1);

            if (firstLetterTiFindInArray == 'q') {
                isQuit = true;
                break;
            }

            for (int i = 0; i < arrCity.length; i++) {
                if (arrCity[i].toLowerCase().charAt(0) == firstLetterTiFindInArray) {
                    System.out.println(arrCity[i]);
                    arrCity[i] = "_" + arrCity[i];
                    foundCity = true;
                    break;
                } else
                    foundCity = false;
            }

        } while (foundCity);

        if (!isQuit)
            System.out.println("Я програв, ти знаєш більше назв міст");

        scanner.close();
    }
}
