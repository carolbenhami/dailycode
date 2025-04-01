// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // Find and fix the bug in each of these regex lines:
        String text1 = "file.txt";
        boolean result1 = text1.matches("file.txt");  // Should match "file.txt" exactly
        System.out.println(result1);
 
        String[] parts2 = "apple,banana;orange".split("{,;}"); // Should split on commas and semicolons
        System.out.println(parts2);
 
        //String result3 = "abbbbbc".replaceAll("a+bc", "X"); // Should replace "abbbbbc" with "X"
 
        //String result4 = "abc123def456".replaceAll("\\d+", "[\\d+]"); // Should wrap digits in brackets
 
        //String result5 = "C:\\Program Files\\Java".replaceAll("\\", "/"); // Should replace backslashes with forward slashes
    }
}


public class InputValidator {
    public static void main(String[] args) {
        // Write regex patterns for the following:
        
        // 1. Email validation - should match valid email addresses
        String emailRegex = ""; // YOUR REGEX HERE
        
        // 2. US phone number validation - should match formats like: 
        // 123-456-7890, (123) 456-7890, 123.456.7890
        String phoneRegex = ""; // YOUR REGEX HERE
        
        // 3. Reject strings with whitespace - should return false if the string contains any spaces
        String noWhitespaceRegex = ""; // YOUR REGEX HERE
        
        // Test your patterns:
        System.out.println("test@example.com".matches(emailRegex));  // should be true
        System.out.println("invalid-email".matches(emailRegex));  // should be false
        
        System.out.println("123-456-7890".matches(phoneRegex));  // should be true
        System.out.println("(123) 456-7890".matches(phoneRegex));  // should be true
        
        System.out.println("NoSpaces".matches(noWhitespaceRegex));  // should be true
        System.out.println("Has Spaces".matches(noWhitespaceRegex));  // should be false
    }
}

public class WordExtractor {
    public static void main(String[] args) {
        // Use regex with split() to extract just the words from this string
        String input = "Python3Java2Go5Rust";
        
        // Write a regex to split the string at digits
        String[] words = input.split("\\d"); // YOUR REGEX HERE
        
        // Expected output: ["Python", "Java", "Go", "Rust"]
        System.out.println("Extracted words:");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }
    }
}



public class ReplaceText
 {
    public static void main(String[] args) {
        String sentence = "I love Java and Java loves me.";
        
        // 1. Replace the FIRST occurrence of "Java" with "Python"
        String firstReplaced = ""; // YOUR CODE HERE
        
        // 2. Replace ALL occurrences of "Java" with "Python"
        String allReplaced = ""; // YOUR CODE HERE
        
        // 3. Replace all spaces with underscores
        String noSpaces = ""; // YOUR CODE HERE
        
        // Print your results
        System.out.println("After first replacement: " + firstReplaced);
        System.out.println("After replacing all: " + allReplaced);
        System.out.println("After replacing spaces: " + noSpaces);
    }
}

