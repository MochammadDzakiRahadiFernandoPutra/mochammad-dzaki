package BOOK;

public class Book {

    String title;
    int year;
    double price;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String title, int year, double price) {
        this.price = price;
        this.title = title;
        this.year = year;
    }

    public void print() {
        System.out.println("Title: " + getTitle());
        System.out.println("Year: " + getYear());
        System.out.println("Price: " + getPrice());

    }
}
