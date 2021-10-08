package msb.class01;

/**
 * Created by lijiexi on 2021/10/8.
 */
public class InsertionSort {
    public static void main(String[] args){
        int test[] = {5,2,4,7,21,76,4};
        InsertionSort(test);
        for(int i =0;i<test.length;i++){
            System.out.print(test[i]+" ");
        }
    }

    public static void InsertionSort(int[] arr){
        if(arr == null||arr.length<2){
            return;
        }
        //从左到右有序,0位肯定有序
        for(int i = 1;i<arr.length;i++){

            //确保j+1的左边都比它小
            for(int j = i-1;j>=0&&arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }
    }

    public static void swap(int[] arr,int a,int b){
        arr[a] = arr[a]^arr[b];
        arr[b] = arr[a]^arr[b];
        arr[a] = arr[a]^arr[b];
    }

}
