Keyword Presence Validation in an Article
Write a program to check if an article contains both the keywords "Java" and "programming" using the contains() method and the logical AND (&&) operator.

String article = "This article discusses Java programming.";
Expected Output:
Contains both keywords: true

  ### source code
  
 class Codechef {
    public static void main(String[] args) {
        String article = "This article discusses Java programming.";
        boolean containsBoth = article.contains("Java") && article.contains("programming");
        System.out.println("Conatins both keywords: " +containsBoth);

    }
}
