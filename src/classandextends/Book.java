package classandextends;

public class Book extends Author{
    String name,ISBN;
    int price;

    public Book(String humName, String name, String ISBN, int price) {
        super(humName);
        this.name = name;
        this.ISBN = ISBN;
        this.price = price;
    }

    public void national(){

    }
}
