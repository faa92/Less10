package by.teachmeskills.antonfedoseev.homework10;

import by.teachmeskills.antonfedoseev.homework10.util.*;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int task = scanner.nextInt();

        switch (task) {
            case 1 -> {
                System.out.print("Введите строку: ");
                String user = InputUser.getUserString();
                System.out.print("Результат: " + StringUtil.getNormalStringWithoutSpaces(user));
            }
            case 2 -> {
                System.out.print("Введите номер банковской карты: ");
                String user = InputUser.getUserString();
                System.out.println("Результат: ");
                System.out.print(CardsUtils.maskCardNumber(user));
            }
            case 3 -> {
                System.out.print("Введите фамилию: ");
                String surname = InputUser.getUserString();
                System.out.print("Введите имя: ");
                String name = InputUser.getUserString();
                System.out.print("Введите отчество: ");
                String patronymic = InputUser.getUserString();
                System.out.println("Результат: " + NameUtils.getShortFullName(surname, name, patronymic));
            }
            case 4 -> {
                System.out.print("Введите номер паспорта: ");
                String pas = InputUser.getUserString();
                System.out.println(PassportUtils.isValidPassportNumber(pas));

            }
            case 5 -> {
                System.out.print("Введите пароль: ");
                String pas = InputUser.getUserString();
                System.out.print(PasswordUtils.isProtectPassword(pas));

            }
            case 6 -> {
                System.out.print("Введите email: ");
                String email = InputUser.getUserString();
                System.out.println(EmailUtils.isEmail(email));
            }
        }


    }
}
