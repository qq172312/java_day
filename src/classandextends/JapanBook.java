package classandextends;

public class JapanBook extends Book{
    int discountPrice;

    public JapanBook(String humName, String name, String ISBN, int price, int discountPrice) {
        super(humName, name, ISBN, price);
        this.discountPrice = discountPrice;
    }

    public void national(){
        System.out.println("japan");
    }
}
