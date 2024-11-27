/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Seminar2_hw4 {

    public static void main(String[] args) throws Exception {

        System.out.println("Введите строку: ");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        if ("".equals(str)) {
            throw new Exception("Введена пустая строка!");
        }
        else {
            System.out.println(str);
        }
    }
}
