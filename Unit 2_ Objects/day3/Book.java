package day3;

public class Book {
    private String title;
    private String author;
    private String language;
    private int numWords;
    private int numPages;

    public Book(String title, String author, String language) {
        this.title = title;
        this.author = author;
        this.language = language;
        this.numWords = 0;
        this.numPages = 0;
    }

    public int averageWordsPerPage() {
        return numWords / numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setNumWords (int numWords) {
        this.numWords=numWords;
    }
    public String toString (){
        return title + " by " + author + " (" + language + ")";
    }
}