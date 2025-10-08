### The contains() Method in Java Strings

In Java, the contains() method is a useful String method that allows you to check if a particular sequence of characters (a substring) is present within a larger String. It is commonly used when verifying the presence of specific content within a String.

**Syntax:**

boolean result = stringName.contains(subString);
subString: The sequence of characters you want to search for in the main String.

**Return value:**
The method returns a boolean value (true or false).
It returns true if the subString is found within the main String.
It returns false if the subString is not found.
Case sensitivity: The contains() method is case-sensitive, meaning "Java" and "java" are treated as different.

**Examples:**
class Codechef {
    public static void main(String[] args) {
        // Step 1: Initialize a string
        String text = "Hello, Java programmer!";

        // Step 2: Use the contains() method to check for specific substrings
        boolean containsJava = text.contains("Java");            // Returns true
        boolean containsJAVA = text.contains("JAVA");            // Returns false (case-sensitive)
        boolean containsEmptyString = text.contains("");         // Returns true (empty string is always contained)

        // Step 3: Print the results
        System.out.println("Contains 'Java': " + containsJava);
        System.out.println("Contains 'JAVA': " + containsJAVA);
        System.out.println("Contains empty string: " + containsEmptyString);
    }
}
