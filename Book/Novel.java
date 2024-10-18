package BOOK;

public class Novel extends Book {
    String genre;

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public Novel(){
        super();
        genre = "";
    }
    public Novel(String title, int year, String genre) {
    super();
        this.genre=genre;
        super.print();
        System.out.println("Genre: " + this.genre);
    }
}