package classandextends;

public class Shopping{
    public static void main(String[] args){
        Book one=new ChinaBook("张三","飞行的表达式","sdkjfsk", 3000);
        Book two=new TransBook("李四","sjafaada", "kadaahdad", 999, "打开萨夫卡");
        //Book two=new JapanBook();
        //Book there =new TransBook();
        one.national();

        //two.national();
        return;

    }
}
