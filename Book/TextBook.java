package BOOK;

public class TextBook extends Book {
    String Subject;

    public String getSubject() {
        return this.Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }
    
    public TextBook(){
        super();
        Subject = "";
    }
    public TextBook(String title, int year, String genre) {
    super();
        this.title=title;
        super.print();
        System.out.println("Subject: " + this.Subject);
    }
}