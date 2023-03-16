public class Algrun {
    public static void main(String[] args){
        Algorithm one=new Algorithm(2);
       // one.productRandom();
        one.outPutNum();
        int[] arrayNum={0,2,5,7,9,11,13,15,17,19};

        long stime=System.nanoTime();//开始时间
        //one.binarySearch(arrayNum,15,1,10);   //二分查找
        //one.two_MergeSort(one.testRandom,one.testRandom,1, one.arrayNum-1);   //二路归并排序
        //one.heapSort();   //堆排序
        //one.selectSort(); //直接选择排序
        //one.quickinsert(1, one.arrayNum-1);   //快排
        //one.bubbleSort(); //冒泡排序
        //one.dInsertSort();    //直接插入排序
        //one.shellSort(5); //希尔排序


        long etime=System.nanoTime();//结束时间
        System.out.printf("\n消耗 %d 纳秒时间\n",(etime-stime));
        one.outPutNum();
    }
}
