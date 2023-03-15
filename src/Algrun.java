public class Algrun {
    public static void main(String[] args){
        Algorithm one=new Algorithm(60);
       // one.productRandom();
        one.outPutNum();

        long stime=System.nanoTime();//开始时间

        one.two_MergeSort(one.testRandom,one.testRandom,1, one.arrayNum-1);
        //one.heapSort();
        //one.selectSort();
        //one.quickinsert(1, one.arrayNum-1);
        //one.bubbleSort();
        //one.dInsertSort();
        //one.shellSort(5);

        long etime=System.nanoTime();//结束时间
        System.out.printf("\n消耗 %d 纳秒时间\n",(etime-stime));
        one.outPutNum();
    }
}
