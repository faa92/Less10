package by.teachmeskills.antonfedoseev.homework10.util;

public class PassportUtils {

    public static final int PASSPORT_SERIES_LENGTH = 2;
    public static final int PASSPORT_DIGITS_LENGTH = 7;
    public static final int PASSPORT_NUMBER_LENGTH = PASSPORT_SERIES_LENGTH + PASSPORT_DIGITS_LENGTH;

    public static boolean isValidPassportNumber(String passportNumber) {
        if (passportNumber.length() != PASSPORT_NUMBER_LENGTH) {
            return false;
        }
        for (int i = 0; i < PASSPORT_SERIES_LENGTH; i++) {
            if (!StringUtil.isLatinAndUppre(passportNumber.charAt(i))) {
                return false;
            }
        }
        for (int i = PASSPORT_SERIES_LENGTH; i < PASSPORT_NUMBER_LENGTH; i++) {
            if (!StringUtil.isArabicDigit(passportNumber.charAt(i))) {
                return false;
            }

        }
        return true;
    }
}
