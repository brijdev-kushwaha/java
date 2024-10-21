package com.Task_7_L2;

import java.io.*;
import java.util.Scanner;

public class FileEncryptDecrypt {

    // Simple Caesar Cipher method
    private static String processText(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) ((character + shift - base + 26) % 26 + base);
            }
            result.append(character);
        }
        return result.toString();
    }

    // Method to read from a file
    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        }
        return content.toString();
    }

    // Method to write to a file
    private static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(content);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an option: (1) Encrypt (2) Decrypt");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        System.out.print("Enter the file name or path: ");
        String filePath = scanner.nextLine();
        
        System.out.print("Enter the shift value (1-25): ");
        int shift = scanner.nextInt();
        
        // Ensure shift is within the range
        shift = shift % 26; // Normalize shift value to be within 0-25

        String outputFilePath;
        String text;
        
        try {
            // Read the contents of the file
            text = readFile(filePath);
            
            // Process the text based on user choice
            if (choice == 1) {
                // Encrypt
                String encryptedText = processText(text, shift);
                outputFilePath = "encrypted_" + new File(filePath).getName();
                writeFile(outputFilePath, encryptedText);
                System.out.println("Encryption completed. Saved to " + outputFilePath);
            } else if (choice == 2) {
                // Decrypt
                String decryptedText = processText(text, -shift);
                outputFilePath = "decrypted_" + new File(filePath).getName();
                writeFile(outputFilePath, decryptedText);
                System.out.println("Decryption completed. Saved to " + outputFilePath);
            } else {
                System.out.println("Invalid choice. Please select 1 for Encryption or 2 for Decryption.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

// Output: 
/* Choose an option: (1) Encrypt (2) Decrypt
1
Enter the file name or path: java
Enter the shift value (1-25): 21
An error occurred: java (The system cannot find the file specified) */
