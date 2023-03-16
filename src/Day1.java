import java.util.Scanner;

public class Day1 {
    private static String adadad;
    int age;
    String name;

    public Day1(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public static void main(String[] args){
        Day1 one =new Day1("张翔");
        
        Scanner scan=new Scanner(System.in);
        System.out.println("int型:");
        int num1=scan.nextInt();
        System.out.println(num1);
        System.out.println("line型:");

        scan.close();
    }
}
