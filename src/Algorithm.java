import java.util.Random;

public class Algorithm {
    public int[] testRandom;
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

    //快速选择排序
    public void quickinsert(int s,int t){
        if(s<t){
            int i=quickSort(s,t);
            quickinsert(s, i-1);
            quickinsert(i+1,t);
        }
    }

    public int quickSort(int low,int high)
    {
        testRandom[0]=testRandom[low];
        while(low!=high){
            while (low<high&&testRandom[high]>testRandom[0])
                high--;
            if(low<high){
                testRandom[low]=testRandom[high];
                low++;
            }
            while (low<high&&testRandom[low]<testRandom[0])
                low++;
            if(low<high){
                testRandom[high]=testRandom[low];
                high--;
            }
        }

        testRandom[low]=testRandom[0];
        return low;
    }

    //简单选择排序
    public void selectSort(){
        int mark=0;
        for(int i=1;i<arrayNum;i++) {
            testRandom[0]=testRandom[i];
            for (int j = i + 1; j < arrayNum; j++) {
                if (testRandom[j] < testRandom[0]){
                    testRandom[0]=testRandom[j];
                    mark=j;
                }
            }
            testRandom[mark]=testRandom[i];
            testRandom[i]=testRandom[0];
        }
    }

    //堆排序
    public void heapSort(){
        int i;
        for(i=(arrayNum/2);i>=1;i--) {
            heapAdjust(i, arrayNum-1);
        }
        for(i=arrayNum-1;i>1;i--){
            testRandom[0]=testRandom[1];
            testRandom[1]=testRandom[i];
            testRandom[i]=testRandom[0];
            heapAdjust(1,i-1);
        }
    }
//
    public void heapAdjust(int s,int t){
        testRandom[0]=testRandom[s];
        int i=s;
        int j=2*i;
        while(j<=t){
            if((j<t)&&(testRandom[j]<testRandom[j+1])){
                j=j+1;
            }
            if(testRandom[0]<=testRandom[j]){
                testRandom[i]=testRandom[j];
                i=j;
                j=2*i;
            }else break;
        }
        testRandom[i]=testRandom[0];
    }

    //二路归并排序
    public void two_MergeSort(int[] SR,int[] TR1,int s,int t){
        int m;
        int[] TR2=new int[arrayNum];//空数组存放排序好的数
        if(s==t){
            TR1[s]=SR[s];//如果一组只剩一个，则跳出递归
        }else {
            m = (s + t) / 2;
            two_MergeSort(SR,TR2, s, m);
            two_MergeSort(SR,TR2,m + 1, t);
            merge(TR2, TR1, s, m, t);
        }
    }

    public void merge(int[] SR,int[] TR,int i,int m,int n){
        int k,j,l;
            for(j=m+1,k=i;i<=m&&j<=n;k++){
                if(SR[i]<SR[j])
                    TR[k]=SR[i++];
                else TR[k]=SR[j++];
            }
            if(i<=m){
                for(l=0;l<=m-i;l++)
                    TR[k+l]=SR[i+l];
            }
            if(j<=n){
                for(l=0;l<=n-j;l++)
                    TR[k+l]=SR[j+l];
            }
    }
}
