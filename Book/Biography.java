package BOOK;

public class Biography extends Book {
    String About;

    public String getAbaout() {
        return this.About;
    }

    public void setAbout(String About) {
        this.About = About;
    }
    
    public Biography(){
        super();
        About = "";
    }
    public Biography(String title, int price, String genre, String About) {
    super();
        this.About=About;
        super.print();
        System.out.println("about: " + About);
    }
}