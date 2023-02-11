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


//    public static String getProtectNumberCard(String str) {
//        if (str.length() != 16) {
//            throw new IllegalArgumentException("Некорректный номер карты!");
//        }
//        String str1 = str.trim();
//        char[] arr = str1.toCharArray();
//        for (int i = 0; i < arr.length - 4; i++) {
//            arr[i] = '*';
//        }
//        return new String(arr);
//    }

//    public static String getSurnameNamePatronymic(String surName, String name, String patronymic) {
//        if (name.length() == 0 || surName.length() == 0) {
//            throw new IllegalArgumentException("Некорректные имя или фамилия");
//        }
//        if (patronymic.length() != 0) {
//            return surName + " " + name.toUpperCase().charAt(0) + "." + patronymic.toUpperCase().charAt(0) + ".";
//        }
//        return surName + " " + name.toUpperCase().charAt(0) + ".";
//    }

//    public static boolean isBelarusPassport(String pas) {
//        if (pas.length() != 9) {
//            return false;
//        }
//        char[] pas1 = pas.toCharArray();
//
//        if (!isLatinAndUppre(pas1[0]) || !isLatinAndUppre(pas1[1])) {
//            return false;
//        }
//        for (int i = 2; i < pas1.length; i++) {
//            if (!Character.isDigit(pas1[i])) {
//                return false;
//            }
//        }
//        return true;
//    }

//    public static boolean isProtectPassword(String pass) {
//        if (pass.length() < 8) {
//            return false;
//        }
//        char[] charStrPass = pass.toCharArray();
//
//        boolean upperCase = false;
//        boolean lowerCase = false;
//        boolean nums = false;
//
//        for (char c : charStrPass) {
//            if (isLatinOrCyrillicUpperCase(c)) {
//                upperCase = true;
//            }
//            if (isLatinOrCyrillicLowerCase(c)) {
//                lowerCase = true;
//            }
//            if (Character.isDigit(c)) {
//                nums = true;
//            }
//            if (nums && lowerCase && upperCase) {
//                return true;
//            }
//        }
//        return false;
//    }

//    public static boolean isEmail(String str) {
//
//        int atIndex = str.indexOf('@');
//
//        if (str.contains("@") && (atIndex == str.lastIndexOf('@')) && !str.contains(" ")) {
//            return atIndex < str.length() -1 && atIndex > 0;
//        }
//        return false;
//    }


