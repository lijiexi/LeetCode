package msb.class01;

/**
 * Created by lijiexi on 2021/10/9.
 * 取得数组中最大的值
 */
public class GetMax {

    public static void main(String[] args){
        int test[] = {5,2,4,7,21,76,4};
        System.out.print(getMax(test));
    }

    public static int getMax(int[] arr){
        return process(arr,0,arr.length-1);
    }

    public static int process(int[] arr,int left,int right){
        if(left == right){
            return arr[left];
        }
        //二分法中点
        int M = left + ((right-left)>>1);
        int LeftMax = process(arr,left,M);
        int RightMax = process(arr,M+1,right);
        return  Math.max(LeftMax,RightMax);

    }
}
