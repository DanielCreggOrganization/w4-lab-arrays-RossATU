package ie.atu.arrays;

public class Book {
    private String title;
    private String author;
    private int age;
    
    Book(String title,String  author) {
        this.title = title;
        this.author = author;
    }
    // Getter methods
    String getTitle() {
        return title;
    }

    int getAge() {
        return age;
    }
    String getAuthor() {
        return author;
}}
