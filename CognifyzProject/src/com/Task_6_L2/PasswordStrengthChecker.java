package com.Task_6_L2;

import java.util.Scanner;

public class PasswordStrengthChecker {
    
    public static String checkPasswordStrength(String password) {
        if (password.length() < 8) {
            return "Weak: Password must be at least 8 characters long.";
        }

        if (!password.matches(".*[A-Z].*")) {
            return "Weak: Password must contain at least one uppercase letter.";
        }

        if (!password.matches(".*[a-z].*")) {
            return "Weak: Password must contain at least one lowercase letter.";
        }

        if (!password.matches(".*[0-9].*")) {
            return "Weak: Password must contain at least one digit.";
        }

        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return "Weak: Password must contain at least one special character.";
        }

        return "Strong: Your password is strong!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        String strengthMessage = checkPasswordStrength(password);
        System.out.println(strengthMessage);
        
        scanner.close();
    }
}

// OutPut: 
/* Enter your password : Vikash979578@
Strong : Your password is strong! */