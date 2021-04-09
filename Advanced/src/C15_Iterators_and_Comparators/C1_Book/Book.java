package C15_Iterators_and_Comparators.C1_Book;

import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> author;

    public Book(String title, int year, List<String> author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }
    private String setTitle(String newtitle){
       return this.title = newtitle;

    }private String setYear(String newyear){
        return newyear;

    }
}
