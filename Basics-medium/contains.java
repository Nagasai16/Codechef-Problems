Keyword Presence Validation in an Article
Write a program to check if an article contains both the keywords "Java" and "programming" using the contains() method and the logical AND (&&) operator.

String article = "This article discusses Java programming.";
Expected Output:
Contains both keywords: true

  ### source code
  
 class Codechef {
    public static void main(String[] args) {
        // Define the article or text content to analyze
        String article = "This article discusses Java programming.";
        
        // Use the contains() method with the logical AND operator (&&)
        // to check if the article contains both the keywords 'Java' and 'programming'
        boolean containsBoth = article.contains("Java") && article.contains("programming");

        
        // Print the result, which will be true if both keywords are present, otherwise false
        System.out.println("Conatins both keywords: " +containsBoth);

    }
}
