package classandextends;

public class TransBook extends Book{
    String originalName;

    public TransBook(String humName, String name, String ISBN, int price, String originalName) {
        super(humName, name, ISBN, price);
        this.originalName = originalName;
    }

    public void national(){
        System.out.println("foreign");
    }
}
