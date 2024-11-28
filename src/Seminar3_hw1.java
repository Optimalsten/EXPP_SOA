/*
Напишите приложение, которое будет запрашивать у пользователя следующие данные,
разделенные пробелом:  Фамилия Имя Отчество дата_рождения номер_телефона пол
Форматы данных:
фамилия, имя, отчество - строки
дата_рождения - строка формата dd.mm.yyyy
номер_телефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству.
Если количество не совпадает, вернуть код ошибки, обработать его
и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение должно распарсить полученную строку и выделить из нее требуемые значения.
Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
Можно использовать встроенные типы java и создать свои.
Исключение должно быть корректно обработано,
пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
в него в одну строку должны записаться полученные данные, вида:
<Фамилия><Имя><Отчество><дата_рождения> <номер_телефона><пол>
Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.
При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
пользователь должен увидеть стектрейс ошибки.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Seminar3_hw1 {

    private static final int fields_number = 6;

    public static void main(String[] args) {

        // ввод данных от пользователя
        Scanner scanner = new Scanner((System.in));
        String input = scanner.nextLine();
        scanner.close();

        // распарсить введенную строку
        String[] fields = input.split(" ");

        // проверить количество полей
        if (fields_number != fields.length) {
            System.out.println("Неверное количество полей (данных)! Вы ввели " + fields.length + ", введите 6 полей!");
        }

        // разложение частей введенной строки в переменные (для удобства)
        // Первые три поля - Ф И О
        String lastName = fields[0];
        String firstName = fields[1];
        String middleName = fields[2];

        // Обработка даты рождения
        LocalDate birthDate;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            birthDate = LocalDate.parse(fields[3], formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты.");
            return;
        }

        // Обработка номера телефона
        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(fields[4]);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат телефона.");
            return;
        }

        // Обработка данных пола
        String gender = fields[5];
        if ((!"m".equals(gender)) && (!"f".equals(gender))) {
            System.out.println("Неверный формат пола, введите f или m.");
            return;
        }

        // запись
        String fileName = lastName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(lastName + " " + firstName + " " + middleName + " " + birthDate.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " +phoneNumber + " " + gender);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка записи!");
        }
    }
}
