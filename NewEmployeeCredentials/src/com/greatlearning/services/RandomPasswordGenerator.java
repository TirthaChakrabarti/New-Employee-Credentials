package com.greatlearning.services;

import java.security.SecureRandom;

public class RandomPasswordGenerator {

	private static final String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String smallLetters = "abcdefghijklmnopqrstuvwxyz";
    private static final String numbers = "0123456789";
    private static final String specialCharacters = "!@#$%^&*()_+-=[]|,./?><";
    
    static SecureRandom secureRandom = new SecureRandom();

    String generateRandomPassword(int length) {

        StringBuilder password = new StringBuilder();

        // Picking at least one character from each category
        password.append(getRandomCharacter(capitalLetters));
        password.append(getRandomCharacter(smallLetters));
        password.append(getRandomCharacter(numbers));
        password.append(getRandomCharacter(specialCharacters));
        

        // Picking remaining characters from any category
        for (int i = 1; i <= length-4; i++) {
        	String characters = capitalLetters + smallLetters + numbers + specialCharacters;
            password.append(getRandomCharacter(characters));
        }

        return password.toString();
    }
    
    private static char getRandomCharacter(String string) {
        int index = secureRandom.nextInt(string.length());
        return string.charAt(index);
    }
}
