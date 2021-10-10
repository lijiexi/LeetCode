package msb.class02;

/**
 * Created by lijiexi on 2021/10/9.
 * merge算法 O(nlogn)
 */
public class MergeSort {
    public static void main(String[] args){
        int test[] = {5,2,4,7,21,76,4};
        process(test,0,test.length-1);
        for(int i =0;i<test.length;i++){
            System.out.print(test[i]+" ");
        }
    }

    public static void process(int[] arr,int L,int R){
        if(L == R){
            return;
        }
        //L和R的中点
        int mid = L+((R-L)>>1);
        process(arr,L,mid);
        process(arr,mid+1,R);
        merge(arr,L,mid,R);

    }

    public static void merge(int[] arr,int L,int M,int R){
        int[] help = new int[R-L+1];
        int i = 0;
        int p1 = L;
        int p2 = M+1;
        //左边或者右边先取完
        while (p1<=M&&p2<=R){
            help[i++] = arr[p1]<=arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=M){
            help[i++] = arr[p1++];
        }
        while(p2<=R){
            help[i++] = arr[p2++];
        }
        for(i = 0;i<help.length;i++){
            arr[L+i] = help[i];
        }
    }

}
