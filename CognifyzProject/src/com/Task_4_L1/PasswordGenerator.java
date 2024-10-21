package com.Task_4_L1;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        int length = 8; // Desired length of the password
        System.out.println("Generated Password: " + generatePassword(length));
    }

    private static String generatePassword(int length) {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_=+<>?/:;";
        String allChars = uppercaseLetters + lowercaseLetters + digits + specialChars;
        
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }
}

//OutPut: 
// Generated Password: :s6_)FaI
