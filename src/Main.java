import java.util.Scanner; // Импортируем класс для работы с вводом с клавиатуры

public class Main { // Открываем основной класс
    public static void main(String[] args) { // Открываем метод main, в котором будет исполняться программа

        // 1. Объявить переменную с типом данных String, название которой состоит из нескольких слов, не инициализировать ей значение.
        String myVariable;

        // 2. Создать константу “NUM” с типом данных int и задать ей любое значение.
        final int NUM = 26;

        // 3. Создать переменную “word” с типом данных String и задать ей любое значение.
        String word = "Салам алейкум!";

        // 4. Задать значение переменной объявленной в пункте 1, которое состояло бы из результата конкатенации константы “NUM” и переменной “word”.
        myVariable = NUM + "" + word;

        // 5. Распечатать в консоли значение всех переменных.
        System.out.println("NUM: " + NUM);
        System.out.println("word: " + word);
        System.out.println("myVariable: " + myVariable);

        // 6. Добавить условную конструкцию, которая выводит сообщение в зависимости от значения NUM.
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        // 7. Сделать так, чтобы программа выводила в консоль строку “Введите ваше имя: ”.
        System.out.println("Введите ваше имя: ");

        // 8. Затем программа должна считать имя пользователя, введенное с клавиатуры.
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // 9. И в конце программа должна поприветствовать пользователя по имени.
        System.out.println("Привет, " + name + "!");

    }
}
