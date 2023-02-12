package by.teachmeskills.antonfedoseev.homework10.util;

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

    public static boolean isLatinAndUppre(char inputChar) {
        return Character.isUpperCase(inputChar) && ((inputChar >= 'A' && inputChar <= 'Z') ||
                (inputChar >= 'a' && inputChar <= 'z'));
    }

    public static boolean isLatinOrCyrillicUpperCase(char ch) {
        return ((ch >= 'A' && ch <= 'Z') || (ch >= 'А' && ch <= 'Я')
                || ch == 'Ё');
    }

    public static boolean isLatinOrCyrillicLowerCase(char ch) {
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'а' && ch <= 'я')
                || ch == 'ё');
    }

    public static boolean isArabicDigit(char digit) {

        if (digit < '0' && digit > '9') {
            return false;
        }

        return true;
    }
}


