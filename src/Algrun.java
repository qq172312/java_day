public class Algrun {
    public static void main(String[] args){
        Algorithm one=new Algorithm(50);
       // one.productRandom();
        one.outPutNum();

        long stime=System.nanoTime();//开始时间

        one.bubbleSort();
        //one.dInsertSort();
        //one.shellSort(5);

        long etime=System.nanoTime();//结束时间
        System.out.printf("\n消耗 %d 纳秒时间\n",(etime-stime));
        one.outPutNum();
    }
}
