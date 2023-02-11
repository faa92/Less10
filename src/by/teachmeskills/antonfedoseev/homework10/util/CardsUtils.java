package by.teachmeskills.antonfedoseev.homework10.util;

public class CardsUtils {
    public static final int CARD_NUMBER_LENGTH = 4 * 4;
    public static final int MASKED_CARD_NUMBER_DIGITS_LENGTH = 4;

    public static String maskCardNumber(String cardNumber) {
        if (cardNumber.length() != CARD_NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
        return "**** **** **** "
                + cardNumber.substring(CARD_NUMBER_LENGTH - MASKED_CARD_NUMBER_DIGITS_LENGTH);
    }
}
