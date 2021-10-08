package msb.class01;

/**
 * Created by lijiexi on 2021/10/8.
 */
public class BubbleSort {
    public static void main(String[] args){
        int test[] = {5,2,4,7,21,76,4};
        BubbleSort(test);
        for(int i =0;i<test.length;i++){
            System.out.print(test[i]+" ");
        }
    }

    public static void BubbleSort(int[] arr){
        //排除
        if(arr == null||arr.length<2){
            return;
        }

        //从0-N-1位置挨个比较
        for(int e = arr.length-1;e>0;e--){
            //从最左边开始
            for(int i = 0;i<e;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i+1,i);
                }
            }
        }


    }

    public static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
