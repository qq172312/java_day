import java.util.Random;

public class Algorithm {
    private int[] testRandom;
    private int[] dk=new int[]{1,2,4,8,16};
    Random r=new Random();
    int arrayNum;

    public Algorithm(int arrayNum){
        this.arrayNum=arrayNum;
        testRandom=new int[arrayNum];
        for(int i=1;i<arrayNum;i++) {
            testRandom[i]=r.nextInt(999);
        }
    }

    public void outPutNum() {
        for (int n : testRandom)
            System.out.print(n + " ");
    }

    //直接插入排序
    public void dInsertSort(){
        int j=0;
        for(int i=2;i<arrayNum;i++){
            if(testRandom[i]<testRandom[i-1]){
                testRandom[0]=testRandom[i];
                for(j=i-1;testRandom[0]<testRandom[j];j--){
                    testRandom[j + 1] = testRandom[j];
                }
                testRandom[j+1]=testRandom[0];
            }
        }
        System.out.print("\n直接插入排序:");
    }
    //希尔排序
    public void shellSort(int dknum){
        for(int i=dknum-1;i>-1;i--){
            shellInsert(dk[i]);
           // System.out.printf("\n第 %d 层排序 : ",i+1);
          //  outPutNum();
        }
    }

    public void shellInsert(int dk){
        int j=0;
        for(int i=dk+1;i<arrayNum;i++){
            if(testRandom[i]<testRandom[i-dk]){
                testRandom[0]=testRandom[i];
                for(j=i-dk;(j>0)&&(testRandom[0]<testRandom[j]);j=j-dk){
                    testRandom[j + dk] = testRandom[j];
                }
                testRandom[j+dk]=testRandom[0];
            }
        }

    }

    //冒泡序排
    public void bubbleSort()
    {
        int i,j,swap;//swap为0时说明排序完成，跳出循环
        for(i=1;i<arrayNum;i++){
            swap=0;
            for(j=1;j<arrayNum-i;j++)
                if(testRandom[j]>testRandom[j+1]){
                    testRandom[0]=testRandom[j];
                    testRandom[j]=testRandom[j+1];
                    testRandom[j+1]=testRandom[0];
                    swap=1;
                }
            if(swap==0) break;
        }
    }

}
