package msb;

/**
 * Created by lijiexi on 2021/10/4.
 */
public class SelectionSort {
    public static void main(String[] args){
        int test[] = {5,2,4,7,21,76,4};
        SelectionSort(test);
    }


    public static void SelectionSort(int[] a){

        //比较位最多到数组倒数第二位
        for(int i = 0;i<a.length-1;i++){
            int minindex = i;
            //被比较位可到数组最后元素
            for(int j=i+1;j<a.length;j++){
                minindex = a[minindex]<a[j]?minindex:j;
            }
            swap(a,i,minindex);
        }
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
