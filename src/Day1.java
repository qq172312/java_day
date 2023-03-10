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
        //System.out.println(one.name);
      //  one.setAge(100);
       // System.out.println(one.age);
        Scanner scan=new Scanner(System.in);
        String testChar="dsada";
        System.out.println("next方式输入的字符:"+testChar);
        /*scan.hasNextLine();
        System.out.println(scan.nextLine());*/
        /*if(scan.hasNextLine()){
            String textCharacter=scan.nextLine();
            System.out.println("第一次"+textCharacter);
            System.out.println("第二次"+textCharacter);
        }*/
        scan.close();
    }
}
