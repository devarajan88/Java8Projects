package com.dev.java8.maskify;

public class CreditCard {

    public static String maskify(String creditCardNumber) {
        if (creditCardNumber.length() <= 5) return creditCardNumber;
        StringBuilder encripted = new StringBuilder();
        for (int i = 0; i < creditCardNumber.length() - 4; i++) {
            if (i > 0) {
                if (Character.isLetter(creditCardNumber.charAt(i))) {
                    encripted.append(creditCardNumber.charAt(i));
                }
                if (String.valueOf(creditCardNumber.charAt(i)).matches("[^a-zA-Z0-9]")) {
                    encripted.append(creditCardNumber.charAt(i));
                }

                if (Character.isDigit(creditCardNumber.charAt(i))) {
                    encripted.append("#");
                }
            } else {
                encripted.append(creditCardNumber.charAt(i));
            }

        }
        encripted.append(creditCardNumber.substring(creditCardNumber.length() - 4));
        return encripted.toString();
    }

    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        System.out.println(card.maskify("1234513-DEVA-$#@!-5827968"));
    }
}
