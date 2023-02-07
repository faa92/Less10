package util.StringUtils;

import java.util.Arrays;

public class StringUtil {

    public static String getNormalStringWithoutSpaces(String str) {
        if (str.length() == 0) {
            return str;
        }
        String tmp = str.trim();
        if (tmp.length() == 0) {
            return tmp;
        }
        char[] tmpString = tmp.toCharArray();
        int elementsCount = 1;
        for (int i = 1; i < tmpString.length; i++) {
            if (!(tmpString[i - 1] == ' ' && tmpString[i] == ' ')) {
                tmpString[elementsCount++] = tmpString[i];
            }
        }
        return new String(tmpString, 0, elementsCount);
    }


    public static String getProtectNumberCard(String str) {
        if (str.length() != 16) {
            throw new IllegalArgumentException("Некорректный номер карты!");
        }
        String str1 = str.trim();
        char[] arr = str1.toCharArray();
        for (int i = 0; i < arr.length - 4; i++) {
            arr[i] = '*';
        }
        return new String(arr);
    }

    public static String getSurnameNamePatronymic(String surName, String name, String patronymic) {
        if (surName.length() == 0 || name.length() == 0) {
            throw new IllegalArgumentException("Некорректный ввод фамилии или имя!");
        }
        char[] name1 = name.toCharArray();
        char firstLetterName = name1[0];
        String firstLN = String.valueOf(firstLetterName);

        char[] patronymic1 = patronymic.trim().toCharArray();
        char firstLetterPatronymic = patronymic1[0];
        String firstPatronymic = String.valueOf(firstLetterPatronymic);

        if (patronymic.length() != 0) {
            return new String(surName.trim().toUpperCase() + ' ' + firstLN.trim().toUpperCase() + '.' + firstPatronymic.trim().toUpperCase() + '.');
        }
        return new String(surName.trim().toUpperCase() + ' ' + firstLN.trim().toUpperCase() + '.');
    }

    public static boolean isBelarusPassport(String pas) {
        if (pas.length() != 9) {
            return false;
        }
        char[] pas1 = pas.toCharArray();

        if (!isLatinAndUppre(pas1[0]) || !isLatinAndUppre(pas1[1])) {
            return false;
        }
        for (int i = 2; i < pas1.length; i++) {
            if (!Character.isDigit(pas1[i])) {
                return false;
            }
        }
        return true;
    }



    public static boolean isLatinAndUppre(char inputChar) {

        return Character.isUpperCase(inputChar) && ((inputChar >= 'A' && inputChar <= 'Z') ||
                (inputChar >= 'a' && inputChar <= 'z'));
    }

}
