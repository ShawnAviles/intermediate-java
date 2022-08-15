package day3;

public class BookTester {
    public static void main(String[] args) {
        Book b1 = new Book ("Tales of Two Cities", "Charles Dickens", "English");
        b1.setNumPages(448);
        b1.setNumWords(135420);

        System.out.println(b1.averageWordsPerPage());
        System.out.println(b1);

        //Book b2 = new Book("Don Quixote", "Miguel Cervantes", "Spanish"){
          //  System.out.println (b2);
        //}



    }
}