package classandextends;

public class ChinaBook extends Book{

    public ChinaBook(String humName, String name, String ISBN, int price) {
        super(humName, name, ISBN, price);
    }


    public void national(){
        System.out.println("china");
    }

}
