package com.dev.java8;

public class EncryptAndDecryptApp {

    private static final int NO_OF_ALPHABETS = 26;

    public static void main(String[] args) {

        EncryptAndDecryptApp app = new EncryptAndDecryptApp();

        String message = "innoWake rules";

        String encryptedMessage = app.encrypt(message, 9);
        System.out.println("Encrypted Message: " + encryptedMessage);

        System.out.println("Decrypted Message: " + app.decrypt("IUHUR", 6));
    }

    public String encrypt(String message, int rotations) {
        String encryptedMessage = null;

        char[] charArray = message.toCharArray();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];
            if (Character.isAlphabetic(character)) {
                character = rotateCharacter(character, rotations);
            }
            builder.append(character);
        }

        encryptedMessage = builder.toString();
        return encryptedMessage;
    }

    private char rotateCharacter(char character, int rotations) {
        rotations = rotations % 26;
        int asciiCode = (int) character;

        if (Character.isUpperCase(character)) {
            asciiCode = asciiCode + rotations;
            if (asciiCode > 90) {
                asciiCode = asciiCode - NO_OF_ALPHABETS;
            }
        } else {
            asciiCode = asciiCode + rotations;
            if (asciiCode > 122) {
                asciiCode = asciiCode - NO_OF_ALPHABETS;
            }
        }

        return (char) asciiCode;
    }

    public String decrypt(String message, int rotations) {
        String decryptedMessage = null;
        char[] charArray = message.toCharArray();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            char character = charArray[i];

            if (Character.isAlphabetic(character))
                character = reverseRotateCharacter(character, rotations);

            builder.append(character);
        }

        decryptedMessage = builder.toString();
        return decryptedMessage;
    }

    private char reverseRotateCharacter(char character, int rotations) {
        rotations = rotations % 26;
        int asciiCode = (int) character;

        if (Character.isUpperCase(character)) {
            asciiCode = asciiCode - rotations;
            if (asciiCode < 65) {
                asciiCode = asciiCode + NO_OF_ALPHABETS;
            }
        } else {
            asciiCode = asciiCode - rotations;
            if (asciiCode < 97) {
                asciiCode = asciiCode + NO_OF_ALPHABETS;
            }
        }

        return (char) asciiCode;
    }

}
